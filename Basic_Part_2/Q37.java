//To find the maximum subarray sum(brute force)
import java.util.*;
public class Q37
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int i,j,k,sum=0,longest=0,s,n;
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        n=arr.length;
        for(i=0;i<n;i++)
        {
            for(j=i;j<n;j++)
            {
                sum=0;
                for(k=i;k<=j;k++)
                {
                    sum+=arr[k];
                    longest=Math.max(longest,sum);
                }
            }
        }
        System.out.println("maximum subarray sum is : "+longest);
    }
}

