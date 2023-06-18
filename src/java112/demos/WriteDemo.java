package java112.demos;

import java.io.*;

/**
 * Writer demo
 * @author iaoverman
 */
public class WriteDemo {
    /**
     * create a file, write to the file
     * @param args cmd ln args
     */
    public static void main(String[] args) {
        PrintWriter writer = null;

        try {
            writer = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
            writer.println("First line in the output file");
            writer.println("and a second line");
        } catch (IOException ioException) {
            System.out.println("There was a problem writing the file");
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
