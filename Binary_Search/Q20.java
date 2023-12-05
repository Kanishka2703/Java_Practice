
//to search a target number in 2D matrix
//better approach
import java.util.*;

public class Q20 {
    public static boolean binarySearch(ArrayList<Integer> arr, int target) {
        int n = arr.size();
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == target)
                return true;
            else if (arr.get(mid) > target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return false;
    }

    public static boolean searchmatrix(ArrayList<ArrayList<Integer>> mtx, int target) {
        int n = mtx.size();
        int m = mtx.get(0).size();
        for (int i = 0; i < n; i++) {
            if (mtx.get(i).get(0) <= target && target <= mtx.get(i).get(m - 1))
                return binarySearch(mtx.get(i), target);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> mtx = new ArrayList<>();
        mtx.add(new ArrayList<>(Arrays.asList(0, 1, 2, 3)));
        mtx.add(new ArrayList<>(Arrays.asList(4, 5, 6, 7)));
        mtx.add(new ArrayList<>(Arrays.asList(8, 9, 10, 11)));
        mtx.add(new ArrayList<>(Arrays.asList(12, 13, 14, 15)));
        System.out.println("Enter the target number:");
        int target = in.nextInt();
        System.out.println("Result :::::" + "\n" + searchmatrix(mtx, target));
    }
}
