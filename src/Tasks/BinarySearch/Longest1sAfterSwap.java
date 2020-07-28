package Tasks.BinarySearch;

/*
 * https://binarysearch.io/problems/Longest-1s-after-one-swap
 */

public class Longest1sAfterSwap {
    public static void main(String[] args) {
        String s0 = "0111011101";
        String s1 = "1";
        String s2 = "10";

        System.out.println(solve(s0)); // 7
        System.out.println(solve(s1)); // 1
        System.out.println(solve(s2)); // 1
    }

    private static int solve(String s) {
        int prev = 0, ans = 0;
        for (String sub : s.split("0")) {
            int n = sub.length();
            ans = Math.max(ans, prev + n + 1);
            // max of two chunks with 1s. + 1, because we swap it from somewhere
            prev = n;
        }
        return Math.min(ans, count1(s.toCharArray()));
        // this is for edge case, when we do not have 1s
    }

    private static int count1(char[] array) {
        int count = 0;
        for (char c : array) {
            if (c == '1') {
                count++;
            }
        }
        return count;
    }
}

