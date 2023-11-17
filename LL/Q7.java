//to find the middle element of the LL
//brute force
import java.util.*;
public class Q7{
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
    public static Node MiddleElement(Node head){
        int n=0;
        Node temp=head;
        while(temp!=null){
            n++;
            temp=temp.next;
        }
        temp=head;
        for(int i=0;i<n/2;i++){
            temp=temp.next;
        }
        return temp; 
    }
    public static void main(String[] args) {
        int arr[]={00,10,20,30,40,50};
        Node head=new Node(arr[0]);
        head.next=new Node(arr[1]);
        head.next.next=new Node(arr[2]);
        head.next.next.next=new Node(arr[3]);
        head.next.next.next.next=new Node(arr[4]);
        head.next.next.next.next.next=new Node(arr[5]);
        System.out.println("Middle element of the LL is ::: "+MiddleElement(head));
    }
}
