//To find the maximum subarray sum(better approach)
import java.util.*;
public class Q38
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int i,j,sum=0,count=0,n;
        n=in.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            sum=0;
            for(j=i;j<n;j++)
            {
                sum+=arr[j];
                if(sum<0)
                count++;
            }
        }
        System.out.println(count);
    }
}



