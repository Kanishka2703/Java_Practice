//search in an rotated sorted array of unique elements
import java.util.*;

public class Q12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = { 7, 8, 9, 1, 2, 3, 4, 5, 6};
        int n = arr.length;
        System.out.println("Enter the element::");
        int target = in.nextInt();
        int low = 0, high = n - 1, ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                ans = mid;
                System.out.println("Element " + arr[ans] + " is present at " + ans + "th index");
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
        if(ans==-1)
        System.out.println("Element is not present");
    }
}