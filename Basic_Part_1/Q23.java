//Display new letter by changing its case and also print its ASCII value
import java.util.*;
public class Q23
{
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        char ch,ch1;
        System.out.println("Enter the character");
        ch=in.next().charAt(0);
        if(Character.isUpperCase(ch)==true)
        {
            ch1=Character.toLowerCase(ch);
            System.out.println("The ASCII value of " +ch1+ " is " +(int)ch1);
        }
        else
        {
            ch1=Character.toUpperCase(ch);
            System.out.println("The ASCII value of " +ch1+ " is " +(int)ch1);
        }
    }
}
