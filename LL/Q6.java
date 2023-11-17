//to search the element in the LL.
import java.util.*;
public class Q6{
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
    public static int SearchElement(Node head,int k){
        int flag=0;
        Node temp=head;
        while(temp!=null){
            if(temp.val==k){
            flag=1;
            break;
        }
        temp=temp.next;
        }
        if(flag==1)
        return 1;
        else 
        return 0;
    }
    public static void main(String[] args) {
        Node head=null;
        head=InsertatFirst(50, head);
        head=InsertatFirst(40, head);
        head=InsertatFirst(30, head);
        head=InsertatFirst(20, head);
        head=InsertatFirst(10, head);
        System.out.println("STATUS IS::: "+SearchElement(head,30));
    }
}