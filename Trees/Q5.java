//recursive approach to calculate the in-order of tree
import java.util.*;
public class Q5{
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
    public static void InOrder(Node root, ArrayList<Integer> ans){
        if(root==null){
            return;
        }
        InOrder(root.left, ans);
        ans.add(root.val);
        InOrder(root.right, ans);
    }
    public static void Print(ArrayList<Integer> ans){
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" -> ");
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
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
        ArrayList<Integer> ans=new ArrayList<>();
        InOrder(root,ans);
        System.out.println("In-Order Traversal : ");
        Print(ans);
    }
}
