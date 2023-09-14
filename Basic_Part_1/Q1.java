//Write a Java program to print 'Hello' on screen and your name by taking it from user on a separate line
import java.io.*;
public class Q1
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read= new InputStreamReader(System.in);
        BufferedReader in= new BufferedReader(read);
        String str;
        System.out.println("Enter Your Name");
        str=in.readLine();
        System.out.println("Hello");
        System.out.println(str);

    }
}
