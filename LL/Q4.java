//to delete the tail of the LL
import java.util.*;
public class Q4{
    public static class Node{
        int val;
        Node next;
        Node(int x){
            this.val=x;
            this.next=null;
        }
        Node(int x, Node next1){
            this.val=x;
            this.next=next1;
        }
    }
    private static Node DeleteTail(Q4.Node head) {
        if(head==null||head.next==null)
                return null;
                Node temp=head;
                while(temp.next.next!=null){
                    temp=temp.next;
                }
                temp.next=null;
                return head;
    }
    private static void PrintLL(Q4.Node head) {
        Node temp=head;
            while(temp!=null){
                System.out.print(temp.val+" -> ");
                temp=temp.next;
            }
            System.out.println("END");
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        Node head=new Node(arr[0]);
        head.next=new Node(arr[1]);
        head.next.next=new Node(arr[2]);
        head.next.next.next=new Node(arr[3]);
        head.next.next.next.next=new Node(arr[4]);
        System.out.println("LL before deleting tail ");
        PrintLL(head);
        System.out.println("LL after deleting tail");
        head=DeleteTail(head);
        PrintLL(head);
    }
}
