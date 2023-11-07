//To find longest consecutive subsequence(Better approach)
import java.util.*;
public class Q46{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int arr[]={100, 200, 1, 2, 3, 4};
        int n=arr.length;
        int longest=1,count=0,lastsmaller=Integer.MIN_VALUE;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(arr[i]-1==lastsmaller){
                count+=1;
                lastsmaller=arr[i];
            }
            else if(arr[i]!=lastsmaller){
                count=1;
                lastsmaller=arr[i];
            }
        longest=Math.max(longest,count);
        }
        System.out.println(longest);
    }
}