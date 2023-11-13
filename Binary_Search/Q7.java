//to calculate the floor & ceil of a number in an sorted array
import java.util.*;
public class Q7{
    static int floor(int[] arr, int n,int target){
        int low=0,high=n-1,ans=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]<=target){
                ans=arr[mid];
                low=mid+1;
            }
            else
            high=mid-1;
        }
        return ans;
    }
    static int ceil(int arr[],int n,int target){
        int low=0,high=n-1,ans=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=target){
                ans=arr[mid];
                high=mid-1;
            }
            else
            low=mid+1;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int arr[]={1,3,4,6,7,9};
        int n=arr.length;
        System.out.println("Enter the number :");
        int target=in.nextInt();
        int f=floor(arr,n,target);
        int c=ceil(arr,n,target);
        System.out.println("Floor value is:"+f);
        System.out.println("Ceil value is:"+c);
    }
}