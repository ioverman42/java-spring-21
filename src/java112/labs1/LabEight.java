package java112.labs1;

import java.util.*;
import java.io.*;

/**
 * Working with sets for the first time.
 * @author iaoverman
 */
public class LabEight {
    Set<String> set;

    /**
     * cheskcs for one argument on command line
     * @param args command line arguments
     */
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please enter one argument on the command line, an output file name");
        } else {
            LabEight lab8 = new LabEight();
            lab8.run(args[0]);
        }
    }

    /**
     * Instantiates and populates set and calls next method.
     * @param outputFile name of output file
     */
    public void run(String outputFile) {
        set = new TreeSet<String>();

        set.add("one");
        set.add("one");
        set.add("five");
        set.add("two");
        set.add("four");
        set.add("two");
        set.add("three");
        set.add("three");
        set.add("four");
        set.add("three");

        writeSetToOutputFile(outputFile);
    }

    /**
     * writes output of set to file
     * @param output output file name
     */
    public void writeSetToOutputFile(String output) {
        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(output))))
        {
            for (String element : set) {
                writer.println(element);
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("File was not found");
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            System.out.println("Could not read and/or write to file");
            ioException.printStackTrace();
        } catch (Exception exception) {
            System.out.println("There was a problem");
            exception.printStackTrace();
        }
    }
}
