//Write a Java program to swap two variables
import java.util.*;
public class Q3
{
    public static void main(String[] args) 
    {
        Scanner in= new Scanner(System.in);
        int a=10,b=20,swap;
        swap=a;
        a=b;
        b=swap;
        System.out.println("Swapped values of a=" +a);
        System.out.println("Swapped values of b=" +b);
    }
}
