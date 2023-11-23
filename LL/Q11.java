//to check whether the LL is palindrome or not
import java.util.*;
public class Q11{
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
    public static Node ReverseLL(Node head){
        Node dummy=null;
        while(head!=null){
            Node next=head.next;
            head.next=dummy;
            dummy=head;
            head=next;
        }
        return dummy;
    }
    public static boolean PalindromeLL(Node head){
        if(head==null || head.next==null)
        return true;
        Node slow=head;
        Node fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=ReverseLL(slow.next);
        slow=slow.next;
        Node dummy=head;
        while(slow!=null){
            if(dummy.val!=slow.val)
            return false;
            dummy=dummy.next;
            slow=slow.next;
        }
        return true;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,3,2,1};
        Node head=new Node(arr[0]);
        head.next=new Node(arr[1]);
        head.next.next=new Node(arr[2]);
        head.next.next.next=new Node(arr[3]);
        head.next.next.next.next=new Node(arr[4]);
        head.next.next.next.next.next=new Node(arr[5]);
        if(PalindromeLL(head)==true)
        System.out.println("Given LL is Palindrome");
        else
        System.out.println("Given LL is not Palindrome");
    }
}