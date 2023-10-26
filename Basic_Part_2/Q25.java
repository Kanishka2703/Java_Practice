//to find the length of the longest subarray with sum k
import java.util.*;
public class Q25
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int i,j,k,sum=0,longest=0,s,n;
        int arr[]={1,2,3,1,1,1,4,2,3};
        n=arr.length;
        System.out.println("Enter the sum value : ");
        s=in.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                sum=0;
                for(k=i;k<=j;k++)
                {
                    sum+=arr[k];
                }
                if(sum==s)
                longest=Math.max(longest,j-i+1);
            }
        }
        System.out.println("Length of the longest subarray with sum "+s+" is : "+longest);
    }
}
