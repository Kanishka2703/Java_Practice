//Accept two nos. and find the Greatest Common Divisor
import java.util.*;
public class Q15
{
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        int num1,num2,gcd=0,p=1,i;
        System.out.println("Enter the first number ");
        num1=in.nextInt();
        System.out.println("Enter the second number ");
        num2=in.nextInt();
        p=num1*num2;
        for(i=1;i<=p;i++)
        {
            if(num1%i==0 && num2%i==0)
            gcd=i;
        }
        System.out.println("G.C.D of both numbers " +num1+ " & " +num2+ " is = " +gcd);
    }
}
