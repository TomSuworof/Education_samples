package Tasks.Samples.WorkWithBinaryTrees;

public class BinaryTree {
    Node root;

    // adding an element
    public void add(int value) {
        root = addRecursive(root, value);
    }
    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        }

        return current; // if current.value == value
    }

    // finding an element
    public boolean containsNode(int value) {
        return containsNodeRecursive(root, value);
    }
    private boolean containsNodeRecursive(Node current, int value) {
        if (current == null) {
            return false;
        }

        if (current.value == value) {
            return true;
        }

        return value < current.value
                ? containsNodeRecursive(current.left, value)
                : containsNodeRecursive(current.right, value);
    }

    // deleting an element
    public void delete(int value) {
        root = deleteRecursive(root, value);
    }
    private Node deleteRecursive(Node current, int value) {
        if (current == null) {
            return null;
        }

        if (current.value == value) {
            if (current.left == null && current.right == null) {
                return null;
            } // no children

            if (current.left == null) {
                return current.right;
            } // right child

            if (current.right == null) {
                return current.left;
            } // left child

            // have both children
            int smallestValue = findSmallestValue(current.right);
            current.value = smallestValue;
            current.right = deleteRecursive(current.right, smallestValue);
            return current;
        }

        if (value < current.value) {
            current.left = deleteRecursive(current.left, value);
            return current;
        } // else
        current.right = deleteRecursive(current.right, value);
        return current;
    }
    private int findSmallestValue(Node root) {
        return root == null ? root.value : findSmallestValue(root.left);
    }
}

class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
        left = null;
        right = null;
    }
}