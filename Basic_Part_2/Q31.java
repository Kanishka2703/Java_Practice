//To find the majority elements(>n/2)
import java.util.*;
public class Q31
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int i,j,n,count=0;
        int arr[]={2,2,3,3,1,2,2};
        n=arr.length;
        for(i=0;i<n;i++)
        {
            count=0;
            for(j=0;j<n;j++)
            {
                if(arr[j]==arr[i])
                count++;
            }
            if(count>(n/2))
            System.out.println("Majority element is  : "+arr[i]);
            break;
        }
        if(count==0)
        System.out.println("No majority element is present in the array");
    }
}
