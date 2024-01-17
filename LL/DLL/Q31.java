//to insert the element before tail in the DLL
import java.util.*;

import org.w3c.dom.Node;
public class Q31{
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
    public static Node ArraytoDLL(int arr[]) {
        Node head = new Node(arr[0]);
        Node prev = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = prev.next;
        }
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
    public static Node InsertbeforeHead(Node head, int value){
        if(head==null){
            Node newNode=new Node(value,null,null);
            return newNode;
        }
        Node newNode=new Node(value,head,null);
        head.back=newNode;
        return newNode;
    }
    public static Node InsertbeforeTail(Node head, int value){
        if(head==null){
            return head;
        }
        if(head.next==null){
            return InsertbeforeHead(head, 80);
        }
        Node tail=head;
        while(tail.next!=null){
            tail=tail.next;
        }
        Node beforetail=tail.back;
        Node newTail=new Node(value,tail,beforetail);
        beforetail.next=newTail;
        tail.back=newTail;
        return head;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = { 10, 20, 30, 40, 50, 60, 70, 90 };
        Node head = ArraytoDLL(arr);
        PrintLL(head);
        System.out.println("After adding the new node before the tail of the given DLL");
        head=InsertbeforeTail(head,80);
        PrintLL(head);
    }
}
