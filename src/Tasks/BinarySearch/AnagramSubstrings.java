package Tasks.BinarySearch;

/*
 * https://binarysearch.io/problems/Anagram-Substrings
 */

import java.util.Arrays;

public class AnagramSubstrings {
    public static void main(String[] args) {
        String s0_0 = "abc";
        String s1_0 = "bcabxabc";

        System.out.println(solve(s0_0, s1_0)); // 3
    }
    private static int solve(String s0, String s1) {
        System.out.println("-----------------------------------");
        char[] s0_array = s0.toCharArray();
        Arrays.sort(s0_array);

        int count = 0;

        System.out.println("For comparison: " + Arrays.toString(s0_array));

        for (int i = 0; i <= s1.length() - s0.length(); i++) {
            char[] s1_temp_array = s1.substring(i, i + s0.length()).toCharArray();
            Arrays.sort(s1_temp_array);

            System.out.println("Current string: " + Arrays.toString(s1_temp_array));

            if (Arrays.equals(s0_array, s1_temp_array)) {
                count++;
            }
        }
        return count;
    }
}
