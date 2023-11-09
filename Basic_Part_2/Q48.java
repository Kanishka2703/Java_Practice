//To find the element in pascal triangle
import java.util.*;
public class Q48{
public static int nCr(int n, int r){
    int res=1;
    for(int i=0;i<r;i++){
        res=res*(n-i);
        res=res/(i+1);
    }
    return res;
}
    public static int pascaltriangle(int n, int r){
    int element=(int) nCr(n-1,r-1);
    return element;
}
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=6;
        int r=4;
        int element=pascaltriangle(n,r);
        System.out.println("The element is ::: "+element);
    }
}
