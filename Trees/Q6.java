
//height of a binary tree
import java.util.*;

public class Q6 {
    public static class Node {
        int val;
        Node left;
        Node right;

        Node(int data) {
            this.val = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int LevelOrder(Node root) {
        int level = 0;
        if (root == null)
            return 0;
        LinkedList<Node> queue = new LinkedList<>();
        queue.addLast(root);
        while (queue.size() > 0) {
            int size = queue.size();
            while (size-- > 0) {
                Node remNode = queue.removeFirst();
                if (remNode.left != null) {
                    queue.addLast(remNode.left);
                }
                if (remNode.right != null) {
                    queue.addLast(remNode.right);
                }
            }
            level++;
        }
        return level;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(8);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right.left = new Node(9);
        root.right.right.right = new Node(10);
        System.out.println("Height of the binary tree is:::");
        int ans = LevelOrder(root);
        System.out.println(ans);
    }
}
