package Tasks.BinarySearch;

/*
 * https://binarysearch.io/problems/List-Min-Replacement
 */

import java.util.*;

public class ListMinReplacement {
    public static void main(String[] args) {
        int[] nums0 = {10, 5, 7, 9};

        System.out.println(Arrays.toString(solve(nums0))); // [0, 10, 5, 5]
    }

    private static int[] solve(int[] nums) {
        if (nums.length == 0) {
            return new int[0];
        }

        int min = nums[0];
        nums[0] = 0;
        for (int i = 1; i < nums.length; i++) {
            int k = min;
            min = Math.min(min, nums[i]);
            nums[i] = k;
        }
        return nums;
    }
}