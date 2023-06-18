package java112.demos;

import java.util.*;

/**
 * demo using set interface and hashset concrete class
 * @author iaoverman
 */
public class SetDemo {
    /**
     * instantiate and play demo method
     * @param args command line args - not used in this case
     */
    public static void main(String[] args) {
        SetDemo demo = new SetDemo();
        demo.run();
    }

    /**
     * create a set, add strings, and display it
     */
    public void run() {
        Set<String> set = new HashSet<String>();

        set.add("a");
        set.add("few");
        set.add("few");
        set.add("things");
        set.add("here");
        set.add("doobee");

        System.out.println(set);

        for (String element : set) {
            System.out.println("The element is: " + element);
        }
    }
}
