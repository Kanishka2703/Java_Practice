//display the greatest and the smallest numbers of the arary
import java.util.*;
public class Q2
{
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        int i,max,min;
        int arr[]=new int[10];
        for(i=0;i<10;i++)
        {
            System.out.println("Enter the "+i+ "th number");
            arr[i]=in.nextInt();
        }
        in.close();
        max=arr[0];min=arr[0];
        for(i=0;i<10;i++)
        {
            if(arr[i]<min)
            min=arr[i];
            if(arr[i]>max)
            max=arr[i];
        }
        System.out.println("Greatest number : "+max);
        System.out.println("Smallest number : "+min);
    }
}
