package Tasks.BinarySearch;

/*
 * https://binarysearch.io/problems/Matrix-Search
 */

import java.util.ArrayList;
import java.util.Collections;

public class MatrixSearch {
    public static void main(String[] args) {
        int[][] matrix =   {{1, 3, 30},
                            {2, 3, 31},
                            {5, 5, 32}};
        int n = 4;

        System.out.println(solve(matrix, n)); // 5 cause we have 1, 2, 3, 3, [5], ...
    }

    private static int solve(int[][] matrix, int n) {
        ArrayList<Integer> all_numbers = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                all_numbers.add(matrix[i][j]);
            }
        }
        Collections.sort(all_numbers);
        return all_numbers.get(n);
    }
}
