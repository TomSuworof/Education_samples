package Tasks.BinarySearch;

/*
 * https://binarysearch.io/problems/Line-Segment
 */

public class LineSegment {
    public static void main(String[] args) {
        int[][] coordinates0 = {
                {1, 1},
                {3, 3},
                {7, 7}
        };
        int[][] coordinates1 = {
                {1, 1},
                {3, 3},
                {4, 6}
        };

        System.out.println(solve(coordinates0)); // true
        System.out.println(solve(coordinates1)); // false
    }

    private static boolean solve(int[][] coordinates) {
        try {
            if (coordinates.length <= 2) {
                return true;
            }

            int k = (coordinates[0][1] - coordinates[1][1]) / (coordinates[0][0] - coordinates[1][0]);
            int b = coordinates[0][1] - k * coordinates[0][0];

            for (int[] pair : coordinates) {
                if (pair[1] != k * pair[0] + b) {
                    return false;
                }
            }
        } catch (ArithmeticException wrongNumber) {
            return false;
        }
        return true;
    }
}
