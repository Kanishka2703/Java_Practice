//to delete the given node in the DLL
//we can't delete the head of the DLL (never be asked)
import java.util.*;

import org.w3c.dom.Node;
public class Q29{
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
    public static void DeleteNode(Node temp){
        Node front=temp.next;
        Node prev=temp.back;
        if(front==null){
            prev.next=null;
            temp.back=null;
        }
        prev.next=front;
        front.back=prev;
        temp.next=null;
        temp.back=null;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80 };
        Node head = ArraytoDLL(arr);
        PrintLL(head);
        System.out.println("After deleting the kth node from the DLL");
        DeleteNode(head.next);
        PrintLL(head);
    }
}
