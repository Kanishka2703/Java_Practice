//Find a number that appears once and others twice
import java.util.*;
public class Q24
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int i,j,n,count=0;
        int arr[]={1,1,2,3,3,4,4};
        n=arr.length;
        for(i=0;i<n;i++)
        {
            count=0;
            for(j=0;j<n;j++)
            {
                if(arr[j]==arr[i])
                count++;
            }
        if(count==1)
        System.out.println("Number that occurs only once is : "+arr[i]);
        }
    }
}