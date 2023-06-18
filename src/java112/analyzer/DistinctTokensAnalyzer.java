package java112.analyzer;

import java.io.*;
import java.util.*;

/**
 * Analyzes given tokens for distinct tokens.
 * @author iaoverman
 */
public class DistinctTokensAnalyzer implements TokenAnalyzer {
    // Only allowed instance variable
    private Set<String> distinctTokens = new TreeSet<String>();

    private Properties properties;

    /**
     * Empty constructor
     */
    public DistinctTokensAnalyzer() {

    }

    /**
     * Constructor with one Properties parameter
     * @param properties properties
     */
    public DistinctTokensAnalyzer(Properties properties) {
        this.properties = properties;
    }

    /**
     * Retuns distinct tokens.
     * @return distinct tokens array
     */
    public Set<String> getDistinctTokens() {
        return distinctTokens;
    }


    /**
     * Adds distinct tokens to arraylist.
     * @param token token
     */
    public void processToken(String token) {
        distinctTokens.add(token);
    }

    /**
     * Writes output file of all disinct tokens
     * @param inputFilePath  input file
     */
    public void generateOutputFile(String inputFilePath) {
        try (PrintWriter writer = new PrintWriter(new BufferedWriter(
                new FileWriter(properties.getProperty("output.directory") +
                properties.getProperty("output.file.distinct"))))) {
            for (String token : distinctTokens) {
                writer.println(token);
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("File not found");
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
