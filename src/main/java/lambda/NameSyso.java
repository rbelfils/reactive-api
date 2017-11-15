package lambda;

import java.util.function.Consumer;

public class NameSyso {
    public  void parse(String name, MyEmptyLambda myEmptyLambda) {
        String[] tokens = name.split(" ");
        String firstName = tokens[0];
        String lastName = tokens[1];
        myEmptyLambda.parse(firstName,lastName);
    }
}


