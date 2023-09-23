//Checking for the perfect number
import java.util.*;
public class Q16
{
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        int num,i,sum=0;
        System.out.println("Enter the number ");
        num=in.nextInt();
        for(i=1;i<num;i++)
        {
            if(num%i==0)
            sum+=i;
        }
        if(num==sum)
        System.out.println("It is a perfect number");
        else
        System.out.println("It is not a perfect number");
    }
}
