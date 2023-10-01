//Write a program to accept a name & display the initials along with the surname
import java.util.*;
public class Q27
{
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        int i,p;
        String str,sn=" ",str1=" ",str2=" ";
        char chr;
        System.out.println("Enter the full name");
        str=in.nextLine();
        str=' '+str;
        p=str.lastIndexOf(' ');
        sn=str.substring(p);   //stores surname
        for(i=0;i<p;i++)
        {
            chr=str.charAt(i);
            if(chr==' ')
                str1=str1+str.charAt(i+1)+'.';
        }
        str2=str1+sn;
        System.out.println("Name as initial with surname: ");
        System.out.println(str2);
    }
}