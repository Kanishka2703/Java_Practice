//to accept 10 different numbers and display the sum of those numbers that are divisible by either 3 or 5
import java.util.*;
public class Q34
{
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        int i,sum=0;
        int arr[]=new int[10];
        for(i=0;i<10;i++)
        {
            System.out.println("Enter the "+i+"th number :");
            arr[i]=in.nextInt();
        }
        for(i=0;i<10;i++)
        {
            if(arr[i]%3==0||arr[i]%5==0)
            sum+=arr[i];
        }
        System.out.println("Sum of those numbers is : " +sum);
    }
}
