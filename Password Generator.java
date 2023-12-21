import java.security.SecureRandom;
import java.util.Scanner;

public class PasswordGenerator {
    private static final String LOWER_CASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPER_CASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITS = "0123456789";
    private static final String SYMBOLS = "!@#$%^&*_=+-/.?<>)";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Password Length: ");
        int length = scanner.nextInt();
        System.out.println("Include Uppercase letters? (Y/N): ");
        boolean useUpperCase = scanner.next().equalsIgnoreCase("Y");
        System.out.println("Include Lowercase letters? (Y/N): ");
        boolean useLowerCase = scanner.next().equalsIgnoreCase("Y");
        System.out.println("Include Digits? (Y/N): ");
        boolean useDigits = scanner.next().equalsIgnoreCase("Y");
        System.out.println("Include Symbols? (Y/N): ");
        boolean useSymbols = scanner.next().equalsIgnoreCase("Y");

        String password = generatePassword(length, useUpperCase, useLowerCase, useDigits, useSymbols);
        System.out.println("Generated Password: " + password);

        scanner.close();
    }

    public static String generatePassword(int length, boolean useUpperCase, boolean useLowerCase,
                                          boolean useDigits, boolean useSymbols) {
        StringBuilder password = new StringBuilder();
        SecureRandom random = new SecureRandom();
        String characters = "";

        if (useUpperCase) {
            characters += UPPER_CASE;
        }
        if (useLowerCase) {
            characters += LOWER_CASE;
        }
        if (useDigits) {
            characters += DIGITS;
        }
        if (useSymbols) {
            characters += SYMBOLS;
        }

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(characters.length());
            password.append(characters.charAt(randomIndex));
        }

        return password.toString();
    }
}
