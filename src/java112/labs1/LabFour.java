package java112.labs1;

import java.io.*;

/**
 * Lab Four: reading a file line by line
 * @author iaoverman
 */
public class LabFour {
    /**
     * lab 4 main method
     * @param args command line args
     */
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please enter one argument on the command line");
        } else {
            LabFour lab4 = new LabFour();
            lab4.run(args[0]);
        }
    }

    /**
     * run method opens, reads, and outputs each line of a given file
     * @param file file name
     */
    public void run(String file) {
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(file));
            while (reader.ready()) {
                System.out.println(reader.readLine());
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("File was not found");
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            System.out.println("File could not be read");
            ioException.printStackTrace();
        } catch (Exception exception) {
            System.out.println("There was a problem");
            exception.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (Exception exception) {
                System.out.println("There was a problem closing the file");
                exception.printStackTrace();
            }
        }
    }
}
