package java112.labs1;

import java.io.*;

/**
 * Lab Six: input and output, readign and writing files
 * @author iaoverman
 */
public class LabSix {
    /**
     * main method for lab6
     * @param args command line arguments
     */
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please enter two arguments on the command line, an input file name and an output file name");
        } else {
            LabSix lab6 = new LabSix();
            lab6.run(args[0], args[1]);
        }
    }

/**
 * lab 6 run method
 * @param inputFile  input file path
 * @param outputFile output file path
 */
    public void run(String inputFile, String outputFile) {
        //this is the try-with-resources syntax which is available for java 7 +
        try (
                BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(outputFile)))
            )
        {
            while (reader.ready()) {
                //writper.println(reader.readLine());
                //to replace the following two lines with one
                writer.write(reader.readLine());
                writer.write("\n");
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
