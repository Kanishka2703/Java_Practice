
//to calculate the first & last occurrence of a number in an sorted array
//optimal approach
import java.util.*;

public class Q9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = { 1, 2, 3, 3, 3, 3, 3, 3, 4, 5 };
        int n = arr.length;
        System.out.println("Enter the number::::");
        int target = in.nextInt();
        int low = 0, high = n - 1, first = -1, last = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= target) {
                first = mid;
                high = mid - 1;
            } else
                low = mid + 1;
        }
        low = 0;
        high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > target) {
                last = mid;
                high = mid - 1;
            } else
                low = mid + 1;
        }
        if (first != -1 && last != -1) {
            System.out.println("First occurrence is :" + first);
            System.out.println("Last occurrence is :" + (last - 1));
        } else
            System.out.println("First & last occurrence is -1,-1 ");
    }
}
