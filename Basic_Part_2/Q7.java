//perform binary search technique
import java.util.*;
public class Q7
{
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        int i,mid=0,lb=0,ub=9,ns,flag=0;
        int arr[]=new int[10];
        for(i=0;i<10;i++)
        {
            System.out.println("Enter the number : ");
            arr[i]=in.nextInt();
        }
        System.out.println("Enter the number to be searched : ");
        ns=in.nextInt();
        while(lb<=ub)
        {
            mid=(lb+ub)/2;
            if(arr[mid]<ns)
            lb=mid+1;
            if(arr[mid]>ns)
            ub=mid-1;
            if(arr[mid]==ns)
            {
            flag=1;
            break;
            }
        }
        if(flag==1)
        System.out.println("SEARCH IS SUCCESSFULL");
        else
        System.out.println("SEARCH IS NOT SUCCESSFULL");
    }
} 
