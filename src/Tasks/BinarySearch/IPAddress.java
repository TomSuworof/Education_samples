package Tasks.BinarySearch;

/*
 * https://binarysearch.io/problems/IP-Address
 */

import java.util.Arrays;

public class IPAddress {
    public static void main(String[] args) {
        String s0 = "0.0.0.0";
        String s1 = "0.1.2.255";
        String s2 = "0.1.2.256";
        String s3 = "1.1.1.+1";
        String s4 = "a.b.c.d";

        System.out.println(solve(s0)); // true
        System.out.println(solve(s1)); // true
        System.out.println(solve(s2)); // false
        System.out.println(solve(s3)); // false
        System.out.println(solve(s4)); // false
    }

    static boolean solve(String s) {
        String[] nums = s.split("\\.");
        if (nums.length != 4) {
            return false;
        }
        System.out.println(Arrays.toString(nums));
        for (String num : nums) {
            if (num.equals("0")) {
                continue;
            }
            if (num.startsWith("0") && num.length() > 1) {
                return false;
            }
            for (int i = 0; i < num.length(); i++) {
                if (!Character.isDigit(num.charAt(i))) {
                    return false;
                }
            }
            if (Integer.parseInt(num) > 255) {
                return false;
            }

        }
        return true;
    }
}
