//to find missing number using brute force approach
import java.util.*;
public class Q22
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int i,j=1,n;
        int arr[]={1,2,4,5};
        n=arr.length;
        for(i=0;i<n;i++)
        {
            if(arr[i]!=j)
            {
                System.out.println("Missing number is : "+j);
                break;
            }
            else
            j++;
        }
    }
}