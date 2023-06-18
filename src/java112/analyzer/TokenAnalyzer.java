package java112.analyzer;

/**
 * Interface
 * @author iaoverman
 */
public interface TokenAnalyzer {
    /**
     * Processes token.
     * @param token token
     */
    void processToken(String token);

    /**
     * Generates output file
     * @param inputFilePath  input file path
     */
    void generateOutputFile(String inputFilePath);
}
