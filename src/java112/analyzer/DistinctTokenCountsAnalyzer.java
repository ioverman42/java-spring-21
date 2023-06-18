package java112.analyzer;

import java.io.*;
import java.util.*;

//import java112.utilities.*;

/**
 * DistinctTokensCountsAnalyzer gets the counts of each disinct token
 * and outputs the token and its counts to a file.
 * @author iaoverman
 */
public class DistinctTokenCountsAnalyzer implements TokenAnalyzer {
    private Properties properties;
    private Map<String, Integer> distinctTokenCounts;

    /**
     * Empty constructor
     */
    public DistinctTokenCountsAnalyzer() {
        distinctTokenCounts = new TreeMap<String, Integer>();
    }

    /**
     * one arg constructor: parameters
     */
    public DistinctTokenCountsAnalyzer(Properties properties) {
        this();
        this.properties = properties;

    }

    /**
     * returns counts of disinct tokens
     * @return counts of distinct tokens
     */
    public Map<String, Integer> getDistinctTokenCounts() {
        return distinctTokenCounts;
    }

    /**
     * Add token and count to treemap.
     * @param token token to be added
     */
    public void processToken(String token) {
        int count = 0;
        int newcount = 0;
        if (distinctTokenCounts.containsKey(token)) {
            count = distinctTokenCounts.get(token);
            newcount = count + 1;
        } else {
            newcount = 1;
        }

        distinctTokenCounts.put(token, newcount);
    }

    /**
     * Writes output file of distinct tokens and the number of times they appear.
     * @param inputfile input file path
      */
    public void generateOutputFile(String inputfile) {
        try (PrintWriter writer = new PrintWriter(new BufferedWriter(
                new FileWriter((properties.getProperty("output.directory") +
                properties.getProperty("output.file.distinct.counts")))))) {
            for (Map.Entry<String, Integer> entry : distinctTokenCounts.entrySet()) {
                writer.println(entry.getKey() + "\t" + entry.getValue());
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("File " + inputfile + "not found");
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
