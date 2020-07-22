package Tasks.BinarySearch;

/*
 * https://binarysearch.io/problems/List-to-Binary-Search-Tree
 */

public class ListToBinarySearchTree {
    public static void main(String[] args) {
        int[] nums0 = {0, 1, 2, 3, 4};

        System.out.println(solve(nums0));
    }

    static Tree solve(int[] nums) {
        return Build(nums, 0, nums.length);
    }

    private static Tree Build(int[] nums, int start, int end) {
        if (start == end) {
            return null;
        }

        int k = (end - start) / 2 + start;

        Tree tree = new Tree();
        tree.val = nums[k];
        tree.left = Build(nums, start, k);
        tree.right = Build(nums, k + 1, end);
        return tree;
    }
}

class Tree {
    int val;
    Tree left;
    Tree right;

    @Override
    public String toString() {
         return "Tree{" +
                "val=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
//        return val + "\n / \\ \n" + this.right + " " + this.left;
    }
}