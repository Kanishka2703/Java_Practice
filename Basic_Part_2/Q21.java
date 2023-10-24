//to rotate the array by d places
import java.util.*;
public class Q21
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int d,i,n;
        int arr[]=new int[10];
        int temp[]=new int[10];
        System.out.println("Enter the no. of elements in the array :");
        n=in.nextInt();
        System.out.println("Enter the no. of places to be left rotated & it should be less than size of the array :");
        d=in.nextInt();
        for(i=0;i<d;i++)
        {
            temp[i]=arr[i];
        }
        for(i=d;i<n;i++)
        {
            arr[i-d]=arr[i];
        }
        for(i=n-d;i<n;i++)
        {
            arr[i-d]=temp[i-(n-d)];
        }
        System.out.println("Array after "+d+" left rotation :");
        for(i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
