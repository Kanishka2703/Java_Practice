//to find the longest consecutive sequence(brute force approach)
import java.util.*;
public class Q45{
public static boolean ls(int arr[],int num){
    int n=arr.length;
    for(int i=0;i<n;i++){
        if(arr[i]==num)
        return true;
    }
    return false;
}
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int arr[]={102,4,100,1,101,3,5,2,0};
        int x=0,count=1;
        int n=arr.length;
        int longest=1;
        for(int i=0;i<n;i++){
            x=arr[i];
            count=1;
        }
        while(ls(arr,x+1)==true){
            x=x+1;
            count=count+1;
        longest=Math.max(longest,count);
        }
        System.out.println(longest);
    }
}
