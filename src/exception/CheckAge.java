package exception;

import java.util.Scanner;

public class CheckAge {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        try {
	            // Enter age
	            System.out.print("Enter your age: ");
	            int age = scanner.nextInt();

	            // Check if age is less than 18
	            if (age < 18) {
	                // Throw custom exception if age is less than 18
	                throw new InvalidAgeException("Age must be 18 or older.");
	            }

	            // If age is valid, display a message
	            System.out.println("Age is valid.");

	        } catch (InvalidAgeException e) {
	            // Catch and handle the custom exception
	            System.err.println("Invalid Age: " + e.getMessage());
	        } catch (Exception e) {
	            // Catch any other unexpected exceptions
	            System.err.println("Error: " + e.getMessage());
	        } finally {
	            // Close the scanner
	            scanner.close();
	        }
	    }
	 
}
