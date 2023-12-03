
//to find the row with maximum number of 1's
//Optimal approach
import java.util.*;

public class Q18 {
    public static int lowerbound(ArrayList<Integer> arr, int n, int target) {
        int low = 0, high = n - 1, ans = n;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) >= target) {
                ans = mid;
                high = mid - 1;
            } else
                low = mid + 1;
        }
        return ans;
    }

    public static int maxrows1(ArrayList<ArrayList<Integer>> mtx, int n, int m) {
        int max_rows = -1;
        int index = 0;
        for (int i = 0; i < n; i++) {
            int nof1 = 0;
            nof1 = (m - lowerbound(mtx.get(i), m, 1));
            if (nof1 > max_rows) {
                max_rows = nof1;
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> mtx = new ArrayList<>();
        mtx.add(new ArrayList<>(Arrays.asList(0, 0, 0)));
        mtx.add(new ArrayList<>(Arrays.asList(0, 0, 1)));
        mtx.add(new ArrayList<>(Arrays.asList(0, 0, 1)));
        int n = 3, m = 3;
        System.out.println("Row with max no. of 1's is:: " + maxrows1(mtx, n, m));
    }
}