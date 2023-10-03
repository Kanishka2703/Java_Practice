//to reverse a string
import java.util.*;
public class Q31
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int i,len;
        String str,rev="";

        System.out.println("Enter the string ::");
        str=in.nextLine().trim();
        len=str.length();
        for(i=0;i<len;i++)
        {
            rev=str.charAt(i)+rev;
        }
        System.out.println(rev);
    }
}

