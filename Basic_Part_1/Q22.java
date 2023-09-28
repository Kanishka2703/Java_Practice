//To calculate the net amount after getting the discount
import java.util.*;
public class Q22
{
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        int amt;
        String nm;
        double net=0;
        double dis=0;
        System.out.println("Enter your good name");
        nm=in.nextLine();
        System.out.println("Enter the amount of purchase");
        amt=in.nextInt();
                if(amt<=25000)
                dis=0.0/100.0*amt;
                if(amt>=25001 && amt<=57000)
                dis=((5.0/100.0)*amt);
                if(amt>=57001 && amt<=100000)
                dis=((7.5/100.0)*amt);
                if(amt>=100000)
                dis=((10.0/100.0)*amt);
                net=amt-dis;
                System.out.println("Amount of purchase" +amt);
                System.out.println("Discount" +dis);
                System.out.println("Net amount" +net);
    }
}

