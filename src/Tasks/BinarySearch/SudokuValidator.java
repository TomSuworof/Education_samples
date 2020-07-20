package Tasks.BinarySearch;

/*
 * https://binarysearch.io/problems/Sudoku-Validator
 *
 * not solved
 *
 */

import java.util.Arrays;

public class SudokuValidator {
    public static void main(String[] args) {
        int[][] matrix =   {{4, 2, 6, 5, 7, 1, 3, 9, 8},
                            {8, 5, 7, 2, 9, 3, 1, 4, 6},
                            {1, 3, 9, 4, 6, 8, 2, 7, 5},
                            {9, 7, 1, 3, 8, 5, 6, 2, 4},
                            {5, 4, 3, 7, 2, 6, 8, 1, 9},
                            {6, 8, 2, 1, 4, 9, 7, 5, 3},
                            {7, 9, 4, 6, 3, 2, 5, 8, 1},
                            {2, 6, 5, 8, 1, 4, 9, 3, 7},
                            {3, 1, 8, 9, 5, 7, 4, 6, 2}};

        System.out.println(solve(matrix)); // true
    }

    static boolean solve(int[][] matrix) {
        int[] row_true = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        // sum of 1 - 9 = 45
//        int true_sum = 45;

        // checking each row
        for (int i = 0; i < 9; i++) {
            int[] curr_row = matrix[i].clone();
            Arrays.sort(curr_row);
            if (!Arrays.equals(curr_row, row_true)) {
                return false;
            }
        }

        // checking each column
        for (int i = 0; i < 9; i++) {

        }

        return false;
    }
}
