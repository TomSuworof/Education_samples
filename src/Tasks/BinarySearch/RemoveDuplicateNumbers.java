package Tasks.BinarySearch;

/*
 * https://binarysearch.io/problems/Remove-Duplicate-Numbers
 */

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicateNumbers {
    public static void main(String[] args) {
        int[] nums0 = {1, 3, 5, 0, 3, 5, 8};
        int[] nums1 = {2, 2, 0, 2, 3, 0, 1};

        print(nums0); // [1, 0, 8]
        print(nums1); // [3, 1]
    }

    private static int[] solve(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Integer> removed = new ArrayList<>();
        for (int num : nums) {
            if (ans.contains(num)) {
                removed.add(num);
                ans.remove((Integer) num);
            } else if (!removed.contains(num)){
                ans.add(num);
            }
        }
        int[] ans_array = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            ans_array[i] = ans.get(i);
        }
        return ans_array;
    }

    private static void print(int[] array) {
        System.out.println(Arrays.toString(solve(array)));
        System.out.println("--------------------------");
    }
}
