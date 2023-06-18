package java112.analyzer;

import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;

/**
 * Counts tokens, creates summary file.
 * @author iaoverman
 */
public class FileSummaryAnalyzer implements TokenAnalyzer {
    // Only allowed instance variable
    private int totalTokensCount;

    private Properties properties;

    /**
     * Empty constructor
     */
    public FileSummaryAnalyzer() {

    }

    /**
     * Constructor with one Properties parameter
     * @param properties properties
     */
    public FileSummaryAnalyzer(Properties properties) {
        this.properties = properties;
    }

    /**
     * Retuns total count of tokens.
     * @return total tokens count
     */
    public int getTotalTokensCount() {
        return totalTokensCount;
    }

    /**
     * Writes output summary file.
     * @param inputFile input file
     */
    public void generateOutputFile(String inputFile) {
        File file = new File(inputFile);
        long fileSize = file.length();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss z y");

        try (
                PrintWriter writer = new PrintWriter(new BufferedWriter(
                        new FileWriter(properties.getProperty("output.directory") +
                        properties.getProperty("output.file.summary"))))
            )
        {
            writer.println("Application: " + properties.getProperty("application.name"));
            writer.println("Author: " + properties.getProperty("author"));
            writer.println("Author Email: " + properties.getProperty("author.email.address"));
            writer.println("File: " + file.getAbsolutePath());
            writer.println("Date of Analysis: " + new Date());
            writer.println("Last Modiefied: " + simpleDateFormat.format(file.lastModified()));
            writer.println("File Size: " + file.length());
            writer.println("File URI: " + file.toURI());
            writer.println("Total Tokens: " + getTotalTokensCount());

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

    /**
     * Counts total number of tokens
     * @param token token
     */
    public void processToken(String token) {
        totalTokensCount ++;
    }
}
