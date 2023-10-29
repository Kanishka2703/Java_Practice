//to find the majority element using better approach(Hashing)
import java.util.*;
class Q33 {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int nums[]={2,2,3,3,1,2,2};
        HashMap<Integer,Integer> mp=new HashMap<Integer,Integer>();
        int var=0;
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(nums[i])){
                mp.put(nums[i],mp.get(nums[i])+1);
            }
            else{
                mp.put(nums[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> en:mp.entrySet()){
            if(en.getValue()>(nums.length/2)){
                var=en.getKey();
            }
        }
        System.out.println(var);
    }
    }
        
