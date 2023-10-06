//Write a Java program to insert an element (specific position) into an array.
import java.util.*;
public class Q6
{
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        int i,addnum,index,n;
        int arr[]=new int[10];
        System.out.println("Enter the no. of element");
        n=in.nextInt();
        for(i=0;i<n;i++)
        {
            System.out.println("Enter the numbers :");
            arr[i]=in.nextInt();
        }
        System.out.println("Enter the element to be added :");
        addnum=in.nextInt();
        System.out.println("Enter the index :");
        index=in.nextInt();
        for(i=n-1;i>=index;i--)
        {
            arr[i+1]=arr[i];
        }
        arr[index]=addnum;
        n++;
        System.out.println("Array after adding number :");
        for(i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}

