package exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileProcessor {

	 // Method to process a file and demonstrate exception chaining
    public void processFile(String filePath) throws FileProcessingException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            // Perform file processing operations here
            String line;
            while ((line = reader.readLine()) != null) {
                // Process each line if needed
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            // Wrap FileNotFoundException in FileProcessingException and throw
            throw new FileProcessingException("File not found: " + filePath, e);
        } catch (IOException e) {
            // Handle other IO exceptions here if needed
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }

    // Example usage in main method
    public static void main(String[] args) {
        FileProcessor processor = new FileProcessor();
        String filePath = "C:\\Users\\Dell\\Downloads\\Scenario.txt";

        try {
            processor.processFile(filePath);
        } catch (FileProcessingException e) {
            // Handle FileProcessingException (with original cause)
            System.err.println("Error processing file: " + e.getMessage());
            System.err.println("Original cause: " + e.getCause().getMessage());
        }
    }
}

