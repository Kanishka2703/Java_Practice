//To find the majority element with optimal approach(Moore's Voting Algorithm)
import java.util.*;
public class Q36 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int count=0,el=0;
        int arr[]={1,1,1,1,1,1,1,1,2,3,4};
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(count==0){
                count=1;
                el=arr[i];
            }
            else if(el==arr[i])
            count++;
            else
            count--;
        }
        int count1=0;
        for(int i=0;i<n;i++){
            if(arr[i]==el)
            count1++;
        }
        if(count1>(n/2))
        System.out.println("Majority element is : "+el);
        else
        System.out.println("No Majority element exists");
    }
}
