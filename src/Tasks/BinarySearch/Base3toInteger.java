package Tasks.BinarySearch;

/*
 * https://binarysearch.io/problems/Base-3-to-integer
 */

public class Base3toInteger {
    public static void main(String[] args) {
        String s0 = "10";
        String s1 = "21";

        System.out.println(solve(s0)); // 3
        System.out.println(solve(s1)); // 7

        System.out.println(solveEasy(s0)); // 3
        System.out.println(solveEasy(s1)); // 7
    }

    private static int solve(String s) {
        int answer = 0;
        if (s.length() == 0) {
            return 0;
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            answer += Integer.parseInt(String.valueOf(s.charAt(i))) * Math.pow(3, s.length() - 1 - i);
        }
        return answer;
    }

    private static int solveEasy(String s) {
        return Integer.parseInt(s, 3);
    }
}
