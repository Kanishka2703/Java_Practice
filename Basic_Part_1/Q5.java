//Write a Java program to compute hexagon area
import java.util.Scanner;
public class Q5
 {
      public static void main(String[] args)
       {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the length of a side of the hexagon: ");
        double s = input.nextDouble();
        System.out.print("The area of the hexagon is: " + hexagonArea(s)+"\n");
       }
    public static double hexagonArea(double s) 
    {
        return (6*(s*s))/(4*Math.tan(3.14/6));
    }
}