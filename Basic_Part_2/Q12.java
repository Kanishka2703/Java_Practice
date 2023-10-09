//Write a Java program to find common elements between two arrays (string values)
import java.util.*;
public class Q12
{
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        int i,j,flag=0;
        String b="";
        String arr1[]=new String[10];
        String arr2[]=new String[10];
        for(i=0;i<5;i++)
        {
            System.out.println("Enter the number for 1st array :");
            arr1[i]=in.nextLine();
        }
        for(i=0;i<5;i++)
        {
            System.out.println("Enter the number for 2nd array :");
            arr2[i]=in.nextLine();
        }
        for(i=0;i<5;i++)
        {
            for(j=0;j<5;j++)
            {
                if(arr1[i].equals(arr2[j])==true)
                {
                flag=1;
                b+=arr2[j]+ ' '+ ',';
                }
            }  
        }
        System.out.println("Common element between both arrays are :");
        System.out.println(" [ "+b+ " ] ");
        if(flag==0)
        System.out.println("No Common element between both arrays");
    }
}
