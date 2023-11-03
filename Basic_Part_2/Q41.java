//To find the next permutation(optimal approach)
import java.util.*;
public class Q41{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        List<Integer> A = Arrays.asList(new Integer[] {2, 1, 5, 4, 3, 0, 0});
        int n=A.size();
        ArrayList<Integer> list =new ArrayList<>();
        int index=-1;
        for(int i=n-2;i>=0;i--){
            if(A.get(i)<A.get(i+1)){
                index=i;
                break;
            }
        }
        if(index==-1){
            Collections.reverse(A);
            System.out.println(A);
        }
        for(int i=n-1;i>=0;i--){
            if(A.get(i)>A.get(index)){
                int temp=A.get(i);
                A.set(i,A.get(index));
                A.set(index,temp);
                break;
            }
        }
        for(int i=0;i<=index;i++){
            list.add(A.get(i));
        }
        for(int i=n-1;i>index;i--){
            list.add(A.get(i));
        }
        System.out.println(list);
    }
}