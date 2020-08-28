package Tasks.BinarySearch;

public class Tree {
    int val;
    Tree left;
    Tree right;

    public Tree(int val, Tree left, Tree right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public Tree(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

    public Tree() {}

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