
//height of the tree (recursive approach)
import java.util.*;

public class Q7 {
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

    public static int MaxDepth(Node root) {
        if (root == null)
            return 0;
        int lh=MaxDepth(root.left);
        int rh=MaxDepth(root.right);
        return 1+Math.max(lh,rh);
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
        int ans=MaxDepth(root);
        System.out.println("Height of the binary tree is:::"+ ans);
    }
}