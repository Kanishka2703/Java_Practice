//to find the first & last occurrence of a number in an sorted array 
//brute force
import java.util.*;
public class Q8{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int arr[]={1,2,3,3,3,3,3,4,5};
        int n=arr.length;
        System.out.println("Enter the number:::");
        int target=in.nextInt();
        int first=-1,last=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                first=i;
                break;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                last=i;
            }
        }
        System.out.println("First occurence of the number is "+first);
        System.out.println("last occurence of the number is "+last);
    }
}