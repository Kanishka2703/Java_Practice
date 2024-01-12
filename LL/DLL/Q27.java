
//to delete the head of the DLL
import java.util.*;

import org.w3c.dom.Node;

public class Q27 {
    public static class Node {
        int val;
        Node next;
        Node back;

        Node(int data, Node next1, Node back1) {
            this.val = data;
            this.next = next1;
            this.back = back1;
        }

        Node(int data) {
            this.val = data;
            this.next = null;
            this.back = null;
        }
    }
    public static Node ArraytoDLL(int arr[]){
        Node head=new Node(arr[0]);
        Node prev=head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i],null,prev);
            prev.next=temp;
            prev=prev.next;
        }
        return head;
    }
    public static Node DeleteTail(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        Node newtail = tail.back;
        newtail.next = null;
        tail.back = null;
        return head;
    }

    public static void PrintLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " <-> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = { 1, 2, 3, 4, 5 };
        Node head=ArraytoDLL(arr);
        PrintLL(head);
        System.out.println("After deleting the tail of the DLL");
        head=DeleteTail(head);
        PrintLL(head);
    }
}