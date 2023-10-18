//Write a Java program to find the second largest element in an array.
import java.util.*;
public class Q13
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int largest,slargest=-1,i;
        int arr[]=new int[10];
        System.out.println("Enter the no. of element");
        int n=in.nextInt();
        for(i=0;i<n;i++)
        {
            System.out.println("Enter the number :");
            arr[i]=in.nextInt();
        }
        largest=arr[0];
        for(i=0;i<n;i++)
        {
            if(arr[i]>largest)
            {
                slargest=largest;
                largest=arr[i];
            }
            else if(arr[i]<largest && arr[i]>slargest)
            slargest=arr[i];
        }
        System.out.println("Second largest number in the array is :- ");
        System.out.println(slargest);
    }
}
