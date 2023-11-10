//to find the longest common prefix
import java.util.*;
public class Q1{
    public static String commonPrefix(String[] arr,int n){
        String result="";
        if(n==0)
        System.out.println("No common prefix");
        else if(n==1)
        System.out.println(arr[0]);
        else{
            Arrays.sort(arr);
            int len=arr[0].length();
            StringBuilder res=new StringBuilder();
            for(int i=0;i<len;i++){
                if(arr[0].charAt(i)==arr[n-1].charAt(i)){
                    res.append(arr[0].charAt(i));
                }
                else 
                break;
            }
            result=res.toString();
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String[] arr={"mini","mint","minions","miniatures","minerals"};
        int n=arr.length;
        System.out.println("Longest Common Prefix is "+commonPrefix(arr, n) );
    }
}