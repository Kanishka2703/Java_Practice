//to delete the head of the DLL
import java.util.*;

import org.w3c.dom.Node;
public class Q26{
    public static class Node{
        int val;
        Node next;
        Node back;
        Node(int data,Node next1,Node back1){
            this.val=data;
            this.next=next1;
            this.back=back1;
        }
        Node(int data){
            this.val=data;
            this.next=null;
            this.back=null;
        }
    }
    public static Node DeleteHead(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node temp=head;
        head=head.next;
        head.back=null;
        temp.next=null;
        return head;
    }
    public static void PrintLL(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" <-> ");
            temp=temp.next;
        }
        System.out.println("END");
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int arr[]={1,2,3,4,5};
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next.next = new Node(arr[3]);
        head.next.next.next.next = new Node(arr[4]);
        PrintLL(head);
        System.out.println("After deleting the head of the DLL");
        head=DeleteHead(head);
        PrintLL(head);
    }
}
