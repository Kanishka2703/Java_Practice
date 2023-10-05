//Write a Java program to calculate the average value of array elements.
import java.util.*;
public class Q5
{
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        int len,sum=0,i;
        double avg;
        int arr[]={20, 30, 25, 35, -16, 60, -100};
        len=arr.length;
        for(i=0;i<len;i++)
        {
            sum+=arr[i];
        }
        avg=sum/len;
        System.out.println("Average of all array elements : "+avg);
    }
}
