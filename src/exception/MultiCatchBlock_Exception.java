package exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MultiCatchBlock_Exception {

	// Method to process a file and throw IOException or IllegalArgumentException
    public void processFile(String filePath) throws IOException, IllegalArgumentException {
        if (filePath == null || filePath.isEmpty()) {
            throw new IllegalArgumentException("File path cannot be null or empty.");
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Process each line if needed
                System.out.println(line);
            }
        }
    }

    // Example usage in main method
    public static void main(String[] args) {
    	MultiCatchBlock_Exception processor = new MultiCatchBlock_Exception();
        String filePath1 = "C:\\Users\\Dell\\Downloads\\Scenario.txt";   // Valid file path
        String filePath2 = null; // Invalid file path

        // Example 1: Handling IOException and IllegalArgumentException
        System.out.println("Example 1: Handling IOException and IllegalArgumentException");
        try {
            processor.processFile(filePath1); // Valid file path
            processor.processFile(filePath2); // Invalid file path
        } catch (IOException | IllegalArgumentException e) {
            System.err.println("Error processing file: " + e.getMessage());
        }
    }
}
