//Write a Java program to print the area and perimeter of a circle.
import java.util.*;
public class Q2
{
    public static void main(String[] args) 
    {
        Scanner in= new Scanner(System.in);
        double r;
        double area,peri;
        System.out.println("Enter the radius of the circle");
        r=in.nextDouble();
        area=(22.0/7.0)*r*r;
        peri=2*(22.0/7.0)*r;
        System.out.println("Area of circle is" +area);
        System.out.println("Perimeter of circle is" +peri);
    }
}