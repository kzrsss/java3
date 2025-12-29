package exceptions;

// Exception handling example
public class ExceptionExample {

    // Method that may cause exception
    static void divide(int a, int b) {

        try {
            // Risky code
            int result = a / b;
            System.out.println("Result : " + result);

        } catch (ArithmeticException e) {
            // Handles divide by zero error
            System.out.println("Error: Cannot divide by zero");

        } finally {
            // Always executed
            System.out.println("Division operation completed");
        }
    }

    public static void main(String[] args) {

        /*
         ================= EXCEPTION HANDLING RULES =================

         1. Exception is an abnormal condition during program execution

         2. Exception handling prevents program crash

         3. try block contains risky code

         4. catch block handles the exception

         5. finally block always executes (optional)

         6. Multiple catch blocks are allowed

         7. Checked exceptions are checked at compile time
            → Example: IOException

         8. Unchecked exceptions occur at runtime
            → Example: ArithmeticException, NullPointerException

         =============================================================
        */

        // Calling method with valid values
        divide(10, 2);

        System.out.println(" ");

        // Calling method with invalid value (exception)
        divide(10, 0);
    }
}
