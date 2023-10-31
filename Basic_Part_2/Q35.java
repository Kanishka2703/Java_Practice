//Find a number that appears once and others twice using hashing
import java.util.*;
public class Q35{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int i,n,op=0;
        int arr[]={2,2,3,3,1,2,2};
        n=arr.length;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for(i=0;i<n;i++){
            if(mpp.containsKey(arr[i]))
            mpp.put(arr[i],i+1);
            else
            mpp.put(arr[i],1);
        }
        for(Map.Entry<Integer,Integer>it:mpp.entrySet()){
            if(it.getValue()==1)
            op=it.getKey();
        }
        System.out.println("Element that appears one time is : "+op);
    }
}