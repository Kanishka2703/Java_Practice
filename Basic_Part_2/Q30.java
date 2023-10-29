//Sort an array of 0's 1's 2's with optimal approach (Dutch National Flag Algorithm)
import java.util.*;
public class Q30
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int i,mid=0,low=0,n,t;
        System.out.println("Enter the length of the array ::");
        n=in.nextInt();
        int high=n-1;
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array that can only be 0,1,2 ::: ");
        for(i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        while(mid<=high)
        {
            if(arr[mid]==0)
            {
                t=arr[low];
                arr[low]=arr[mid];
                arr[mid]=t;
                low++;
                mid++;
            }
            else if(arr[mid]==1)
            {
                mid++;
            }
            else
            {
                t=arr[high];
                arr[high]=arr[mid];
                arr[mid]=t;
                high--;
            }
        }
        System.out.println("array after sorting");
        for(i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
