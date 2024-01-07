package SLL;
//returning the head only of the rotated LL
//to rotate the LL
import java.util.*;

import org.w3c.dom.Node;

public class Q23 {
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

    public static void PrintLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static Node findnewlastNode(Node temp, int k) {
        int cnt = 1;
        while (temp != null) {
            if (cnt == k)
                return temp;
            cnt++;
            temp = temp.next;
        }
        return temp;
    }

    public static Node Rotatektimes(Node head, int k){
        if(head==null || k==0)
        return head;
        Node tail=head;
        int len=1;
        while(tail.next!=null){
            len++;
            tail=tail.next;
        }
        if(k%len==0)
        return head;
        k=k%len;
        tail.next=head;
        Node newlastNode=findnewlastNode(head , len - k);
        head=newlastNode.next;
        newlastNode.next=null;
        return head;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = { 1, 2, 3, 4, 5 };
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next.next = new Node(arr[3]);
        head.next.next.next.next = new Node(arr[4]);
        PrintLL(head);
        System.out.println("LL after rotating k times::");
        Node ans=Rotatektimes(head, 2);
        System.out.println(ans.val);
    }
}
