package exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {

	public static void main(String[] args) {
		
		// Define the path to the file
        String filePath = "C:\\Users\\Dell\\Downloads\\Scenario.txt";
        BufferedReader reader = null;

        try {
            // Open the file
            reader = new BufferedReader(new FileReader(filePath));

            // Read and print each line from the file
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            // Handle IOException if it occurs
            System.err.println("Error reading the file: " + e.getMessage());
        } finally {
            // Reader is closed properly in all cases
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.err.println("Error closing the file: " + e.getMessage());
            }
        }

	}

}

