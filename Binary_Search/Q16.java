
//to find the peak element with optimal approach
import java.util.*;

public class Q16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 5, 1 };
        int n = arr.length;
        if (n == 1) {
            System.out.println("Peak element is ::" + arr[0]);
        }
        if (arr[0] > arr[1])
            System.out.println("Peak element is ::" + arr[0]);
        if (arr[n - 1] > arr[n - 2])
            System.out.println("Peak element is ::" + arr[n - 1]);
        int low = 1, high = n - 2;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid - 1] < arr[mid] && arr[mid] > arr[mid + 1])
                System.out.println("Peak element is ::" + arr[mid]);
            if (arr[mid - 1] < arr[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }
    }
}
