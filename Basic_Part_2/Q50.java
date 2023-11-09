//to print the pascal triangle
import java.util.*;

public class Q50 {
    public static int nCr(int n, int r) {
        int res = 1;
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;
    }

    public static void pascaltriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int c = 1; c <= i; c++) {
                System.out.print(nCr(i - 1, c - 1) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 6;
        pascaltriangle(n);
    }
}
