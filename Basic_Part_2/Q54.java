
//to find majority element(n/3)(Better approach)
import java.util.*;

public class Q54 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int var = 0;
        int arr[] = { 1, 1, 1, 1, 3, 2, 2, 2 };
        int n = arr.length;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (mpp.containsKey(arr[i])) {
                mpp.put(arr[i], mpp.get(arr[i] + 1));
            } else
                mpp.put(arr[i], 1);
        }
        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            if (it.getValue() > (n / 3)) {
                var = it.getKey();
            }
        }
        System.out.println(var);
    }
}
