import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LongestSubstringWith_k {
    public static void main(String[] args )
    {
        String s="33312112334" ;
        int k=2;

        int result=maxSubstring(s,k);
        System.out.println(result);
    }

    public static int maxSubstring(String s, int k )
    {
        Map<Character,Integer> map=new HashMap<>();
        int max=0;
        int j=0;

        for(int i=0;i<s.length();i++) {
            char current = s.charAt(i);
            if (map.containsKey(current)) {
                map.replace(current, map.get(current) + 1);
            } else {
                map.put(current, 1);
            }


            if (map.size() <= k) {

                max = Math.max(max, i-j+1);

            } else {
                while (map.size() > k) {
                    char temp = s.charAt(j);
                    map.replace(temp, map.get(temp) - 1);
                    if (map.get(temp) == 0) {
                        map.remove(temp);
                    }
                    j++;
                }

            }
        }
        return max;
    }
}
