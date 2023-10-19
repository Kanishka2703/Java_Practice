// Write a Java program to add two matrices of the same size.
import java.util.*;
public class Q16
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int m,n,i,j;
        System.out.println("Enter the no. of rows");
        m=in.nextInt();
        System.out.println("Enter the no. of columns");
        n=in.nextInt();
        int arr1[][]=new int[m][n];
        int arr2[][]=new int[m][n];
        int sum[][]=new int[m][n];
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.println("Enter the element in 1st matrix");
                arr1[i][j]=in.nextInt();
            }
        }
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.println("Enter the element in 2nd matrix");
                arr2[i][j]=in.nextInt();
            }
        }
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                sum[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        System.out.println("Sum of both matrix is :");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(sum[i][j]+"\t");
            }
            System.out.println();
        }
    }
}