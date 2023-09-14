//Write a Java program and compute the sum of an integer's digits
import java.util.Scanner;
public class Q4 
{ 
 public static void main(String[] args) 
 {
        Scanner in = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int n = in.nextInt();
        System.out.println("The sum of the digits is: " + sumDigits(n));

 }

    public static int sumDigits(int n) 
    {
        int sum = 0;
        while (n != 0) 
        {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}