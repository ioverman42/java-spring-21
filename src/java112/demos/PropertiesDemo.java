package java112.demos;

import java.io.*;
import java.util.*; //properties class be here

/**
 * Demonstrate use of peoperties class
 * @author iaoverman
 */
public class PropertiesDemo {
    /**
     * start the demo
     * @param args command line args (not used in this demo)
     */
    public static void main(String[] args) {
        PropertiesDemo demo = new PropertiesDemo();
        demo.run();
    }

    /**
     * Create propertiesw object, load properties, display properties
     * in console
     */
    public void run() {
        //instatiating a properties object
        Properties properties = new Properties();

        //loading properties (read in file, parse file, make key:values available)
        try {
            properties.load(this.getClass().getResourceAsStream("/demo.properties"));
        } catch (IOException ioException) {
            System.out.println("There was a problem reading the properties file.");
        } catch (Exception exception) {
            System.out.println("There was a problem");
        }

        // /\pass in file you want to load
        // the junk in the middle is the class path
        // the / before the properties file name is very important

        //display properties to console
        System.out.println("Author name in properties file: " + properties.getProperty("author.name"));

        //get and display all key:value pairs to console.
        Set<String> propertyNames = properties.stringPropertyNames();
        System.out.println("TRhe set of property names: " + propertyNames);

        System.out.println("\n");

        //display property name and corresponding value
        for (String key : propertyNames) {
            System.out.println("The kay is " + key + " The value is " +
                    properties.getProperty(key));
        }

    }
}
