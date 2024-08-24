import java.security.SecureRandom;

public class PasswordGenerator {

    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String NUMBERS = "0123456789";
    private static final String SPECIAL_CHARACTERS = "!@#$%^&*()-_=+[]{}|;:'\",.<>/?";

    public static String generatePassword(int length) {
        StringBuilder password = new StringBuilder();
        SecureRandom random = new SecureRandom();

        // Ensure the password has at least one character from each category
        password.append(getRandomCharacter(UPPERCASE, random));
        password.append(getRandomCharacter(LOWERCASE, random));
        password.append(getRandomCharacter(NUMBERS, random));
        password.append(getRandomCharacter(SPECIAL_CHARACTERS, random));

        // Fill the rest of the password with random characters
        for (int i = 4; i < length; i++) {
            String characterSet = getRandomCharacterSet(random);
            password.append(getRandomCharacter(characterSet, random));
        }

        // Shuffle the password to randomize the order
        char[] passwordArray = password.toString().toCharArray();
        for (int i = passwordArray.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            char temp = passwordArray[index];
            passwordArray[index] = passwordArray[i];
            passwordArray[i] = temp;
        }

        return new String(passwordArray);
    }

    private static char getRandomCharacter(String characterSet, SecureRandom random) {
        int index = random.nextInt(characterSet.length());
        return characterSet.charAt(index);
    }

    private static String getRandomCharacterSet(SecureRandom random) {
        int choice = random.nextInt(3);
        switch (choice) {
            case 0:
                return UPPERCASE;
            case 1:
                return LOWERCASE;
            case 2:
                return NUMBERS;
            default:
                return SPECIAL_CHARACTERS;
        }
    }

    public static void main(String[] args) {
        int passwordLength = 12; // Change this to your desired password length
        String generatedPassword = generatePassword(passwordLength);
        System.out.println("Generated Password: " + generatedPassword);
    }
}
