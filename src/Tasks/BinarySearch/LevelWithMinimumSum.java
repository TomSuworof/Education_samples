package Tasks.BinarySearch;

/*
 * https://binarysearch.io/problems/Level-with-Minimum-Sum
 */

import java.util.HashMap;
import java.util.Map;

public class LevelWithMinimumSum {
    public static void main(String[] args) {
        Tree root0 = new Tree(1,
                new Tree(2),
                new Tree(3,
                        new Tree(4),
                        new Tree(5)
                )
        );

        /*

           1
          / \
         2   3
            / \
           4   5

         */

        Tree root1 = new Tree(2,
                null,
                new Tree(0,
                        new Tree(0),
                        null));

        /*

          2
           \
            0
           /
          1

         */

        Tree root2 = new Tree(0,
                null,
                new Tree(2));

        /*

           0
            \
             2

         */

        System.out.println(solve(root0)); // 0
        System.out.println(solve(root1)); // 1
        System.out.println(solve(root2)); // 0
    }

    private static HashMap<Integer, Integer> levelsAndSums;

    private static int solve(Tree root) {
        levelsAndSums = new HashMap<>();
        helper(0, root);
        System.out.println("SUMMARY");
        for (Map.Entry<Integer, Integer> entry : levelsAndSums.entrySet()) {
            System.out.println("Level: " + entry.getKey() + ", sum: " + entry.getValue());
        }
        System.out.println("END");
        int levelForAnswer = 0, minSum = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> entry : levelsAndSums.entrySet()) {
            if (entry.getValue() < minSum) {
                levelForAnswer = entry.getKey();
                minSum = entry.getValue();
            }
        }
        return levelForAnswer;
    }

    private static void helper(int level, Tree root) {
//        System.out.println("current level: " + level + ", value: " + root.val);
        if (levelsAndSums.containsKey(level)) {
            levelsAndSums.put(level, levelsAndSums.get(level) + root.val);
        } else {
            levelsAndSums.put(level, root.val);
        }
        if (root.left != null) {
//            System.out.println("left isn't null");
            helper(level + 1, root.left);
        }
        if (root.right != null) {
//            System.out.println("right isn't null");
            helper(level + 1, root.right);
        }
    }
}
