//To find longest consecutive subsequence(Optimal approach)
import java.util.*;
public class Q47 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int longest=1;
        int arr[]={100, 200, 1, 2, 3, 4};
        int n=arr.length;
        HashSet<Integer> hash =new HashSet<>();
        for(int i=0;i<n;i++){
            hash.add(arr[i]);
        }
        for(int it: hash){
            if(!hash.contains(it-1)){
                int count=1;
                int x=it;
                while(hash.contains(x+1)){
                    count+=1;
                    x+=1;
                }
                longest=Math.max(longest,count);
            }
        }
        System.out.println(longest);
    }
}