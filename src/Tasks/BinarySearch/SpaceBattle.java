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
        int[] rockets3 = {36, -3, -94};

        print(rockets0); // [-2]
        print(rockets1); // [-6]
        print(rockets2); // [-6, 7]
        print(rockets3); // [-94]
    }
    static int[] solve(int[] nums) {
        ArrayList<Integer> rockets = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            rockets.add(nums[i]);
            if (nums[i] < 0) {
                for (int j = i - 1; j >= 0; j--) {
                    if (nums[j] + nums[i] < 0) {
                        rockets.remove(j);
                    } else if (nums[j] + nums[i] == 0) {
                        rockets.remove(i);
                        rockets.remove(j);
                        break;
                    } else if (nums[j] + nums[i] > 0) {
                        rockets.remove(i);
                        break;
                    }
                }
            }
            if (nums[i] > 0) {
                for (int j = i + 1; j < rockets.size(); j++) {
                    if (nums[j] + nums[i] > 0) {
                        rockets.remove(j);
                    } else if (nums[j] + nums[i] == 0) {
                        rockets.remove(i);
                        rockets.remove(j);
                        break;
                    } else if (nums[j] + nums[i] < 0) {
                        rockets.remove(i);
                        break;
                    }
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
