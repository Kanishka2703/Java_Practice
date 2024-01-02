
//to insert the element at kth position
import java.util.*;

import org.w3c.dom.Node;

public class Q18 {
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

    public static Node Insertkth(Node head, int element, int k) {
        if (head == null) {
            if (k == 1) {
                return new Node(element);
            } else {
                return head;
            }
        }
        if (k == 1) {
            return new Node(element, head);
        }
        int cnt = 0;
        Node temp = head;
        while (temp != null) {
            cnt++;
            if (cnt == (k - 1)) {
                Node newnode = new Node(element, temp.next);
                temp.next = newnode;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = { 10, 20, 30, 40, 50 };
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next.next = new Node(arr[3]);
        head.next.next.next.next = new Node(arr[4]);
        PrintLL(head);
        System.out.println("After inserting the node at kth position in LL");
        Insertkth(head, 100, 1);
        PrintLL(head);
    }
}