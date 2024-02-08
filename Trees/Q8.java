
//to check whether a tree is balanced binary tree or not
import java.util.*;

public class Q8 {
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

    public static boolean balancedBT(Node root) {
        return HeightOfBT(root) != -1;
    }

    public static int HeightOfBT(Node root) {
        if (root == null)
            return 0;
        int lh = HeightOfBT(root.left);
        if (lh == -1)
            return -1;
        int rh = HeightOfBT(root.right);
        if (rh == -1)
            return -1;
        if (Math.abs(lh - rh) > 1)
            return -1;
        return 1 + Math.max(lh, rh);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Node root = new Node(4);
        root.left = new Node(7);
        root.right = new Node(8);
        root.left.left = new Node(2);
        root.left.right = new Node(11);
        root.left.left.left = new Node(0);
        root.right.left = new Node(1);
        root.right.right = new Node(0);
        root.right.left.left = new Node(3);
        root.right.left.left.left = new Node(5);
        System.out.println("the given tree is balanced binary tree " + balancedBT(root));
    }
}