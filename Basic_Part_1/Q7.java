//Write a Java program to solve quadratic equations
import java.util.*;
public class Q7
{
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        double a,b,c,d,root1,root2;
        System.out.println("Enter the value of a,b,c");
        a=in.nextDouble();
        b=in.nextDouble();
        c=in.nextDouble();
        d=Math.sqrt((b*b)-(4*a*c));
        if(d>=0)
        {
            System.out.println("Roots are real");
            root1=(-b+d)/(2.0*a);
            root2=(-b-d)/(2.0*a);
            System.out.println("The Roots are: " +root1+ " and " +root2);
        }
        else
        {
            System.out.println("Roots are imaginary");
        }
    }
}