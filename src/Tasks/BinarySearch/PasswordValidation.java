package Tasks.BinarySearch;

/*
 * https://binarysearch.io/problems/Password-Validation
 */

public class PasswordValidation {
    public static void main(String[] args) {
        String password0 = "aA0@1234";
        String password1 = "AA0@1234";
        String password2 = "aA@1234";
        String password3 = "0E>e,aTNKP";

        System.out.println(solve(password0)); // true
        System.out.println(solve(password1)); // false
        System.out.println(solve(password2)); // false;
        System.out.println(solve(password3)); // true
    }

    private static boolean solve(String password) {
        if (password.length() > 20 || password.length() < 8) {
            return false;
        }
        String numbers = "0123456789";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String specials = "!\"#$%&\\'()*+,-./:;<=>?@[]^_`{|}~";
        String valid = numbers + alphabet + alphabet.toUpperCase() + specials;

        boolean hasNumber = false, hasLowerCase = false, hasUpperCase = false, hasSpecial = false, hasNoMore = false;

        for (char letter : password.toCharArray()) {
            if (numbers.contains(String.valueOf(letter))) {
                hasNumber = true;
            }
            if (alphabet.toLowerCase().contains(String.valueOf(letter))) {
                hasLowerCase = true;
            }
            if (alphabet.toUpperCase().contains(String.valueOf(letter))) {
                hasUpperCase = true;
            }
            if (specials.contains(String.valueOf(letter))) {
                hasSpecial = true;
            }
            if (!valid.contains(String.valueOf(letter))) {
                return false;
            }
        }
        return hasNumber && hasLowerCase && hasUpperCase && hasSpecial;
    }
}
