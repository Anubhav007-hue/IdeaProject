import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class LongestK_Repeating {
    public static void main(String[] args)
    {
        String x="112233";
        int k=3;
        LongestK_Repeating l=new LongestK_Repeating();
        int temp=l.find(x,k);
        System.out.println(temp);
    }

    private int find(String x,int k) {
        int n=x.length();
        HashMap<Character,Integer> map=new HashMap<>();
        HashSet<Character> set=new HashSet<>();
        int start=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<x.length();i++)
        {
            char current=x.charAt(i);
            if(set.contains(current)) {
                continue;
            }
            map.put(current, map.getOrDefault(current, 1) + 1);
            set.add(current);


            if(map.size()<=k)
            {
               max=Math.max(max,i-start+1);
            }

            else {
                while (map.size()>k)
                {
                    char temp=x.charAt(start);
                    map.replace(temp,map.get(temp)-1);
                    if(map.get(temp)==1)
                    {
                        map.remove(temp);
                    }
                    start++;
                }
            }
        }
        return max;
    }
}

