
//to find the minimum in rotated sorted array with distinct values
import java.util.*;

public class Q14 {
    public static int min(int arr[]){
        int n = arr.length;
        int low = 0, high = n - 1, mini = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[low] <= arr[mid]) {
                mini = Math.min(mini, arr[low]);
                low = mid + 1;
            } else {
                mini = Math.min(mini, arr[mid]);
                high = mid - 1;
            }
        }
        return mini;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = { 4, 5, 1, 2, 3 };
        int m=min(arr);
        System.out.println("Minimum element in the rotated sorted array is :" + m);
    }
}
