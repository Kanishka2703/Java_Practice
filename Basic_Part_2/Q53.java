//2 sum problem(Optimal aaproach)
import java.util.*;
public class Q53{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int arr[]={2,5,6,8,11};
        int n=arr.length;
        int target=in.nextInt();
        int i=0,j=n-1;
        Arrays.sort(arr);
        while(i<j){
            if(arr[i]+arr[j]==target){
            System.out.println("Sum of "+arr[i]+" & "+arr[j]+" = "+target);
            break;
            }
            else if(arr[i]+arr[j]<target)
            i++;
            else
            j--;
        }
    }
}
