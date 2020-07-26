package Tasks.BinarySearch;

public class Tree {
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