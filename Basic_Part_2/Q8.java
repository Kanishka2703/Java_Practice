//Perform linear search technique
import java.util.*;
public class Q8
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int search,i,present=0;
        int arr[]=new int[10];
        for(i=0;i<10;i++)
        {
            System.out.println("Enter the numbers in the array : ");
            arr[i]=in.nextInt();
        }
        System.out.println("Enter the number to be searched : ");
        search=in.nextInt();
        for(i=0;i<10;i++)
        {
            if(arr[i]==search)
            present=1;
        }
        if(present==1)
        System.out.println("Number is present");
        else
        System.out.println("Number is not present");
    }
}
