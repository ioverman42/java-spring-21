package java112.demos;

import java.io.*;
import java.util.*;

/**
 * Demo use of Map interface, specifically HashMap class
 * @author iaoverman
 */
public class MapDemo {
    /**
     * Start the demo
     * @param args command line args
     */
    public static void main(String[] args) {
        MapDemo demo = new MapDemo();
        demo.run();
    }

    /**
     * Create hashmap object, add key/value pairs, and display
     */
    public void run() {
        //create hashmap object
        Map<Integer, String> myMap = new HashMap<Integer, String>();
        //hashmap is NOT sorted, treeMap is
        myMap.put(2, "two");
        myMap.put(3, "three");
        myMap.put(1, "dinosaur");

        System.out.println(myMap); //mostly for debugging, iterating over the map is better

        for (Map.Entry<Integer, String> entry : myMap.entrySet()) { //entry set returns a set of Map.Entry which is a key:value pair
            // /\ note matching <> contents this and map in question
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
    }
}
