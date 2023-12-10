//to remove the nth node from the last.
import java.util.*;
public class Q14{
    public static class Node{
        int val;
        Node next;
        Node(){
            this.val = 0;
            this.next = null;
        }
        Node(int x){
            this.val=x;
            this.next=null;
        }
        Node(int x, Node next1){
            this.val=x;
            this.next=next1;
        }
    }
    public static Node removefromend(Node head,int n){
        Node start = new Node();
        start.next = head;
        Node fast = start;
        Node slow = start;     

        for(int i = 1; i <= n; ++i)
            fast = fast.next;
    
        while(fast.next != null)
        {
            fast = fast.next;
            slow = slow.next;
        }
        
        slow.next = slow.next.next;
        
        return start.next;
    }
    public static void printLL(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" -> ");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
    public static void main(String args[]){
        int arr[]={1,2,3,3,2,1};
        Node head=new Node(arr[0]);
        head.next=new Node(arr[1]);
        head.next.next=new Node(arr[2]);
        head.next.next.next=new Node(arr[3]);
        head.next.next.next.next=new Node(arr[4]);
        head.next.next.next.next.next=new Node(arr[5]);
        printLL(head);
        System.out.println("After removing the nth node from LL");
        removefromend(head, 3);
        printLL(head);
    }
}