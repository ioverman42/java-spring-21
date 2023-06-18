package java112.project3;

import java.io.*;
import java.util.*;

public class Question4 {
    public static void main(String[] args) {
        apppendFinalLine();
    }

    public void apppendFinalLine() {
        String outputPath = "/home/student/output/output.txt";

        try (
                FileWriter writer = new FileWriter(new File(outputPath), true);
            )
        {
            writer.write("The final line.");
            writer.close();
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
