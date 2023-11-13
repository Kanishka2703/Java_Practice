//to search the index of target value in sorted array using lower bound concept
import java.util.*;
public class Q6{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int arr[]={1,2,3,4,6};
        int n=arr.length;
        int low=0,high=n-1,ans=n;
        System.out.println("Enter the target number:");
        int target=in.nextInt();
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=target){
                ans=mid;
                high=mid-1;
            }
            else
            low=mid+1;
        }
        System.out.println("Target number index should be :"+ans);
    }
}

