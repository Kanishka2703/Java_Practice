//accept a character, check the case otherwise, check whether it is a digit or special character
import java.util.*;
public class Q20
{
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        char ch;
        System.out.println("Enter the character");
        ch=in.next().charAt(0);
        if(Character.isLetter(ch)==true)
        {
            System.out.println(ch+ " is a letter");
            if(Character.isUpperCase(ch)==true)
            System.out.println(ch+ " is an upper case character");
            if(Character.isLowerCase(ch)==true)
            System.out.println(ch+ " is a lower case character");
        }
        else 
        {
            if(Character.isDigit(ch)==true)
            System.out.println(ch+ " is a Digit");
            else
            System.out.println(ch+ " is a Special character");
        }
    }
}