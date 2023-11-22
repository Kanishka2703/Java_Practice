//to detect a cycle in the LL
import java.util.*;
public class Q10{
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
    public static boolean CycleDetect(Node head){
        if(head==null)
        return false;
        Node slow=head;
        Node fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={00,10,20,30,40,50};
        Node head=new Node(arr[0]);
        head.next=new Node(arr[1]);
        head.next.next=new Node(arr[2]);
        head.next.next.next=new Node(arr[3]);
        head.next.next.next.next=new Node(arr[4]);
        head.next.next.next.next.next=new Node(arr[5]);
        createCycle(head, 3);
        System.out.println(CycleDetect(head));
    } 
}
