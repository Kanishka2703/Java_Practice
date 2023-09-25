//Check whether the number is Armstrong or not
import java.util.Scanner;
public class Q19
 {
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int num,d,sum=0,c;
        System.out.println("Enter the number : ");
        num=in.nextInt();
        c=num;
        while(num!=0)
        {
            d=num%10;
            sum=sum+d*d*d;
            num=num/10;
        }
        if(sum==c)
        System.out.println("It is a Armstrong number");
        else
        System.out.println("It is not a Armstrong number");
    }
 }
