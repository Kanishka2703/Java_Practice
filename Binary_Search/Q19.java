//to search a target number in 2D matrix
//brute force
import java.util.*;
public class Q19{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> mtx=new ArrayList<>();
        mtx.add(new ArrayList<>(Arrays.asList(0,1,2,3)));
        mtx.add(new ArrayList<>(Arrays.asList(4,5,6,7)));
        mtx.add(new ArrayList<>(Arrays.asList(8,9,10,11)));
        mtx.add(new ArrayList<>(Arrays.asList(12,13,14,15)));
        System.out.println("Enter the target number:");
        int target=in.nextInt();
        int flag=0;
        int n=mtx.size(); int m=mtx.get(0).size();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mtx.get(i).get(j)==target){
                    flag=1;
                    System.out.println("Element is present in the 2d array");
                    break;
                }
            }
        }
        if(flag==0)
        System.out.println("Element is not present");
    }
}