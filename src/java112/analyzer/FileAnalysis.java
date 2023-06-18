package java112.analyzer;

import java.io.*;
import java.lang.*;
import java.util.*;

import java112.utilities.*;

/**
 * Calls token processing methods.
 * @author iaoverman
 */
public class FileAnalysis implements PropertiesLoader {
    final int VALID_ARGUMENT_COUNT = 2;

    ArrayList<TokenAnalyzer> listTokenAnalyzer;

    //Properties properties;

    /**
     * main processing methods
     * @param args command line arguments
     */
    public void analyze(String[] args) {
        Properties properties = null;

        if (args.length != VALID_ARGUMENT_COUNT) {
            System.out.println("Please enter one argument on the command line");
            System.out.println(args.length);
        } else {
            try {
                properties = loadProperties(args[1]);
            } catch (Exception exception) {
                System.out.println("There was a problem loading the properties file");
                exception.printStackTrace();
            }
            //analyzing method calls go here
            instantiateClasses(properties);
            run(args[0]);
            writeOutputFiles(args[0]);
        }
    }

    /**
     * Instatiates analyzer classes.
     */
    public void instantiateClasses(Properties properties) {
        listTokenAnalyzer = new ArrayList<TokenAnalyzer>();

        //System.out.println("FileAnalysis properties: " + properties);

        listTokenAnalyzer.add(new FileSummaryAnalyzer(properties));
        listTokenAnalyzer.add(new DistinctTokensAnalyzer(properties));
        listTokenAnalyzer.add(new LargestTokensAnalyzer(properties));
        listTokenAnalyzer.add(new DistinctTokenCountsAnalyzer(properties));
    }

    /**
     * Reads input file.
     * @param inputFile input file
     */
    public void run(String inputFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            while (reader.ready()) {
                String line = reader.readLine();
                getAllTokens(line);

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

    /**
     * Gets all tokens from line.
     * @param line line from buffered reader
     */
    public void getAllTokens(String line) {
        String[] tokenArray = line.split("\\W");
        removeBlankTokens(tokenArray);
    }

    /**
     * Removes blank tokens and passes tokens on for analysis.
     * @param tokenArray array of tokens from line
     */
    public void removeBlankTokens(String[] tokenArray) {
        for (String token : tokenArray) {
            if (!token.isBlank()) {
                processToken(token);
            }
        }
    }

    /**
     * Process token from listTokenAnalyzer.
     * @param token token to be processed
     */
    public void processToken(String token) {
        for (TokenAnalyzer analyzer : listTokenAnalyzer) {
            analyzer.processToken(token);
        }
    }

    /**
     * Calls methods to generate output files for analyzers.
     * @param inputpath input file
     */
    public void writeOutputFiles(String inputpath) {
        for (TokenAnalyzer analyzer : listTokenAnalyzer) {
            analyzer.generateOutputFile(inputpath);
        }
    }

}
