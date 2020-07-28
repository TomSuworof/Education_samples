package Tasks.BinarySearch;

/*
 * https://binarysearch.io/problems/Sum-of-two-numbers
 */

import java.util.HashSet;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        int[] nums1 = {35, 8, 18, 3, 22};
        int k1 = 11;

        int[] nums2 = {10, 36, 22, 14};
        int k2 = 4;

        int[] nums3 = {24, 10, 11, 4};
        int k3 = 15;

        int[] nums4 = {-22, 22, -11, 11};
        int k4 = 0;

        int[] nums5 = {15, 0, 3, 2};
        int k5 = 15;

        System.out.println(solve(nums1, k1)); // true
        System.out.println(solve(nums2, k2)); // false
        System.out.println(solve(nums3, k3)); // true
        System.out.println(solve(nums4, k4)); // true
        System.out.println(solve(nums5, k5)); // true
    }
    private static boolean solve(int[] nums, int k) {
        HashSet<Integer> nums_l = new HashSet<>();
        for (int num : nums) {
            if (nums_l.contains(k - num)) {
                return true;
            } else {
                nums_l.add(num);
            }
        }
        return false;
    }
}
