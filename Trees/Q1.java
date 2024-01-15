//to represent the binary tees in java
import java.util.*;

import javax.swing.tree.TreeNode;
public class Q1{
    public static class Node{
        int val;
        Node left;
        Node right;
        Node(int data){
            this.val=data;
            this.left=null;
            this.right=null;
        }
    }
    public static void printTree(Node root, int level) {
        if (root != null) {
            printTree(root.right, level + 1);
            for (int i = 0; i < level; i++) {
                System.out.print("    "); 
            }
            System.out.println(root.val);
            printTree(root.left, level + 1);
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Node root=new Node(8);
        root.left=new Node(5);
        root.right=new Node(13);
        root.left.left=new Node(1);
        root.left.right=new Node(6);
        root.right.left=new Node(11);
        root.right.right=new Node(16);
        System.out.println(root.val);
    }
}