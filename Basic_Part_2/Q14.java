//Write a Java program to find the second smallest element in an array.
import java.util.*;
public class Q14
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int smallest,ssmallest=-1,i;
        int arr[]=new int[10];
        System.out.println("Enter the no. of element");
        int n=in.nextInt();
        for(i=0;i<n;i++)
        {
            System.out.println("Enter the number :");
            arr[i]=in.nextInt();
        }
        smallest=arr[0];
        for(i=0;i<n;i++)
        {
            if(arr[i]<smallest)
            {
                ssmallest=smallest;
                smallest=arr[i];
            }
            else if(arr[i]>smallest && arr[i]<ssmallest)
            ssmallest=arr[i];
            
        }
        System.out.println("Second smallest number in the array is :- ");
        System.out.println(ssmallest);
    }
}

