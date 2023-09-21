//Check whether the no. is prime or not by taking the number from the user
import java.util.*;
public class Q14
{
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        int n,flag=0,i;
        System.out.println("Enter the number ");
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            flag+=1;
        }
        if(flag==2)
        System.out.println(+n+ " is the number.");
        else
        System.out.println(+n+ " is not the number.");
    }
}