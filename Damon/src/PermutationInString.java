import java.util.*;

public class PermutationInString {
    public static void main(String[] args )
    {
        String s1="ab";
        String s2="eidbaooo";
        int start=0;
        int end =s1.length()-1;

     Map<Character,Integer> map1=new HashMap<>();
     for(char current:s1.toCharArray())
     {
         map1.put(current, map1.getOrDefault(current,1)+1);

     }

        while (end<s2.length())
        {
            boolean bool=anagram(map1,s2.substring(start,end+1));
            if(bool==true)
            {
                System.out.print("true");
            }
            start++;
            end++;
        }
     System.out.print("false ");

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
