//to find the leaders of the array(Optimal approach)
import java.util.*;
public class Q43{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int arr[]={10,22,12,3,0,6};
        int n=arr.length;
        ArrayList<Integer> list=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            if(arr[i]>max){
                list.add(arr[i]);
                max=arr[i];
            }
        }
        System.out.println(list);
    }
}
