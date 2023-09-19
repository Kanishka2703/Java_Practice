//Write a Java program that takes a number from the user and generates an integer between 1 and 7. It displays the weekday name.
import java.util.*;
public class Q10
{
    public static void main(String[] args) 
    {
        Scanner in= new Scanner(System.in);
        int day;
        String dayname=" ";
        System.out.println("Enter the number between 1 and 7");
        day=in.nextInt();
        switch(day)
        {
            case 1:
            dayname="Monday";
            break;
            case 2:
            dayname="Tuesday";
            break;
            case 3:
            dayname="Wednesday";
            break;
            case 4:
            dayname="Thursday";
            break;
            case 5:
            dayname="Friday";
            break;
            case 6:
            dayname="Saturday";
            break;
            case 7:
            dayname="Sunday";
            break;
            default:
            System.out.println("Day range is provided invalid.");
        }
        System.out.println(dayname);
    }
}