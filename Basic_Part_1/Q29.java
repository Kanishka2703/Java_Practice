//Pig Lation form
import java.util.*;
public class Q29
{
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        int i,len;
        String word,str1=" ",str2=" ";
        char chr;
        System.out.println("Enter the word:");
        word=in.nextLine();
        len=word.length();
        for(i=0;i<len;i++)
        {
            chr=word.charAt(i);
            if(chr=='A'||chr=='E'||chr=='I'||chr=='O'||chr=='U'||chr=='a'||chr=='e'||chr=='i'||chr=='o'||chr=='u')
            break;
        }
        str1=word.substring(i,len);
        str2=word.substring(0,i);
        System.out.println("The Pig latin form of : "+word);
        System.out.println(str1+str2+"ay");
    }
}

