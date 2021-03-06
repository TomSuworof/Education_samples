package Tasks.BinarySearch;

/*
 * https://binarysearch.io/problems/Shortest-String
 */

public class ShortestString {
    public static void main(String[] args) {
        {
            String s = "1100";
            String s1 = "11000";
            String s2 = "111000";
            String s3 = "100000";
            String s4 = "1111110";
            String s5 = "10";

            System.out.println(solve(s));
            System.out.println(solve(s1));
            System.out.println(solve(s2));
            System.out.println(solve(s3));
            System.out.println(solve(s4));
            System.out.println(solve(s5));
        }
    }
    private static int solve(String s) {
        int zer = 0;
        int one = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                one++;
            } else {
                zer++;
            }
        }
        return Math.abs(zer - one);
    } // counting 1 and 0
}