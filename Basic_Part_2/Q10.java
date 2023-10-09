//Write a Java program to find duplicate values in an array of integer values.
import java.util.*;
public class Q10
{
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        int i,j,n,dp,flag=0;
        int arr[]=new int[10];
        System.out.println("Enter the no. of element");
        n=in.nextInt();
        for(i=0;i<n;i++)
        {
            System.out.println("Enter the number :");
            arr[i]=in.nextInt();
        }
        for(i=0;i<n-1;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    flag=1;
                    dp=arr[j];
                    System.out.println("Duplicate values : " +dp);
                }
            }
        }
        if(flag==0)
        System.out.println("No Duplicate values : ");
    }
}