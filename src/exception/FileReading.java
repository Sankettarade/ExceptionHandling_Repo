package exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {

	 public static void main(String[] args) {
	        // Define the path to the file
	        String filePath = "C:\\Users\\Dell\\Downloads\\Scenario.txt";

	        // Using try-with-resources to automatically close resources
	        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
	            String line;
	            // Read and print each line from the file
	            while ((line = reader.readLine()) != null) {
	                System.out.println(line);
	            }
	        } catch (IOException e) {
	            System.err.println("Error reading the file: " + e.getMessage());
	        }
	    }
	 
}
