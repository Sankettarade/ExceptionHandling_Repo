package exception;

import java.util.Scanner;

public class UncheckedException {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        try {
	            System.out.print("Enter dividend : ");
	            int dividend = scanner.nextInt();

	            System.out.print("Enter divisor : ");
	            int divisor = scanner.nextInt();

	            // Perform division
	            int result = divideNumbers(dividend, divisor);
	            System.out.println("Result of division : " + result);

	        } catch (ArithmeticException e) {
	            System.err.println("Error : Division by zero is not allowed.");
	        } catch (Exception e) {
	            System.err.println("Error : " + e.getMessage());
	        } finally {
	            // Close the scanner
	            scanner.close();
	        }
	    }

	    public static int divideNumbers(int dividend, int divisor) {
	        // Perform division and return the result
	        return dividend / divisor;
	    }

}
