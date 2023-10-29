//Sort the array of 0's 1's and 2's with better approach
import java.util.*;
public class Q29
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int i,count0=0,count1=0,count2=0,n;
        System.out.println("Enter the number of elements : ");
        n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements in the array : Range- 0,1,2 only :");
        for(i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(arr[i]==0)
            count0++;
            if(arr[i]==1)
            count1++;
            if(arr[i]==2)
            count2++;
        }
        System.out.println("OUTPUT IS :");
        for(i=0;i<count0;i++)
        {
            System.out.println(arr[i]=0);
        }
        for(i=count0;i<count0+count1;i++)
        {
            System.out.println(arr[i]=1);
        }
        for(i=count0+count1;i<n;i++)
        {
            System.out.println(arr[i]=2);
        }
    }
}
