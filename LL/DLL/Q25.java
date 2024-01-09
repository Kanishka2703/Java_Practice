package DLL;

//Array to DLL
import java.util.*;

import org.w3c.dom.Node;

public class Q25 {
    public static class Node {
        int val;
        Node next;
        Node back;

        Node(int data) {
            this.val = data;
            this.next = null;
            this.back = null;
        }
    Node(int data, Node next1,Node back1){
        this.val=data;
        this.next=next1;
        this.back=back1;
    }
    }
    public static void PrintLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " <-> " );
            temp = temp.next;
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
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int arr[] = { 10, 11, 12, 13, 14 };
            Node head=ArraytoDLL(arr);
            System.out.println(head.val);
            PrintLL(head);
        }
}