//A program to display frequency of word in a string
import java.util.*;
public class Q28
{
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        int i,len,count=0;
        String str,word=" ",str1=" ";
        char chr;
        System.out.println("Enter the string: ");
        str=in.nextLine();
        len=str.length();
        System.out.println("Enter the word that need to be searched: ");
        word=in.nextLine();
        str=str+' ';
        for(i=0;i<len;i++)
        {
            chr=str.charAt(i);
            if(chr==' ')
            {
                if((str1).compareTo(word)==0)
                {
                    count+=1;
                    str1=" ";
                }
            }
        else
        str1+=chr;
        }
        System.out.println("Frequency of the searched word is :" +count);
    }
}