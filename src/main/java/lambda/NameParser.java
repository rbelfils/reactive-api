package lambda;

public class NameParser<T> {
    public  T parse(String name, Creator<T> creator) {
        String[] tokens = name.split(" ");
        String firstName = tokens[0];
        String lastName = tokens[1];
        return creator.create(firstName, lastName);
    }
}


