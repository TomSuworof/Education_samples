package Tasks;

public class Solution {
    public static void main(String[] args) {
        String s = "1100";
        System.out.println(solve(s));
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