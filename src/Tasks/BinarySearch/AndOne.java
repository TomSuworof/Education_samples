package Tasks.BinarySearch;

public class AndOne {
    public static void main(String[] args) {
//        int test1 = new int[]{9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9,
//                9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9,
//                9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9,
//                9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9,
//                9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9,
//                9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9,
//                9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9,
//                9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
    }

    public int[] solve(int[] nums) {
        String nums_str = "";
        for (int number : nums) {
            nums_str += String.valueOf(number);
        }

        System.out.println(nums_str);

        String ans_str = String.valueOf(Double.parseDouble(nums_str) + 1);
        ans_str = ans_str.substring(ans_str.length() - 2);

        System.out.println(ans_str);

        int[] ans = new int[ans_str.length()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = Integer.parseInt(ans_str.substring(i, i + 1));
        }
        return ans;
    }
}
