package Tasks.BinarySearch;

/*
 * https://binarysearch.io/problems/Word-Concatenation
 *
 * not solved
 *
 */

public class WordConcatenation {
    public static void main(String[] args) {
        String[] words0 = {"news", "paper", "newspaper", "binary", "search", "binarysearch"};
        String[] words1 = {"c", "d", "ccdd"};
        String[] words2 = {"cdbd", "d", "cb"};


        System.out.println(solve(words0)); // 2
        System.out.println(solve(words1)); // 1
        System.out.println(solve(words2)); // 0
    }

    private static int solve(String[] words) {
        int count = 0;
//        String firstPart = "";
//        for (int i = 0; i < words.length; i++) {
//            firstPart = words[i];
//            for (int j = 0; j < words.length; j++) {
//                String secondPart = words[j];
//                for (String word : words) {
//                    String curr = word;
//                    if (!curr.equals(firstPart) && !curr.equals(secondPart)) {
//                        curr = curr.replaceAll(firstPart, "");
//                        curr = curr.replaceAll(secondPart, "");
//                    }
//                    if (curr.length() == 0) {
//                        count++;
//                    }
//                    System.out.println(firstPart + " "
//                            + secondPart + " : "
//                            + word + " "
//                            + curr + " "
//                            + count);
//                }
//            }
//        }
        for (int i = 0; i < words.length; i++) {
            String curr = words[i];
            int firstIndex = -1;
            for (int j = 0; j < words.length; j++) {
                if (j != i && curr.contains(words[j])) {
                    curr = curr.replaceAll(words[j], "");
                    firstIndex = j;
                    break;
                }
            }
            for (int j = 0; j < words.length; j++) {
                if (j != i && j != firstIndex && curr.contains(words[j])) {
                    curr = curr.replaceAll(words[j], "");
                }
            }
            if (curr.length() == 0) {
                count++;
            }
        }

        return count;
    }
}
