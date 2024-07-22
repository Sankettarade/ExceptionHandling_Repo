package exception;

public class RethrowException {

	 // Method that throws an exception
    public void throwException() throws IllegalArgumentException {
        try {
            // Simulate an error condition
            int result = 10 / 0; // This will cause ArithmeticException
        } catch (ArithmeticException e) {
            // Wrap the caught exception into IllegalArgumentException with additional context
            throw new IllegalArgumentException("Error occurred while performing division", e);
        }
    }

    // Method that catches and rethrows the exception with improved context
    public void processWithImprovedContext() {
        try {
            throwException();
        } catch (IllegalArgumentException e) {
            // Add additional context information
            String additionalInfo = "Additional context: Unable to process data due to division error.";
            // Rethrow the exception with improved context
            throw new IllegalArgumentException(additionalInfo, e);
        }
    }

    // Example usage in main method
    public static void main(String[] args) {
    	RethrowException exception = new RethrowException();

        try {
        	exception.processWithImprovedContext();
        } catch (IllegalArgumentException e) {
            // Print the stack trace for the rethrown exception
            e.printStackTrace();
        }
    }
}
