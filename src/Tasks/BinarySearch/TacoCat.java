package Tasks.BinarySearch;

/*
 * https://binarysearch.io/problems/Taco-Cat
 */

public class TacoCat {
    public static void main(String[] args) {
        String s0 = "racecar";
        String s1 = "evilolive";
        String s2 = "palindrome";

        System.out.println(solve(s0)); // true
        System.out.println(solve(s1)); // true
        System.out.println(solve(s2)); // false
    }

    private static boolean solve (String s) {
        return new StringBuilder(s).reverse().toString().equals(s);
    }
}
