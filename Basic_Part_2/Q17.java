//Write a Java program to find all pairs of elements in an array whose sum is equal to a specified number
import java.util.*;
public class Q17
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n,i,j,sum;
        System.out.println("Enter the specified number");
        sum=in.nextInt();
        System.out.println("Enter the no. of elements");
        n=in.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            System.out.println("Enter the element in array");
            arr[i]=in.nextInt();
        }
        for (i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(arr[i]+arr[j]==sum)
                {
                    System.out.println("Pairs of elements whose sum is "+sum+" = "+arr[i]+" & "+arr[j]);
                }
            }
        }
    }
}
