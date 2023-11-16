
//to implement first & last occurence without using lb & ub
//by using binary search only
import java.util.*;

public class Q10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = { 1, 2, 3, 3, 3, 3, 3, 3, 4, 5 };
        int n = arr.length;
        System.out.println("Enter the number::::");
        int target = in.nextInt();
        int low = 0, high = n - 1, first = -1, last = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                first = mid;
                high = mid - 1;
            } else if (arr[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        System.out.println("First occurence is :" + first);
        low = 0;
        high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                last = mid;
                low = mid + 1;
            } else if (arr[mid] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        System.out.println("Last occurence is :" + last);
    }
}
