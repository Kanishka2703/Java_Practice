//to search a target number in 2D matrix
//optimal approach
import java.util.*;
public class Q21{
    public static boolean searchmatrix(ArrayList<ArrayList<Integer>> mtx, int target){
        int n=mtx.size(); int m=mtx.get(0).size();
        int low=0,high=(n*m)-1;
        while(low<=high){
            int mid=(low+high)/2;
            int row=mid/m; int col=mid%m;
            if(mtx.get(row).get(col)==target){
                return true;
            }else if(mtx.get(row).get(col)>target)
            high=mid-1;
            else
            low=mid+1;
        }
        return false; 
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> mtx = new ArrayList<>();
        mtx.add(new ArrayList<>(Arrays.asList(0, 1, 2, 3)));
        mtx.add(new ArrayList<>(Arrays.asList(4, 5, 6, 7)));
        mtx.add(new ArrayList<>(Arrays.asList(8, 9, 10, 11)));
        mtx.add(new ArrayList<>(Arrays.asList(12, 13, 14, 15)));
        System.out.println("Enter the target number:");
        int target = in.nextInt();
        System.out.println("Result :::::" + "\n" + searchmatrix(mtx, target));
    }
}