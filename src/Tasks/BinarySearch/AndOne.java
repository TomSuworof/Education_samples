package Tasks.BinarySearch;

/*
 * https://binarysearch.io/problems/And-One
 */

import java.math.BigInteger;

public class AndOne {
    public static void main(String[] args) {
        int[] test1 = new int[]{9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9,
                9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9,
                9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9,
                9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9,
                9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9,
                9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9,
                9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9,
                9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
    }

    public int[] solve(int[] nums) {
        StringBuilder nums_str = new StringBuilder();
        for (int number : nums) {
            nums_str.append(String.valueOf(number));
        }

        System.out.println(nums_str);

        BigInteger number = new BigInteger(nums_str.toString());
        // need to be Big Integer
        String ans_str = String.valueOf(number.add(new BigInteger("1")));

        System.out.println(ans_str);

        int[] ans = new int[ans_str.length()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = Integer.parseInt(ans_str.substring(i, i + 1));
        }
        return ans;
    }
}
