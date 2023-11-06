//set matrix zeroes(brute force approach)
import java.util.*;
public class Q44{
static void markrow(ArrayList<ArrayList<Integer>> mtx,int n, int m, int i){
    for(int j=0;j<m;j++){
        if(mtx.get(i).get(j)!=0)
        mtx.get(i).set(j, -1);
    }
}
static void markcol(ArrayList<ArrayList<Integer>> mtx,int n, int m, int j){
    for(int i=0;i<n;i++){
        if(mtx.get(i).get(j)!=0)
        mtx.get(i).set(j, -1);
    }
}
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //ArrayList<ArrayList<Integer>> mtx=new ArrayList<>();
        ArrayList<ArrayList<Integer> > mtx = new ArrayList<ArrayList<Integer> >();
        mtx.add(new ArrayList<>(Arrays.asList(1,1,1)));
        mtx.add(new ArrayList<>(Arrays.asList(1,0,1)));
        mtx.add(new ArrayList<>(Arrays.asList(1,1,1)));
        int n=mtx.size();
        int m=mtx.get(0).size();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mtx.get(i).get(j)==0){
                    markrow(mtx,n,m,i);
                    markcol(mtx,n,m,j);
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mtx.get(i).get(j)== -1)
                mtx.get(i).set(j, 0);
            }
        }
        System.out.println(mtx);
    }
}
