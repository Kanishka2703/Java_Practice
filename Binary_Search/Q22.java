//search in a row & column-wise sorted matrix
//better approach
//to search a target number in 2D matrix
//better approach
import java.util.*;

public class Q22 {
    public static int binarySearch(ArrayList<Integer> arr, int target) {
        int n = arr.size();
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == target){
                return mid;
            }
            else if (arr.get(mid) > target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    public static int searchmatrix(ArrayList<ArrayList<Integer>> mtx, int target) {
        int n = mtx.size();
        int m = mtx.get(0).size();
        int col=-1;
        ArrayList<ArrayList<Integer>> lst = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (mtx.get(i).get(0) <= target && target <= mtx.get(i).get(m - 1)){
                col=binarySearch(mtx.get(i), target);
            }
            lst.add(i);
            lst.add(col);
            return lst;
        }
        return -1;
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
        int col;
        System.out.println(searchmatrix(mtx, target));
    }
}
