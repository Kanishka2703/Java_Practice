//To calculate the lower bound with brute force
import java.util.*;
public class Q2{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int arr[]={3,5,8,15,19};
        int n=arr.length;
        int flag=0;
        System.out.println("Enter the number ");
        int target=in.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]>=target){
                flag=1;
                System.out.println("lower bound is of index "+i);
                break;
            }
        }
        if(flag==0)
        System.out.println("Lower bound is "+n);
    }
}
