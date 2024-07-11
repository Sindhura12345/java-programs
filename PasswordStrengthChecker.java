import java.util.Scanner;
import java.util.regex.Pattern;

public class PasswordStrengthChecker {

    // Method to check the strength of the password
    public static int checkPasswordStrength(String password) {
        int requirementsNotMet = 0;

        // Check for minimum length
        if (password.length() < 8) {
            requirementsNotMet++;
        }

        // Check for at least one uppercase letter
        if (!Pattern.compile("[A-Z]").matcher(password).find()) {
            requirementsNotMet++;
        }

        // Check for at least one lowercase letter
        if (!Pattern.compile("[a-z]").matcher(password).find()) {
            requirementsNotMet++;
        }

        // Check for at least one special character
        if (!Pattern.compile("[^a-zA-Z0-9]").matcher(password).find()) {
            requirementsNotMet++;
        }

        // Check for at least one number
        if (!Pattern.compile("[0-9]").matcher(password).find()) {
            requirementsNotMet++;
        }

        return requirementsNotMet;
    }

    // Main method to test the password strength checker
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        int missingRequirements = checkPasswordStrength(password);

        System.out.println("Number of requirements not met: " + missingRequirements);

        scanner.close();
    }
}
