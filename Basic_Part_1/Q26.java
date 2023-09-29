//change the case of each letter of the string.
import java.util.*;
public class Q26
{
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        int i,len;
        String str,str1=" ";
        char chr,chr1;
        System.out.println("Enter the String");
        str=in.nextLine();
        len=str.length();
        for(i=0;i<len;i++)
        {
            chr=str.charAt(i);
            if(Character.isUpperCase(chr)==true)
            {
                chr1=Character.toLowerCase(chr);
                str1=str1+chr1;
            }
            else if(Character.isLowerCase(chr)==true)
            {
                chr1=Character.toUpperCase(chr);
                str1=str1+chr1;
            }
            else
                str1=str1+chr;
        }
        System.out.println("String after converting the case:");
        System.out.println(str1);
    }
}
