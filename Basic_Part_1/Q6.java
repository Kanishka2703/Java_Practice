//Write a Java program to get a number from the user and print whether it is positive or negative.
import java.util.*;
public class Q6
{
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        int num;
        System.out.println("Enter the number to be checked");
        num=in.nextInt();
        if(num<0)
        System.out.println("Number is negative");
        else if(num>0)
        System.out.println("Number is positive");
        else
        System.out.println("Number is 0");
    }
}