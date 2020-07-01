package Tasks;

public class Solution {
    public static void main(String[] args) {
        String s = "1100";
        String s1 = "11000";
        String s2 = "111000";
        String s3 = "100000";
        String s4 = "1111110";

        System.out.println(solve(s));
        System.out.println(solve(s1));
        System.out.println(solve(s2));
        System.out.println(solve(s3));
        System.out.println(solve(s4));
    }
    public static int solve(String s) {
        int zer =0;
        int one =0;
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