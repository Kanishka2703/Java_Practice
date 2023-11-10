//to check whether the string is isomorphic or not

import java.util.*;
public class Q2{
    public static boolean isIsomorphic(String str1,String str2){
        int len1=str1.length();
        int len2=str2.length();
        if(len1!=len2)
        return false;
        HashMap<Character,Character> mp=new HashMap<Character,Character>();
        Set<Character> set = new HashSet<>();
        for(int i=0;i<len1;i++){
            char ch1=str1.charAt(i), ch2=str1.charAt(i);
            if(mp.containsKey(ch1)){
                if(mp.get(ch1)!=ch2)
                return false;
            }
            else{
                if(set.contains(ch2))
                return false;
                mp.put(ch1,ch2);
                set.add(ch2);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str1="abc",str2="xyz";
        if(isIsomorphic(str1,str2)==true)
            System.out.println("they are isomorphic");
        if(isIsomorphic(str1,str2)!=true)
            System.out.println("not isomorphic");
    }
}
