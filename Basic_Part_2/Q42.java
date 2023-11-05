//To find the leaders of the array(Brute force)
import java.util.*;
public class Q42{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int arr[]={10,22,12,3,0,6};
        int n=arr.length;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            int leader=1;
            for(int j=i+1;j<n;j++){
                if(arr[j]>arr[i]){
                    leader=0;
                    break;
                }
            }
            if(leader==1)
            list.add(arr[i]);
        }
        System.out.println("Sorted leaders in the array are: ");
        Collections.sort(list);
        System.out.println(list);
    }
}

