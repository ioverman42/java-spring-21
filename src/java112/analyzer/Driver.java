package java112.analyzer;

import java.io.*;

/**
 * Starts Analyzer the Great.
 * @author iaoverman
 */
public class Driver {
    /**
     * Instantiate main processing class. Call main processing method.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        FileAnalysis analyzerTheGreat = new FileAnalysis();
        analyzerTheGreat.analyze(args);
    }
}
