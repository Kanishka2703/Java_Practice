//accept a string in lowercase and replace 'e' with '*'
import java.util.*;
public class Q25
{
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        String str;
        int i,len;
        char chr;
        System.out.println("Enter the string");
        str=in.nextLine();
        len=str.length();
        for(i=0;i<len;i++)
        {
            chr=str.charAt(i);
            if(chr=='e')
            chr='*';
            System.out.print(chr);
        }
        System.out.println();
    }
}
