package Tasks.BinarySearch;

/*
 * https://binarysearch.io/problems/Interleaved-String
 */

public class InterleavedString {
    public static void main(String[] args) {
        String s0_0 = "abc";
        String s1_0 = "xyz";

        String s0_1 = "abc";
        String s1_1 = "x";

        System.out.println(solve(s0_0, s1_0)); // axbycz
        System.out.println(solve(s0_1, s1_1)); // axbc
    }

    private static String solve(String s0, String s1) {
        String ans = "";

        char[] first = s0.toCharArray();
        char[] second = s1.toCharArray();

        int stoppedAt = Math.min(first.length, second.length);

        for (int i = 0; i < stoppedAt; i++) {
            ans += first[i];
            ans += second[i];
        }

        System.out.println(ans + " " + stoppedAt);

        if (stoppedAt < first.length) {
            ans += s0.substring(stoppedAt);
        }
        if (stoppedAt < second.length) {
            ans += s1.substring(stoppedAt);
        }

        return ans;
    }
}
