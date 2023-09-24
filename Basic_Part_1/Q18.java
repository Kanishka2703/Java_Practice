//Check whether the number is Palindrome or not
import java.util.Scanner;
public class Q18
 {
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n,c,d,r=0;
        System.out.println("Enter the number : ");
        n=in.nextInt();
        c=n;
        do
        {
            d=n%10;
            r=r*10+d;
            n=n/10;
        }while(n!=0);
        if(c==r)
        System.out.println("It is a Palindrome number");
        else
        System.out.println("It is not a Palindrome number");
    }
}