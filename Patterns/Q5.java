package Java_Practice.Patterns;
import java.util.*;
public class Q5{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        for(int i=5;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

