//to insert the node at the end of the LL without using tail O(n)
import java.util.*;
public class Q3{
    public static class Node{
    int val;
    Node next;
    Node(int x){
        this.val=x;
        this.next=null;
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
    public static Node InsertatEnd(int value, Node head){
        Node newnode=new Node(value);
        newnode.val=value;
        newnode.next=null;
        if(head==null)
        return head=newnode;
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
            return head;
        }
    }
    public static void main(String[] args) {
        Node head=null;
        head=InsertatEnd(50, head);
        head=InsertatEnd(40, head);
        head=InsertatEnd(30, head);
        head=InsertatEnd(20, head);
        head=InsertatEnd(10, head);
        System.out.println("LL before inserting 00 at ending");
        PrintLL(head);
        System.out.println("LL after inserting 00 at ending");
        head=InsertatEnd(99, head);
        PrintLL(head);
    }
}
