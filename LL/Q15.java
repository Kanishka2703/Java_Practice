//add two numbers in the LL
import java.util.*;
public class Q15{
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
    public static Node addTwoNumbers(Node head , Node head1){
        Node dummy=new Node();
        Node temp=dummy;
        int carry=0;
        while(head!=null || head1!=null ||carry==1){
            int sum=0;
            if(head!=null){
                sum+=head.val;
                head=head.next;
            }
            if(head1!=null){
                sum+=head1.val;
                head1=head1.next;
            }
            sum+=carry;
            carry=sum/10;
            Node node=new Node(sum%10);
            temp.next=node;
            temp=temp.next;
        }
        return dummy.next;
    }
    public static void main(String args[]){
        int arr[]={1,2,3};
        Node head=new Node(arr[0]);
        head.next=new Node(arr[1]);
        head.next.next=new Node(arr[2]);
        int arr1[]={1,2,3};
        Node head1=new Node(arr1[0]);
        head1.next=new Node(arr1[1]);
        head1.next.next=new Node(arr1[2]);
        System.out.println("Head of the new LL is :: "+addTwoNumbers(head, head1));
    }
}