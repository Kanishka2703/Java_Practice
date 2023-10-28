//2 sum problem with brute force 
import java.util.*;
public class Q27
{
    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);
        int i,j,n,target,sum=0;
        int arr[]=new int[5];
        n=arr.length;
        System.out.println("Enter the values in the array:");
        for(i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("Enter the target value :");
        target=in.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    System.out.println("The elements whose sum is equal to target value are :" +arr[i]+ " & "+arr[j]);
                    System.out.println("The postions of the elements are : "+i+ " & "+j);
                }
            }
        }
    }
}
