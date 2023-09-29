//Count and display the number of vowels present in the string
import java.util.*;
public class Q24
{
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        String str;
        int i,len,count=0;
        char chr;
        System.out.println("Enter the string");
        str=in.nextLine();
        len=str.length();
        for(i=0;i<len;i++)
        {
            chr=str.charAt(i);
            if(chr=='A'||chr=='E'||chr=='I'||chr=='O'||chr=='U'||chr=='a'||chr=='e'||chr=='i'||chr=='o'||chr=='u')
            count=count+1;
        }
        System.out.println("The number of vowels: " +count);
    }
}
