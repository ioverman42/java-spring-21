package java112.labs2;

import java.io.*;
import java.util.*;

import java112.utilities.*;

/**
 *
 * @author iaoverman
 */
public class LabSix implements PropertiesLoader{
    /**
     * Instantiate lab, send first arg to run method.
     * @param args command line args
     */
    public static void main(String[] args) {
        LabSix lab6 = new LabSix();

        if (args.length != 1) {
            System.out.println("Please enter one command line argument");
        } else {
            //lab6.run(args[0]);
            String propertiesFilePath = args[0];
            Properties properties = lab6.loadProperties(propertiesFilePath);


            Set<String> propertyNames = properties.stringPropertyNames();

            //display property name and corresponding value
            for (String key : propertyNames) {
             System.out.println("Key: " + key + " Value: " + properties.getProperty(key));
            }
        }
    }


}
