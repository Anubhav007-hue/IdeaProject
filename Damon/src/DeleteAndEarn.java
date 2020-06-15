import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

public class DeleteAndEarn {
    public static void main(String[] args)
    {
        int[] nums={8,3,4,7,6,6,9,2,5,8,2,4,9,5,9,1,5,7,1,4};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }

int n=10000;
        int [] dp=new int[10000+1];
        for( int key:map.keySet())
        {
            dp[key]=map.get(key)*key;
        }
        for(int i=2;i<dp.length;i++)
        {
            dp[i]=Math.max(dp[i]+dp[i-2],dp[i-1]);
        }
System.out.print(dp[n]);
    }
}
