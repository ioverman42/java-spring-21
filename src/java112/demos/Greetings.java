package java112.demos;

/**
 * @author Eric Knapp
 * class Greetings
 */
public class Greetings implements GreetingInterface {

    public static void main(String[] args) {
        Greetings greeting = new Greetings();
        System.out.println(greeting.createGreeting("Isabel", "Salutations,"));
    }

}
