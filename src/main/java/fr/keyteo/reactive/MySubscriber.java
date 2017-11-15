package fr.keyteo.reactive;

import java.util.concurrent.Flow;
public class MySubscriber<T> implements Flow.Subscriber<T> {

    private String name;
    public MySubscriber(String nameSubscriptor){
        this.name = nameSubscriptor;
    }

    private Flow.Subscription subscription;

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        System.out.println("Subscription to "+this.name);
        this.subscription = subscription;
        subscription.request(1); //a value of  Long.MAX_VALUE may be considered as effectively unbounded
    }

    @Override
    public void onNext(T item) {

        System.out.println("Subscribtor (idThread = "+Thread.currentThread().getId()+" Name = "+this.name+" Got "+item);
        subscription.request(1); //a value of  Long.MAX_VALUE may be considered as effectively unbounded
    }

    @Override
    public void onError(Throwable t) {
        t.printStackTrace();
    }

    @Override
    public void onComplete() {
        System.out.println("Done "+this.name);
    }
}