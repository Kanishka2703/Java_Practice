/*Write a java program to accept the no. of days and display the result
after converting it into no. of years, months and the remaining days*/
import java.util.*;
public class Q11
{
    public static void main(String[] args) 
    {
        Scanner in= new Scanner(System.in);
        int n,years,months,days,b;
        System.out.println("Enter the no. of days");
        n=in.nextInt();
        years=n/365;
        b=n%365;
        months=b/30;
        days=b%30;
        System.out.println("No. of years = " +years);
        System.out.println("No. of months = " +months);
        System.out.println("No. of days = " +days);
    }
}
