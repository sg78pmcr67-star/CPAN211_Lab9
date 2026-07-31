class Node {
    int value;
    Node left, right;

    public Node(int item) {
        value = item;
        left = right = null;
    }
}

public class FindMaxInBinaryTree {
    Node root;

    public int findMax(Node node) {
        if (node == null) {
            return Integer.MIN_VALUE;
        }

        int res = node.value;
        int leftMax = findMax(node.left);
        int rightMax = findMax(node.right);

        if (leftMax > res) {
            res = leftMax;
        }
        if (rightMax > res) {
            res = rightMax;
        }

        return res;
    }

    public static void main(String[] args) {
        FindMaxInBinaryTree tree = new FindMaxInBinaryTree();
        tree.root = new Node(10);
        tree.root.left = new Node(20);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(30);
        tree.root.left.right = new Node(25);
        tree.root.right.right = new Node(50);

        System.out.println("Maximum value in the tree: " + tree.findMax(tree.root));
    }
}