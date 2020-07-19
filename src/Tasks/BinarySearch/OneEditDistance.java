package Tasks.BinarySearch;

/*
 * https://binarysearch.io/problems/One-Edit-Distance
 */

public class OneEditDistance {
    public static void main(String[] args) {
        String s0_0 = "quicksort";
        String s1_0 = "quicksort";

        String s0_1 = "mergesort";
        String s1_1 = "mergesorts";

        String s0_2 = "mergeport";
        String s1_2 = "mergesorts";

        System.out.println(solve(s0_0, s1_0)); // true - 0 differences
        System.out.println(solve(s0_1, s1_1)); // true - 1 difference
        System.out.println(solve(s0_2, s1_2)); // false - 2 differences
    }

    static boolean solve(String s0, String s1) {
        if (s0.equals(s1)) {
            return true;
        }
        if (Math.abs(s0.length() - s1.length()) > 1) {
            return false;
        }

        // at each point if the chars are different, simply check the remaining string
        for (int i = 0; i < Math.min(s0.length(), s1.length()); i++) {
            if (s0.charAt(i) != s1.charAt(i)) {
                return
                        // 1. after replacing current character
                        s0.substring(i + 1).equals(s1.substring(i + 1)) ||
                        // 2. after deleting 1 char
                        s0.substring(i + 1).equals(s1.substring(i)) ||
                        // 3. after adding one char
                        s0.substring(i).equals(s1.substring(i + 1));
            }
        }

        return true;
    }
}
