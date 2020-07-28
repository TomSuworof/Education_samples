package Tasks.BinarySearch;

/*
 * https://binarysearch.io/problems/And-One
 */

import java.util.ArrayList;
import java.util.Arrays;

public class AndOne {
    public static void main(String[] args) {
        int[] test0 = {1, 9, 1};
        int[] test1 = new int[]{9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9,
                9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9,
                9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9,
                9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9,
                9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9,
                9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9,
                9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9,
                9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9};

        print(test0); // [1, 9, 2]
        print(test1); // [1, 0. ... 0]
    }

    private static int[] solve(int[] nums) {
        ArrayList<Integer> nums_l = new ArrayList<>();
        for (int num : nums) {
            nums_l.add(num);
        }

        for (int i = nums_l.size() - 1; i >= 0; i--) {
            if (nums_l.get(i) + 1 > 9) {
                nums_l.set(i, 0);
            } else {
                nums_l.set(i, nums_l.get(i) + 1);
                return toArray(nums_l);
            }
        }
        nums_l.add(0, 1);
        return toArray(nums_l);
    }

    static int[] toArray(ArrayList<Integer> input) {
        int[] ans = new int[input.size()];
        for (int i = 0; i < input.size(); i++) {
            ans[i] = input.get(i);
        }
        return ans;
    }

    static void print(int[] array) {
        System.out.println(Arrays.toString(solve(array)));
        System.out.println("--------------------------");
    }
}
