//to find the starting point in a LL
import java.util.*;
public class Q12{
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
    static void createCycle(Node head,int pos) {
        Node ptr = head;
        Node temp = head;
        int cnt = 0;
        while(temp.next != null) {
            if(cnt != pos) {
                cnt++;
                ptr = ptr.next;
            } 
            temp = temp.next;
        }
        temp.next = ptr;
    }
    public static Node detectCycle(Node head){
        if(head==null || head.next==null)
        return null;
        Node slow=head;
        Node fast=head;
        Node entry=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                while(slow!=entry){
                    slow=slow.next;
                    entry=entry.next;
                }
                return slow;
            }
        }
        return null;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,3,2,1};
        Node head=new Node(arr[0]);
        head.next=new Node(arr[1]);
        head.next.next=new Node(arr[2]);
        head.next.next.next=new Node(arr[3]);
        head.next.next.next.next=new Node(arr[4]);
        head.next.next.next.next.next=new Node(arr[5]);
        createCycle(head,3);
        Node ans=detectCycle(head);
        if(ans==null)
        System.out.println("No cycle");
        else{
            Node temp=head;
            int pos=0;
            while(temp!=ans){
                pos++;
                temp=temp.next;
            }
            System.out.println("Tails connects to "+pos);
        }
    }
}
