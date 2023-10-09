//Write a Java program to find duplicate values in an array of string values.
import java.util.*;
public class Q11
{
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        int i,j,n,flag=0;
        String b="";
        String arr[]=new String[10];
        System.out.println("Enter the no. of element");
        n=in.nextInt();
        for(i=0;i<n;i++)
        {
            System.out.println("Enter the string values :");
            arr[i]=in.nextLine();
        }
        for(i=0;i<n-1;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(arr[i].equals(arr[j])==true)
                {
                    flag=1;
                    b=arr[j];
                    System.out.println("Duplicate vaules are :" +b);
                }
            }
        }
        if(flag==0)
        System.out.println("No duplicate value ");
    }
}