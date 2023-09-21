//factorial of any number
import java.util.*;
public class Q13
{
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        int n,fact=1,i;
        System.out.println("Enter the number ");
        n=in.nextInt();
        for(i=n;i>=1;i--)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of " +n+ " is = " +fact);
    }
}
