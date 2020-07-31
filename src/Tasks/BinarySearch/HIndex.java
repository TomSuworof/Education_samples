package Tasks.BinarySearch;

/*
 * https://binarysearch.io/problems/H-Index
 */

import java.util.Arrays;

public class HIndex {
    public static void main(String[] args) {
        int[] citations0 = {4, 3, 0, 1, 5};
        int[] citations1 = {4, 4, 0, 1, 5, 9};
        int[] citations2 = {9, 10, 0, 1, 6};

        System.out.println(solve(citations0)); // 3
        System.out.println(solve(citations1)); // 4
        System.out.println(solve(citations2)); // 3
    }

    private static int solve(int[] citations) {
        Arrays.sort(citations);
        for (int i = 0; i < citations.length; i++) citations[i] *= -1;
        Arrays.sort(citations);
        for (int i = 0; i < citations.length; i++) citations[i] *= -1;
        System.out.println(Arrays.toString(citations));

        int h_index = 0;

        for (int citation : citations) {
            if (h_index < citation) {
                h_index++;
            }
        }

        return h_index;
    }
}
