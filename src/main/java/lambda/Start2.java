package lambda;


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
    }
}
