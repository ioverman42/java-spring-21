package java112.labs2;

import java.io.*;
import java.util.*;

/**
 * lab4
 * @author iaoverman
 */
public class LabTwoFour {
    Map<String, Integer> map;
    Map<String, Map> map2;

    /**
     * starts things running
     * @param args command line args
     */
    public static void main(String[] args) {
        LabTwoFour lab4 = new LabTwoFour();
        lab4.run();
    }

    /**
     * [run description]
     */
    public void run() {
        map = new HashMap<String, Integer>();

        map.put("one", 1);
        map.put("two", 2);
        map.put("ten", 10);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }

        boolean containsKeyThree = map.containsKey("Three");
        if (containsKeyThree == true) {
            System.out.println("Key: Three Value: " + map.get("Three"));
        } else {
            System.out.println("Error: no key of 'Three' found in map");
        }

        //treeMap
        map2 = new TreeMap<String, Map>();

        //map2.put("hashmap", map);

        System.out.println(map2);
    }
}
