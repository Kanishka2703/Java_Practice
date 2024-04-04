import java.util.*;
public class Q7{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<i*2+1;k++){
                System.out.print("*");
            }
            // for(int j=0;j<n-i-1;j++){
            //     System.out.print(" ");
            // }
            System.out.println();
        }
    }
}
