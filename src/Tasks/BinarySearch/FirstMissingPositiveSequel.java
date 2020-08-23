package Tasks.BinarySearch;

/*
 * https://binarysearch.io/problems/First-Missing-Positive-Sequel
 */

public class FirstMissingPositiveSequel {
    public static void main(String[] args) {
        int[] arr0 = {2, 3, 4};
        int[] arr1 = {1, 2};
        int[] arr2 = {1, 2, 3, 4, 6, 7, 8, 9};
        int[] arr3 = {0, 1};
        int[] arr4 = {0, 1, 2, 4};

        System.out.println(solve(arr0)); // 1
        System.out.println(solve(arr1)); // 3
        System.out.println(solve(arr2)); // 5
        System.out.println(solve(arr3)); // 2
        System.out.println(solve(arr4)); // 3
    }

    private static int solve(int[] arr) {
        if (arr[0] == 0) {
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] != i) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != i + 1) {
                    return i + 1;
                }
            }
        }
        return arr[arr.length - 1] + 1;
    }
}
