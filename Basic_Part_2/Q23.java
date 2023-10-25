//to find maximum of consecutive ones in an array
import java.util.*;
public class Q23
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int i,maxi=0,count=0,n;
        int arr[]={1,1,0,1,1,1,0,0,1,1};
        n=arr.length;
        for(i=0;i<n;i++)
        {
            if(arr[i]==1)
            {
                count++;  
                maxi=Math.max(maxi, count);
            }
            else
            count=0;
        }
        System.out.println("Maximum consecutive ones are : "+maxi);
    }
}
