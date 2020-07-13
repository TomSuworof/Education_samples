package Tasks.BinarySearch;

/*
 * https://binarysearch.io/problems/Space-Battle
 *
 * not solved
 */

import java.util.ArrayList;
import java.util.Arrays;

public class SpaceBattle {
    public static void main(String[] args) {
        int[] rockets0 = {1, -2};
        int[] rockets1 = {1, 5, 3, -6};
        int[] rockets2 = {1, 5, 3, -6, 7};

        print(rockets0); // [-2]
        print(rockets1); // [-6]
        print(rockets2); // [-6, 7]
    }
    static int[] solve(int[] nums) {
        ArrayList<Integer> rockets = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            rockets.add(nums[i]);
            if (nums[i] < 0) {
                for (int j = i - 1; j >= 0; j--) {
                    // explodes
                }
            }
        }

        int[] ans = new int[rockets.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = rockets.get(i);
        }
        return ans;
    }
    static void print(int[] array) {
        System.out.println(Arrays.toString(solve(array)));
    }
}
