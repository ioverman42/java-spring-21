package java112.labs2;

import java.io.*;
import java.util.*;

/**
 *
 * @author iaoverman
 */
public class LabThree {
    /**
     * Instantiate lab, send first arg to run method.
     * @param args command line args
     */
    public static void main(String[] args) {
        LabThree lab3 = new LabThree();

        if (args.length != 1) {
            System.out.println("Please enter one command line argument");
        } else {
            lab3.run(args[0]);
        }
    }

    /**
     * loads properties file
     * @param propertiesFilePath path to properties file
     */
    public void loadProperties(String propertiesFilePath) {
        Properties properties = new Properties();

        try {
            properties.load(this.getClass().getResourceAsStream(propertiesFilePath));
        } catch(IOException ioe) {
            System.out.println("Can't load the properties file");
            ioe.printStackTrace();
        } catch(Exception e) {
            System.out.println("Problem: " + e);
            e.printStackTrace();
        }

        //get and display all key:value pairs to console.
        Set<String> propertyNames = properties.stringPropertyNames();

        //display property name and corresponding value
        for (String key : propertyNames) {
            System.out.println("Key: " + key + " Value: " + properties.getProperty(key));
        }

    }

    /**
     * [run description]
     * @param path propeties file path from first arg
     */
    public void run(String path) {
        String propertiesFilePath = path;

         loadProperties(propertiesFilePath);

    }


}
