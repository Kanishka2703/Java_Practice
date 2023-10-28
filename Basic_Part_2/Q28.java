//2 sum problem with better approach
import java.util.*;
import java.util.HashMap;

public class Q28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, req = 0, target = 14, flag = 0;
        int[] arr = { 2, 6, 5, 8, 11 };
        int n = arr.length;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (i = 0; i < n; i++) {
            req = target - arr[i];
            if (mpp.containsKey(req)) {
                System.out.println("Yes possible ");
                System.out.println(arr[i] + " & " + req);
                flag = 1;
            }
            mpp.put(arr[i], i);
        }
        if (flag == 0)
            System.out.println("not possible ");
    }
}
