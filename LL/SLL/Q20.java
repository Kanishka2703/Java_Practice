package SLL;

//to segrregate even nd odd nodes in the LL
import java.util.*;

import org.w3c.dom.Node;

public class Q20 {
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
    
    public static Node EvenOdd(Node head) {
        Node odd =head;
        Node even=head.next;
        Node evenhead=head.next;
        if(head==null || head.next==null)
        return head;
        while(even!=null && even.next!=null){
            odd.next=odd.next.next;
            even.next=even.next.next;
            odd=odd.next;
            even=even.next;
        }
        odd.next=evenhead;
        return head;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80 };
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next.next = new Node(arr[3]);
        head.next.next.next.next = new Node(arr[4]);
        head.next.next.next.next.next = new Node(arr[5]);
        head.next.next.next.next.next.next = new Node(arr[6]);
        head.next.next.next.next.next.next.next = new Node(arr[7]);
        PrintLL(head);
        System.out.println("After segrregating the even nd odd nodes in LL");
        EvenOdd(head);
        PrintLL(head);
    }
}
