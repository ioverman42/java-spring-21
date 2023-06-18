package java112.labs1;

import java.util.*;
import java.io.*;

/**
 * working with lists
 * @author iaoverman
 */
public class LabSeven {
    List<String> list;

    /**
     * instantiates and runs run method
     * @param args command line arguments
     */
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please enter one argument on the command line, an output file name");
        } else {
            LabSeven lab7 = new LabSeven();
            lab7.run(args[0]);
        }
    }

    /**
     * add to ArrayList
     * @param outputFile output file name
     */
    public void run(String outputFile) {
        list = new ArrayList<String>();

        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("six");
        list.add("seven");
        list.add("eight");
        list.add("nine");
        list.add("ten");

        writeListToOutputFile(outputFile);
    }

    /**
     * writes list to output file
     * @param output output file name
     */
    public void writeListToOutputFile(String output) {
        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(output))))
        {
            for (String element : list) {
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
