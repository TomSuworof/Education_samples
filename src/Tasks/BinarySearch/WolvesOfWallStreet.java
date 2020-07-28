package Tasks.BinarySearch;

/*
 * https://binarysearch.io/problems/Wolves-of-Wall-Street
 */

public class WolvesOfWallStreet {
    public static void main(String[] args) {
        int[] prices0 = {1, 5, 3, 4, 6};

        System.out.println(solve(prices0)); // 7
    }

    private static int solve(int[] prices) {
        int profit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < prices[i + 1]) {
                profit += prices[i + 1] - prices[i];
            }
        }
        return profit;
    }
}
