//To perform the binary search
import java.util.*;
public class Q1{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int arr[]={1,2,3,4,5,6,7,8,9};
        int n=arr.length;
        System.out.println("Enter the element to be searched :");
        int target=in.nextInt();
        int mid=0;
        int low=0,high=n-1,flag=0;
        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]==target){
                flag=1;
                break;
            }
            else if(mid<target)
                low=mid+1;
            else if(mid>target)
            high=mid-1;
        }
        if(flag==1)
        System.out.println("Element "+arr[mid]+" is present at "+mid+"th "+"location.");
        else
        System.out.println("Element is not present");
    }
}
