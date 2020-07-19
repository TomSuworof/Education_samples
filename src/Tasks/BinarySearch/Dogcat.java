package Tasks.BinarySearch;

/*
 * https://binarysearch.io/problems/Dogcat
 */

public class Dogcat {
    public static void main(String[] args) {
        String text_0 = "dog cat hello cat dog dog hello cat world";
        String word0_0 = "hello";
        String word1_0 = "world";

        String word0_1 = "cat";
        String word1_1 = "dog";

        System.out.println(solve(text_0, word0_0, word1_0)); // 1
        System.out.println(solve(text_0, word0_1, word1_1)); // 0
    }

    static int solve(String text, String word0, String word1) {
        String[] words = text.split(" ");
        Integer first = null;
        Integer second = null;

        int res = Integer.MAX_VALUE;

        for (int i = 0; i < words.length; i++){
            if (word0.equals(words[i])){
                first = i;
            }
            if (word1.equals(words[i])){
                second = i;
            }
            if (first != null && second != null){
                res = Math.min(res, Math.abs(first - second) - 1);
            }
        }
        if (first == null || second == null){
            return -1;
        }
        return res;
    }
}
