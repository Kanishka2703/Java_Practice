//Left rotate an array by one place
import java.util.*;
public class Q20
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int i,temp,n;
        int arr[]=new int[10];
        System.out.println("Enter the no. of arrays : ");
        n=in.nextInt();
        for(i=0;i<n;i++)
        {
            System.out.println("Enter the elements :");
            arr[i]=in.nextInt();
        }
        temp=arr[0];
        for(i=1;i<n;i++)
        {
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
        System.out.println("Array after left rotation");
        for(i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
