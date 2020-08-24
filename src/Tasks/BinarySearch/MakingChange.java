package Tasks.BinarySearch;

/*
 * https://binarysearch.io/problems/Making-Change
 */

public class MakingChange {
    public static void main(String[] args) {
        int n0 = 3;
        int n1 = 5;
        int n2 = 6;
        int n3 = 2034770455;
        int n4 = 922039822;

        System.out.println(solve(n0)); // 3
        System.out.println(solve(n1)); // 1
        System.out.println(solve(n2)); // 2
        System.out.println(solve(n3)); // 81390819
        System.out.println(solve(n4)); // 36881596
    }

    private static int solve(int n) {
//        long time = System.nanoTime();

        int[] coins = {25, 10, 5, 1};
        int count = 0;
        for (int i = 0; i < 4 && n != 0; i++) {
            count += (n / coins[i]);
            n %= coins[i];
        }

//        time = System.nanoTime() - time;
//
//        System.out.println(time / 1_000_000.0 + " ms");

        return count;
    }
}
