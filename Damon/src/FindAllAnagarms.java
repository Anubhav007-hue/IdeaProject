import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllAnagarms {
    public static void main(String[] args )
    {
        List<Integer> list=new ArrayList<>();
        String s="abab";
        String p="ab";

        Map<Character,Integer> map1=new HashMap<>();
        for(char current:p.toCharArray())
        {
            map1.put(current, map1.getOrDefault(current,1)+1);

        }
        int start=0;
        int end =p.length()-1;

        while (end<s.length())
        {
            boolean bool=anagram(map1,s.substring(start,end+1));
            if(bool==true)
            {
                list.add(start);
            }
            start++;
            end++;
        }
            System.out.print(list+" ");
    }
    private static boolean anagram(Map<Character, Integer> map1, String substring) {
        Map<Character,Integer> map2=new HashMap<>();
        for(char current:substring.toCharArray())
        {
            map2.put(current, map2.getOrDefault(current,1)+1);

        }
        if(map1.equals(map2))
        {
            return true ;
        }
        return false ;
    }
}
