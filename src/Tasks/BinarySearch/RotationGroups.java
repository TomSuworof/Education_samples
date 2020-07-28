package Tasks.BinarySearch;

/*
 * https://binarysearch.io/problems/Rotation-Groups
 */

import java.util.HashSet;

public class RotationGroups {
    public static void main(String[] args) {
        String[] words0 = {"abc", "xy", "yx", "z", "bca"};

        System.out.println(solve(words0));
        /*
        3 since we have
        ["abc", "bca"]
        ["xy", "yx"]
        ["z"]
        */
    }

    private static int solve(String[] words) {
        HashSet<String> s = new HashSet<>();
        int ans = 0;
        for (String word : words) {
            if (!s.contains(word)) {
                ans++;
            }
            for (int i = 0; i < word.length(); i++) {
                s.add(word.substring(i) + word.substring(0, i));
            }
            System.out.println(s.toString());
        }

        return ans;
    }
}
