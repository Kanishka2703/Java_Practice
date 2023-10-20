
//Write a Java program to move all 0's to the end of an array.
// Maintain the relative order of the other (non-zero) array elements.
import java.util.*;

public class Q19 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int i, j, t;
        int arr[] = { 0, 0, 1, 3, 0 };
        System.out.println("Initial array :");
        for (i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        i = 0;j=0;
        while(j < arr.length) {
            if (arr[j] == 0)
                j++;
            else {
                t = arr[j];
                arr[i] = arr[j];
                arr[j] = t;
                i++;
                j++;
            }
        }
        while(i< arr.length)
        {
            arr[i++]=0;
        }
        System.out.println(" array after .... :");
        for (i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
