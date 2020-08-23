package Tasks.BinarySearch;

/*
 * https://binarysearch.io/problems/String-Isomorphism
 */

public class StringIsomorphism {
    public static void main(String[] args) {
        String s0 = "coco";
        String t0 = "kaka";

        String s1 = "cat";
        String t1 = "foo";

        String s2 = "hello";
        String t2 = "hello";

        System.out.println(solve(s0, t0)); // true
        System.out.println(solve(s1, t1)); // false
        System.out.println(solve(s2, t2)); // true
    }

    private static boolean solve(String s, String t) {
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) != t.indexOf(t.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
