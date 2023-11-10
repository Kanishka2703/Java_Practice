//to find the majority element(element that occurs[>n/3])(brute force)
import java.util.*;

public class Q52 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = {1,1,1,1,3, 2, 2, 2};
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
        
                int count = 0;
                for (int j = 0; j < n; j++) {
                    if (arr[i] == arr[j])
                        count++;
                }
                if (count > (n / 3) && !list.contains(arr[i]))
                list.add(arr[i]);
        }
        System.out.print(list);
    }
}
