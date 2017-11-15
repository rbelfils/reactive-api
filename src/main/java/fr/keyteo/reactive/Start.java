package fr.keyteo.reactive;

import java.util.Arrays;
import java.util.concurrent.SubmissionPublisher;

public class Start {


    public static void main(String[] args) throws InterruptedException {

        System.out.println("ID Main Thread !!"+Thread.currentThread().getId());
        //Create Publisher
        SubmissionPublisher<String> publisher = new SubmissionPublisher<>();

        //Register Subscriber
        MySubscriber<String> subscriberA = new MySubscriber<>("A");
        MySubscriber<String> subscriberB = new MySubscriber<>("B");

        publisher.subscribe(subscriberB);
        publisher.subscribe(subscriberA);

        //Publish items
        System.out.println("Publishing Items...");
        String[] items = {"1", "x", "2", "x", "3", "x"};
        Arrays.asList(items).stream().forEach(
                (i) ->{
                    publisher.submit(i);
                }

        );

        publisher.close();
        Thread.sleep(1000);

    }
}
