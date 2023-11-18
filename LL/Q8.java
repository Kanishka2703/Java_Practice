////to find the middle element of the LL
//optimal approach
import java.util.*;
public class Q8{
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
    public static Node InsertatFirst(int value, Node head){
        Node newnode=new Node(value);
        newnode.next=head;
        head=newnode;
        return head;
    }
    public static Node MiddleElement(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        Node head=null;
        head=InsertatFirst(0, head);
        head=InsertatFirst(1, head);
        head=InsertatFirst(2, head);
        head=InsertatFirst(3, head);
        head=InsertatFirst(4, head);
        System.out.println("Middle element of the LL is ::: "+MiddleElement(head));
    }
}
