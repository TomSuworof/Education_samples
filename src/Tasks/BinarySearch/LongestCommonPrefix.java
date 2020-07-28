package Tasks.BinarySearch;

/*
 * https://binarysearch.io/problems/Longest-Common-Prefix
 */

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] words0 = {"anthony", "ant", "antigravity"};

        System.out.println(solve(words0)); // ant
    }

    private static String solve(String[] words) {
        String ans = "";
        boolean all_have = true;
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));
        for (int i = 0; i < words[0].length(); i++) {
            char curr_letter = words[0].charAt(i);
            for (String word : words) {
                if (word.charAt(i) != curr_letter) {
                    all_have = false;
                    break;
                }
            }
            if (all_have) {
                ans += curr_letter;
            } else {
                break;
            }
        }

        return ans;
    }
}
