//to find the length of the LL
import java.util.*;
public class Q5{
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
    public static int lengthCount(Q5.Node head){ 
        Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        Node head=new Node(arr[0]);
        head.next=new Node(arr[1]);
        head.next.next=new Node(arr[2]);
        head.next.next.next=new Node(arr[3]);
        head.next.next.next.next=new Node(arr[4]);
        System.out.println("Length of the LL is ::  "+lengthCount(head));
    }
}

