//to implement upper bound with optimal approach
import java.util.*;
public class Q5{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int arr[]={1,2,3,3,3,3,3,3,4,5};
        int n=arr.length;
        int low=0,high=n-1;
        int ans=n;
        System.out.println("Enter the number::");
        int target=in.nextInt();
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>target){
                ans=mid;
                high=mid-1;
            }
            else
            low=mid+1;
        }
        System.out.println("Upper bound is at index of "+ans);
    }
}