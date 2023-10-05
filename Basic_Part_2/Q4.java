//accept 10 names and display all those names whose first  letter matches with the letter entered by user.
import java.util.*;
public class Q4
{
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        int i,flag=0;
        String b="";
        char letter;
        String name[]= new String[10];
        for(i=0;i<10;i++)
        {
            System.out.println("Enter the names ");
            name[i]=in.nextLine();
        }
        System.out.println("Enter the letter : ");
        letter=in.next().charAt(0);
        for(i=0;i<10;i++)
        {
            b=name[i];
            if(b.charAt(0)==(letter))
            {
                System.out.println(name[i]);
                flag+=1;
            }
        }
        if(flag==0)
        System.out.println("No name is found ");
    }
}