//to delete the given node value in the LL
import java.util.*;

import org.w3c.dom.Node;
public class Q17{
    public static class Node {
        int val;
        Node next;

        Node(int x) {
            this.val = x;
            this.next = null;
        }

        Node(int x, Node next1) {
            this.val = x;
            this.next = next1;
        }
    }
    public static void PrintLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    public static Node Deletenode(Node head, int element){
        if(head==null)
        return head;
        Node temp=head;
        Node prev=null;
        while(temp!=null){
            if(temp.val==element){
                prev.next=prev.next.next;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int arr[] = { 10, 20, 30, 40, 50 };
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next.next = new Node(arr[3]);
        head.next.next.next.next = new Node(arr[4]);
        PrintLL(head);
        System.out.println("After deleting the node in LL");
        Deletenode(head, 20);
        PrintLL(head);
    }
}
