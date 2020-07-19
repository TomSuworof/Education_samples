package Tasks.BinarySearch;

/*
 * https://binarysearch.io/problems/Fair-Pay
 */

import java.util.Arrays;

public class FairPay {
    public static void main(String[] args) {
        int[] ratings0 = {1, 2, 5, 1};
        int[] ratings1 = {2, 2, 7, 7, 0};


        System.out.println(solve(ratings0)); // 7 cause we pay [1, 2, 3, 1] for each programmer
        System.out.println(solve(ratings1)); // 7 cause we pay [1, 1, 2, 2, 1]
    }

    static int solve(int[] ratings) {
        int[] bills = new int[ratings.length];
        Arrays.fill(bills, 1);
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]) {
                bills[i] = bills[i - 1] + 1;
            }
        }
        for (int i = ratings.length - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                bills[i] = Math.max(bills[i], bills[i + 1] + 1);
            }
        }

        int sum = 0;
        for (int bill : bills) {
            sum += bill;
        }

        return sum;
    }
}
