// Write a Java program to display the pattern like a right angle triangle with a number.
import java.util.*;
public class Q12
{
    public static void main(String[] args) 
    {
        Scanner in= new Scanner(System.in);
        int n,i,j;
        System.out.println("Enter the number");
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            System.out.print(j);
            System.out.println();
        }
    }
}