//to reaarange the array elements by sign(Brute force)
import java.util.*;
class Q40 {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n = 6;
        int A[]= {3,1,-2,-5,2,-4};
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(A[i]>0) pos.add(A[i]);
            else neg.add(A[i]);
        }
        for(int i=0;i<n/2;i++){
            A[2*i] = pos.get(i);
            A[2*i+1] = neg.get(i);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(A[i]+" ");
         }
    }
}    
         
