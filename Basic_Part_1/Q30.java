//to check whether it is a palindrome word or not
import java.util.*;
public class Q30
{
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        int i,len;
        String word,rev="";
        char chr;
        System.out.println("Enter the word : ");
        word=in.nextLine();
        len=word.length();
        for(i=len-1;i>=0;i--)
        {
            chr=word.charAt(i);
            rev+=chr;
        }
        if(word.equals(rev))
        System.out.println("It is a Palindrome word");
        else
        System.out.println("It is not a Palindrome word");
    }
}
