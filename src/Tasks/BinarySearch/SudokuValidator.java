package Tasks.BinarySearch;

/*
 * https://binarysearch.io/problems/Sudoku-Validator
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
        System.out.println("------------------------");
        int[] true_array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // checking each row
        for (int i = 0; i < 9; i++) {
            int[] curr_row = matrix[i].clone();
            System.out.println(Arrays.toString(curr_row));
            System.out.println("--");
            Arrays.sort(curr_row);
            if (!Arrays.equals(curr_row, true_array)) {
                return false;
            }
        }

        System.out.println("------------------------");

        // checking each column
        for (int i = 0; i < 9; i++) {
            int[] curr_column = new int[9];
            for (int j = 0; j < 9; j++) {
                curr_column[j] = matrix[j][i];
            }
            System.out.println(Arrays.toString(curr_column));
            System.out.println("--");
            Arrays.sort(curr_column);
            if (!Arrays.equals(curr_column, true_array)) {
                return false;
            }
        }

        System.out.println("------------------------");

        // checking each box
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int[] curr_box = new int[9];
                curr_box[0] = matrix[i * 3 + 0][j * 3 + 0];
                curr_box[1] = matrix[i * 3 + 0][j * 3 + 1];
                curr_box[2] = matrix[i * 3 + 0][j * 3 + 2];

                curr_box[3] = matrix[i * 3 + 1][j * 3 + 0];
                curr_box[4] = matrix[i * 3 + 1][j * 3 + 1];
                curr_box[5] = matrix[i * 3 + 1][j * 3 + 2];

                curr_box[6] = matrix[i * 3 + 2][j * 3 + 0];
                curr_box[7] = matrix[i * 3 + 2][j * 3 + 1];
                curr_box[8] = matrix[i * 3 + 2][j * 3 + 2];

                System.out.println(Arrays.toString(curr_box));
                System.out.println("--");
                Arrays.sort(curr_box);
                if (!Arrays.equals(curr_box, true_array)) {
                    return false;
                }
            }
        }

        return true;
    }
}
