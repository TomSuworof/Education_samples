package Tasks.BinarySearch;

/*
 * https://binarysearch.io/problems/Rocketship-Rescue
 */

import java.util.Arrays;

public class RocketshipRescue {
    public static void main(String[] args) {
        int[] weights0 = {200, 300, 200};
        int limit0 = 400;

        int[] weights1 = {780, 752, 896, 214, 547};
        int limit1 = 1193;

        print(weights0, limit0); // 2
        print(weights1, limit1); // 4
    }
    static int solve(int[] weights, int limit) {
        Arrays.sort(weights);
        int left = 0, right = weights.length - 1, count = 0;
        while (left <= right) {
            if (weights[left] + weights[right] <= limit) {
                left++;
            }
            count++;
            right--;
        }
        return count;
    }

    static void print(int[] array, int n) {
        System.out.println(solve(array, n));
        System.out.println("--------------------------");
    }
}
