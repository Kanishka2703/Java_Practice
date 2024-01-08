package SLL;
//to sort the 0's 1's and 2's in the LL by brute force
import java.util.*;

import org.w3c.dom.Node;

public class Q24 {
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

    public static Node sort012(Node head) {
        int cnt0 = 0, cnt1 = 0, cnt2 = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.val == 0)
                cnt0++;
            else if (temp.val == 1)
                cnt1++;
            else
                cnt2++;
            temp = temp.next;
        }
        temp = head;
        while (temp != null) {
            if (cnt0 != 0) {
                temp.val = 0;
                cnt0--;
            } else if (cnt1 != 0) {
                temp.val = 1;
                cnt1--;
            } else {
                temp.val = 2;
                cnt2--;
            }
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = { 2, 0, 2, 1, 2, 0, 1, 1, 2 };
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next.next = new Node(arr[3]);
        head.next.next.next.next = new Node(arr[4]);
        head.next.next.next.next.next = new Node(arr[5]);
        head.next.next.next.next.next.next = new Node(arr[6]);
        head.next.next.next.next.next.next.next = new Node(arr[7]);
        head.next.next.next.next.next.next.next.next = new Node(arr[8]);
        PrintLL(head);
        System.out.println("After sorting 0's 1's 2's in the LL");
        sort012(head);
        PrintLL(head);
    }
}
