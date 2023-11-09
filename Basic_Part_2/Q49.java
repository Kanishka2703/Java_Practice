//to print the nth row of the pascal triangle
import java.util.*;
public class Q49{
public static int nCr(int n, int r){
    int res=1;
    for(int i=0;i<r;i++){
        res=res*(n-i);
        res=res/(i+1);
    }
    return res;
}
    public static void pascaltriangle(int n){
    for(int c=1;c<=n;c++){
        System.out.print(nCr(n-1,c-1)+" ");
    }
    System.out.println();
}
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=6;
        pascaltriangle(n);
    }
}
