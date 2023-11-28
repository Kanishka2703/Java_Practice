//to calculate how many times the sorted array is rotated
//Optimal approach
import java.util.*;
public class Q15{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int arr[]={4, 5, 6, 7, 0, 1, 2, 3};
        int n=arr.length;
        int low=0,high=n-1,rot=0,mini=Integer.MAX_VALUE;
        while(low<=high){
            int mid=(low+high)/2;
            //complete array is sorted
            if(arr[low]<=arr[high]){
                if(arr[low]<mini){
                    mini=arr[low];
                    rot=low;
                }
                break;
            }
            if(arr[low]<=arr[mid]){
                if(arr[low]<mini){
                    rot=low;
                    mini=arr[low];
                }
                low=mid+1;
            }else{
                if(arr[mid]<mini){
                    rot=mid;
                    mini=arr[mid];
                }
                high=mid-1;
            }
        }
        System.out.println("Number of times array is rotated is ::"+rot);
    }
}

