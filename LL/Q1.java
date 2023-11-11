//to insert a node at beginning of linked list
import java.util.*;
public class Q1{
    public static class Node{
    int val;
    Node next;
    Node(int x){
        val=x;
        next=null;
    }
    }
    public static void PrintLL(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.val+" -> ");
            curr=curr.next;
        }
        System.out.println("END");
    }
    public static Node InsertatFirst(int value, Node head){
        Node newnode=new Node(value);
        newnode.next=head;
        head=newnode;
        return head;
    }
    public static void main(String[] args) {
        Node head=null;
        head=InsertatFirst(50, head);
        head=InsertatFirst(40, head);
        head=InsertatFirst(30, head);
        head=InsertatFirst(20, head);
        head=InsertatFirst(10, head);
        System.out.println("LL before inserting 00 at beginning");
        PrintLL(head);
        System.out.println("LL after inserting 00 at beginning");
        head=InsertatFirst(00, head);
        PrintLL(head);
    }
}
