//InOrder traversal in trees
//doubt
import java.util.*;
public class Q4{
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
    public static ArrayList<Integer> InOrder(Node root){
        ArrayList<Integer> ans=new ArrayList<>();
        Stack<Node> st=new Stack<Node>();
        while(true){
            if(root!=null){
                st.push(root);
                root=root.left;
            }
            else{
                if(st.isEmpty()) break;
                root=st.peek();
                ans.add(root.val);
                st.pop();
                root=root.right;
            }
        }
        return ans;
    }
    public static void Print(ArrayList<Integer> ans){
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" -> ");
        }
        System.out.println("NULL");
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
        ans=InOrder(root);
        System.out.println("InOrder traversal of the tree :");
        Print(ans);
    }
}
