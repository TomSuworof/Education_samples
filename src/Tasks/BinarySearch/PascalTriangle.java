package Tasks.BinarySearch;

/*
 * https://binarysearch.io/problems/Pascal's-Triangle
 */

import java.util.Arrays;

public class PascalTriangle {
    public static void main(String[] args) {
        for (int i = 0; i < 30; i++) {
            System.out.println(Arrays.toString(solve(i)));
        }
    }

    public static int[] solve(int n) {

        int[] row = new int[n + 1];
        for (int i = 0; i < row.length; i++) {
            row[i] = C(i, n);
        }
        return row;
    }

    static int C(int m, int n) {
        return (int) Math.ceil((fact(n) / (fact(m) * fact(n - m))));
    }

    static double fact(int n) {
        double result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
