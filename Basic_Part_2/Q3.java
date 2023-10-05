//accept 5 states and 5 capitals of a country in two diff SDA.
//Now, enter a state of the country to display it's capital.
import java.util.*;
public class Q3
{
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        int i,flag=0,a=0;
        String search="";
        String st[]=new String[2];
        String cap[]=new String[2];
        for(i=0;i<2;i++)
        {
            System.out.println("Enter the state ");
            st[i]=in.nextLine();
            System.out.println("Enter the capital ");
            cap[i]=in.nextLine();
        }
        System.out.println("Enter the state whose capital is to be searched : ");
        search=in.nextLine();
        for(i=0;i<2;i++)
        {
            if(st[i].equals(search))
            {
            flag=1;
            a=i;
            }
        }
        if(flag==1)
        System.out.println("The capital of "+st[a]+" is : "+cap[a]);
        else
        System.out.println("State is not found");
    }
}
