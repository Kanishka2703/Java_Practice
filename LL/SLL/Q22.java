package SLL;

//to remove the middle element by optimal solution
//goal is to reach just before the slow pointer, can be done by skipping one slow move.
import java.util.*;

import org.w3c.dom.Node;

public class Q22 {
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
    public static Node DeleteMiddle(Node head){
        if(head==null ||head.next==null)
        return null;
        Node slow=head;
        Node fast=head;
        fast=head.next.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=slow.next.next;
        return head;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = { 1, 2, 3, 4, 5 };
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next.next = new Node(arr[3]);
        head.next.next.next.next = new Node(arr[4]);
        PrintLL(head);
        System.out.println("After deleting the middle element from the LL");
        DeleteMiddle(head);
        PrintLL(head);
    }
}