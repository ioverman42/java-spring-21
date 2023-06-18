package java112.analyzer;

import java.io.*;
import java.util.*;

//import java112.utilities.*;

/**
 * LargestTokensAnalyzer checks if tokens are over a given length,
 * and if they are, adds them to an output file.
 * @author iaoverman
 */
public class LargestTokensAnalyzer implements TokenAnalyzer {
    private Properties properties;
    private Set<String> largestTokens;
    private int minimumTokenLength;

    /**
    * Empty constructor.
    */
   public LargestTokensAnalyzer() {
       largestTokens = new TreeSet<String>();
   }

   /**
    * Constructor with one parameter: a properties reference.
    * @param properties reference to properties
    */
    public LargestTokensAnalyzer(Properties properties) {
        this();
        this.properties = properties;
        minimumTokenLength = Integer.parseInt(properties.getProperty("largest.words.minimum.length"));
    }

    /**
     * Return the set of largest tokens.
     * @return largest tokens
     */
    public Set<String> getLargestTokens() {
        return largestTokens;
    }

    /**
     * Add tokens to set if they're large enough
     * @param token token
     */
    public void processToken(String token) {
        if (token.length() >= minimumTokenLength) {
            largestTokens.add(token);
        }
    }

    /**
     * Outputs the longest tokens.
     * @param inputFilePath the input file path
     */
    public void generateOutputFile(String inputFilePath) {
        try (PrintWriter writer = new PrintWriter(new BufferedWriter(
                new FileWriter(properties.getProperty("output.directory") +
                properties.getProperty("output.file.largest.words"))))) {
            for (String token : largestTokens) {
                writer.println(token);
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("File " + inputFilePath + "not found");
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            System.out.println("IO Exception");
            ioException.printStackTrace();
        } catch (Exception exception) {
            System.out.println("There was a problem");
            exception.printStackTrace();
        }
    }
}
