//to check for a valid anagram
import java.util.*;
public class Q3{
    public static String sortString(String str){
        char[] ch=str.toCharArray();
        java.util.Arrays.sort(ch);
        return new String(ch);
    }
    public static boolean validAnagram(String str1, String str2){
        int len1=str1.length();
        int len2=str2.length();
        if(len1!=len2)
        return false;
        str1=sortString(str1);
        str2=sortString(str2);
        for(int i=0;i<len1;i++){
            if(str1.charAt(i)!=str2.charAt(i))
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str1="ABC";
        String str2="Hello";
        System.out.println(validAnagram(str1,str2));
    }
}