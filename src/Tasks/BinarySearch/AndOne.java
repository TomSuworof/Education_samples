package Tasks.BinarySearch;

/*
 * https://binarysearch.io/problems/And-One
 */

import java.math.BigInteger;
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

    static int[] solve(int[] nums) {
        StringBuilder nums_str = new StringBuilder();
        for (int number : nums) {
            nums_str.append(number);
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

    static void print(int[] array) {
        System.out.println(Arrays.toString(solve(array)));
        System.out.println("--------------------------");
    }
}
