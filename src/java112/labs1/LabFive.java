package java112.labs1;

import java.io.*;

/**
 * Lab 5: outputting given text to a file
 * @author iaoverman
 */
public class LabFive {
    /**
     * [main description]
     * @param args command line arguments
     */
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please enter two arguments on the command line, a file name and a message");
        } else {
            LabFive lab5 = new LabFive();
            lab5.run(args[0], args[1]);
        }
    }

    /**
     * run method
     * @param file    output file name
     * @param message message to be output
     */
    public void run(String file, String message) {
        BufferedWriter writer = null;

        try {
            writer = new BufferedWriter(new FileWriter(file));
            writer.write(message);

        } catch (IOException ioException) {
            System.out.println("Could not read and/or write to file");
            ioException.printStackTrace();
        } catch (Exception exception) {
            System.out.println("There was a problem");
            exception.printStackTrace();
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (Exception exception) {
                System.out.println("There was a problem closing the file");
                exception.printStackTrace();
            }
        }
    }
}
