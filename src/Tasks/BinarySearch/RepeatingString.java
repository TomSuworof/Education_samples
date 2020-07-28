package Tasks.BinarySearch;

/*
 * https://binarysearch.io/problems/Repeating-String
 */

import java.util.Arrays;

public class RepeatingString {
    public static void main(String[] args) {
        String s0 = "dogdogdog";
        String s1 = "dogcat";

        System.out.println(solve(s0)); // true
        System.out.println(solve(s1)); // false
    }

    private static boolean solve(String s) {
        // 1st case: "dogdogdog" in "og[dogdogdog]dogdo"
        // 2nd case: "dogcat' in "ogcatdogca" - can not find
        return (s.substring(1) + s.substring(0, s.length() - 1)).contains(s);
    }
}
