import java.util.HashMap;

public class RepeatedSunString {

    public static void main(String [] args )
    {
        String s="abab";
        System.out.println(repeatedSubstringPattern(s));

    }

    public static  boolean repeatedSubstringPattern(String s) {

        HashMap<Character,Integer> map=new HashMap<>();
        for(char current:s.toCharArray())
        {
            map.put(current,map.getOrDefault(current,0)+1);
        }

        int co=map.get(s.charAt(0));

        for(char key:map.keySet())
            if (map.get(key).equals(co)) {
                return false;
            }

        return true ;
    }
}
