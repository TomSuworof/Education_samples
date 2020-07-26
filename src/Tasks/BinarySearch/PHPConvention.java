package Tasks.BinarySearch;

/*
 * https://binarysearch.io/problems/PHP-Convention
 */

public class PHPConvention {
    public static void main(String[] args) {
        int n0 = 2;
        int[] convention0 = {0, 0, 1, 0, 0, 0, 1};

        int n1 = 1;
        int[] convention1 = {0, 1, 0};

        int n2 = 1;
        int[] convention2 = {0};

        System.out.println(solve(n0, convention0)); // true
        System.out.println(solve(n1, convention1)); // false;
        System.out.println(solve(n2, convention2)); // true;
    }

    static boolean solve(int n, int[] convention) {
        int len = convention.length;
        for (int i = 0; i < len; i++) {
            if (convention[i] == 0) {
                if (convention[i - 1 < 0 ? 0 : i - 1] != 1 && convention[i + 1 < len ? i + 1 : len - 1] != 1) {
                    convention[i] = 1;
                    n--;
                }
            }
        }
        return n <= 0;
    }
}
