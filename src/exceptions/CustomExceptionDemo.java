package exceptions;

public class CustomExceptionDemo {

    // Method that throws exception
    static void checkAge(int age) throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        } else {
            System.out.println("Age is valid");
        }
    }

    public static void main(String[] args) {

        /*
         ================= CUSTOM EXCEPTION RULES =================

         1. Custom exception must extend Exception class

         2. throw keyword is used to throw exception manually

         3. throws keyword is used in method signature

         4. Checked exceptions must be handled using try-catch

         ============================================================
        */

        try {
            checkAge(16);
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
