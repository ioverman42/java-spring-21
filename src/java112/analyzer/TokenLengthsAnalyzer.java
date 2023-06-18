package java112.analyzer;

import java.io.*;
import java.util.*;

/**
 *
 * @author iaoverman
 */
public class TokenLengthsAnalyzer implements TokenAnalyzer {

    private Properties properties;

    private Map<Integer, Integer> tokenLengths;

    /**
     * Empty Constructor
     */
    public TokenLengthsAnalyzer() {
        tokenLengths = new TreeMap<Integer, Integer>();
    }

    /**
     * Constructor with one param- a properties reference.
     * @param properties
     */
    public TokenLengthsAnalyzer(Properties properties) {
        this();
        this.properties = properties;
    }

    /**
     * Return map of token lengths.
     * @return
     */
    public Map<Integer, Integer> getTokenLengths() {
        return tokenLengths;

    }
}
