package lambda;


import java.util.function.Consumer;

public class Start2 {


    public static void main(String[] args) throws InterruptedException {

        NameParser<Name> parser = new NameParser<>();
        Name res = parser.parse("Eric Clapton", (s1, s2) -> {
                    System.out.println(s1);
                    System.out.println(s2);
                    return new Name(s1, s2);
                }
        );
        System.out.println(res.getFirstName() + " " + res.getLastName());



        NameSyso parserLambda = new NameSyso();
        parserLambda.parse("Eric Clapton", (s1, s2) -> {
                    System.out.println("Fait ce que tu veux !! "+s1);
                    System.out.println("Fait ce que tu veux !! "+s2);
                }
        );

    }
}
