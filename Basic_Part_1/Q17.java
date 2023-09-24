//Check whether the number is neon or not
import java.util.Scanner;
public class Q17
 {
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int num,sum=0,d,p=1;
        System.out.println("Enter the number : ");
        num = in.nextInt();
        p=num*num;
        while(p!=0)
        {
        d=p%10;
        sum+=d;
        p=p/10;
        }
        if(sum==num)
        System.out.println("Number is Neon number");
        else
        System.out.println("Number is not a Neon number");
    }
 }
