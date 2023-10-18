//to check if the array  is sorted in non-descending order or not
import java.util.*;
public class Q15
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int i,flag=0;
        int arr[]=new int[10];
        System.out.println("Enter the no. of element");
        int n=in.nextInt();
        for(i=0;i<n;i++)
        {
            System.out.println("Enter the number :");
            arr[i]=in.nextInt();
        }
        for(i=1;i<n;i++)
        {
            if(arr[i]<=arr[i+1])
            {
                flag=1;
            }
        }
        if(flag==1)
        System.out.println("Array is sorted in non-descending order");
        else
        System.out.println("Array is not sorted in non-descending order");
    }
}