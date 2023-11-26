//search in an rotated array that contains duplicate
import java.util.*;

public class Q13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = { 3, 1, 2, 3, 3, 3, 3 };
        int n = arr.length;
        System.out.println("Enter the element::");
        int target = in.nextInt();
        int low = 0, high = n - 1, ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                ans = mid;
                System.out.println("Target is present");
                break;
            }
            if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
                low++;
                high--;
                continue;
            }
            if (arr[low] <= arr[mid]) {
                if (arr[low] <= target && target <= arr[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            } else {
                if (arr[mid] <= target && target <= arr[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        if (ans == -1)
            System.out.println("Target is not present");
    }
}