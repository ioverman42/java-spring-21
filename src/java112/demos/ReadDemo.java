package java112.demos;
import java.io.*;

/**
 * Demo reading a text file and displaying each line to the console.
 * @author iaoverman
 */
class ReadDemo {
    /**
     * use buffered reader to read a file line by line and output each line
     * to the console
     * @param args command line arguments
     */
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        try {
            //FileReader reader = new FileReader("input.txt"); //could be any text file type
            //BufferedReader bufferedReader = new BufferedReader(reader);
            //how to do lines 16 & 17 in one:
            bufferedReader = new BufferedReader(new FileReader("input.txt")); //chained constructor

            while (bufferedReader.ready()) {
                System.out.println(bufferedReader.readLine());
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
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (Exception exception) {
                System.out.println("There was a problem closing the file");
                exception.printStackTrace();
            }
        }
    }
}
