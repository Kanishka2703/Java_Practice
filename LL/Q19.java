//to insert the element before the given value from the LL
import java.util.*;

import org.w3c.dom.Node;
public class Q19{
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
    public static Node Insertbeforevalue(Node head,int element,int value){
        if(head==null)
        return null;
        if(head.val==value){
            Node newnode=new Node(element);
            newnode.next=head;
            head=newnode;
            return head;
        }
        Node temp=head;
        while(temp.next!=null){
            if(temp.next.val==value){
                Node newnode=new Node(element,temp.next);
                temp.next=newnode;
                break;
            }
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
        System.out.println("After inserting the node before the given node value in LL");
        Insertbeforevalue(head, 100, 30);
        PrintLL(head);
    }
}