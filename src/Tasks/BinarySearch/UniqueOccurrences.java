package Tasks.BinarySearch;

/*
 * https://binarysearch.io/problems/Unique-Occurrences
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class UniqueOccurrences {
    public static void main(String[] args) {
        int[] nums0 = {5, 3, 1, 8, 3, 1, 1, 8, 8, 8};
        int[] nums1 = {-3, -1, -1, -1, -2, -2};
        int[] nums2 = {3, 1, 1, 2, 2, 2, 3};

        System.out.println(solve(nums0)); // true
        System.out.println(solve(nums1)); // true
        System.out.println(solve(nums2)); // false;
    }

    private static boolean solve(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> occurrences = new ArrayList<>();

//        System.out.println(Arrays.toString(nums));

        int current = nums[0];
        int count = 0;
        for (int num : nums) {
//            System.out.print("Current: " + current);
//            System.out.print(" Num: " + num);
//            System.out.println(" Count: " + count);
            if (num == current) {
                count++;
            } else {
                occurrences.add(count);
                current = num;
                count = 1;
            }
        }
        occurrences.add(count);

//        System.out.println(occurrences);

        return new HashSet(occurrences).size() == occurrences.size();
    }
}
