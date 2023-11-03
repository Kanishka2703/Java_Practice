//To find the sum of longest subarray(Kadane's algorithm)
import java.util.*;
public class Q39
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int i,n,start=0,ansstart=-1,ansend=-1,sum=0,max=Integer.MIN_VALUE;
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        n=arr.length;
        for(i=0;i<n;i++)
        {
            if(sum==0)
            start=i;
            sum+=arr[i];
            if(sum>max)
            {
                max=sum;
                ansstart=start;
                ansend=i;
            }
            if(sum<0)
            sum=0;
        }
        System.out.println("Longest sum of subarray is : "+max);
        System.out.print("The subarray is: [");
        for (i = ansstart; i <= ansend; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]\n");

    }
}
