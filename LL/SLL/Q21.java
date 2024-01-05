package SLL;
//to delete the middle element by brute force
//reaching just before the middle node by getting the floor value of N/2 where N is the length of the LL
//in case of even length LL, we need to delete the second middle element.
import java.util.*;

import org.w3c.dom.Node;
public class Q21{
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
        float len=0.0f;
        if(head==null || head.next==null)
        return null;
        Node temp=head;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        float res=(float) Math.floor(len/2);
        Node newtemp=head;
        while(newtemp!=null){
            res--;
            if(res==0){
                newtemp.next=newtemp.next.next;
                break;
            }
            newtemp=newtemp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = { 1,2,3,4,5};
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