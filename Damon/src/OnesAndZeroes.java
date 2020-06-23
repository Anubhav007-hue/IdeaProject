import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class OnesAndZeroes {



    public static void main(String[] args)
    {
        String [] strs={"10","0","1"};

        System.out.println(findMaxForm(strs,1,1));
    }

    public static int findMaxForm(String[] strs, int m, int n) {
        int count=0;

        Arrays.sort(strs, (a,b)-> a.length()-b.length());


        for(String current:strs)
        {
            Map<Character,Integer> map=new HashMap<>();
            for(char c :current.toCharArray())
            {
                map.put(c,map.getOrDefault(c,0)+1);
            }
            if(map.containsKey('1') && !map.containsKey('0') )
            {
                if(map.get('1')<=n)
                {
                    count++;
                }
                n=n-map.get('1');
            }

           else  if(map.containsKey('0') && !map.containsKey('1'))
            {
                if(map.get('0')<=m)
                {
                    count++;
                }
                m=m-map.get('0');
            }

           else
            {
                if(map.get('1')<=n && map.get('0')<=m)
                {
                    count++;
                }
                m-=map.get('0');
                n-=map.get('1');
            }
        }
            return count;
    }
}
