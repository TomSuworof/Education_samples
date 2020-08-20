package Tasks.BinarySearch;

/*
 * https://binarysearch.io/problems/Zero-Matrix
 */

public class ZeroMatrix {
    public static void main(String[] args) {
        int[][] matrix0 = { {5, 0, 0, 5, 8},
                            {9, 8, 10, 3, 9},
                            {0, 7, 2, 3, 1},
                            {8, 0, 6, 7, 2},
                            {4, 1, 8, 5, 10}};

        print(solve(matrix0));
        /*
            [0, 0, 0, 0, 0],
            [0, 0, 0, 3, 9],
            [0, 0, 0, 0, 0],
            [0, 0, 0, 0, 0],
            [0, 0, 0, 5, 10]
         */
    }

    private static int[][] solve(int[][] matrix) {
        int[][] matrixAns = new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            System.arraycopy(matrix[i], 0, matrixAns[i], 0, matrix.length);
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == 0) {
                    deleteRowColumn(matrixAns, i, j);
                }
            }
        }

        return matrixAns;
    }

    private static void deleteRowColumn(int[][] matrix, int row, int column) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[row][i] = 0;
        }

        for (int i = 0; i < matrix.length; i++) {
            matrix[i][column] = 0;
        }
    }

    private static void print(int[][] matrix) {
        for (int[] row : matrix) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
