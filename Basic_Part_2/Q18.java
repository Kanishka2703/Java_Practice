
//Write a Java program to test two arrays' equality.
import java.util.*;

public class Q18 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int i, n, flag = 0;
        int arr1[] = new int[10];
        int arr2[] = new int[10];
        System.out.println("Enter the no. of element");
        n = in.nextInt();
        for (i = 0; i < n; i++) {
            System.out.println("Enter the elements for 1st array :");
            arr1[i] = in.nextInt();
        }
        for (i = 0; i < n; i++) {
            System.out.println("Enter the elements for 2nd array :");
            arr2[i] = in.nextInt();
        }
        for (i = 0; i < n; i++) {
            if (arr1[i] == arr2[i]) {
                flag = 1;
            }
        }
        if (flag == 1)
            System.out.println("Equality check pass on both arrays");
        else
            System.out.println("Equality check doesn't pass on both arrays");
    }
}
