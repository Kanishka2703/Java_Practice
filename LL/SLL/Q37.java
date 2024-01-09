
//to merge the sorted LL
//no additional space is used...only we are changing the links
import java.util.*;

import org.w3c.dom.Node;

public class Q37 {
    public static class Node {
        int val;
        Node next;

        Node(int x) {
            this.val = x;
            this.next = null;
        }

        Node(int x, Node next1) {
            this.val = x;
            this.next = next1;
        }
    }

    public static Node ArraytoDLL(int arr[]) {
        Node head= new Node(arr[0]);
        Node mover=head;
        for (int i=1;i<arr.length;i++){
            Node temp= new Node(arr[i]);
            mover.next=temp;
            mover=mover.next;
        }
        return head;
    }

    public static void PrintLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    public static Node MergeSortedArray(Node head1,Node head2){
        Node temp1=head1;
        Node temp2=head2;
        Node dummy=new Node(-1);
        Node temp=dummy;
        while(temp1!=null && temp2!=null){
            if(temp1.val<temp2.val){
                temp.next=temp1;
                temp=temp1;
                temp1=temp1.next;
            }
            else{
                temp.next=temp2;
                temp=temp2;
                temp2=temp2.next;
            }
        }
        if(temp1==null){
            temp.next=temp2;
        }
        else{
            temp.next=temp1;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = { 10, 40, 70, 90, 100 };
        int arr1[] = { 20, 30, 40, 50, 60 };
        Node head1 = ArraytoDLL(arr);
        Node head2=ArraytoDLL(arr1);
        Node head=MergeSortedArray(head1, head2);
        PrintLL(head);
    }
}