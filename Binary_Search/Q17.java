//to find the row with maximum number of 1's
//brute force
import java.util.*;
public class Q17{
    public static int maxrows1(ArrayList<ArrayList<Integer>> mtx, int n,int m){
        int max_row=-1;
        int index=0;
        for(int i=0;i<n;i++){
            int sum_row=0;
            for(int j=0;j<m;j++){
                sum_row += mtx.get(i).get(j);
            }
            if(sum_row > max_row){
                max_row=sum_row;
                index=i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        ArrayList<ArrayList<Integer>> mtx=new ArrayList<>();
        mtx.add(new ArrayList<>(Arrays.asList(0,0,0)));
        mtx.add(new ArrayList<>(Arrays.asList(0,0,1)));
        mtx.add(new ArrayList<>(Arrays.asList(0,1,1)));
        int n=3,m=3;
        System.out.println("Row with max no. of 1's is:: "+maxrows1(mtx,n,m));
    }
}