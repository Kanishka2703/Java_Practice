//to print LL from array
import java.util.*;
public class Q2{
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
    public static void main(String args[]){
        int arr[]={00,10,20,30,40,50};
        Node head=new Node(arr[0]);
        head.next=new Node(arr[1]);
        head.next.next=new Node(arr[2]);
        head.next.next.next=new Node(arr[3]);
        head.next.next.next.next=new Node(arr[4]);
        head.next.next.next.next.next=new Node(arr[5]);
        PrintLL(head);
    }
}