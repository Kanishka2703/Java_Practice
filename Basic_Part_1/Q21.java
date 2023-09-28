import java.util.*;
public class Q21
{
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the triangle sides");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        if((a+b>c)&&(b+c>a)&&(c+a>b))
        {
            System.out.println("Triangle is possible");
            if((a==b)&&(b==c)&&(c==a))
            System.out.println("Triangle is Equilateral");
            if((a==b)||(b==c)||(c==a))
            System.out.println("Triangle is Iso-sceles");
            if((a!=b)&&(b!=c)&&(c!=a))
            System.out.println("Triangle is Scalene");
        }
        else
        System.out.println("Triangle is not possible");
    }
}