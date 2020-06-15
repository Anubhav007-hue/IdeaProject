import java.util.*;

public class RepeatedDNA {
    public static void main(String [] args )
    {
        String s="AAAAAAAAAAA";
//        System.out.print(findRepeatedDnaSequences(s));
        String str="Anubhav";

        str="Ranjan";

        System.out.print(str);
    }

    public static  List<String> findRepeatedDnaSequences(String s) {
        Map<String,Integer> map=new HashMap<>();
        List<String> result=new ArrayList<>();
        HashSet<String> set=new HashSet<>();
        int i=0;
        int j=10;

        while(j<=s.length())
        {

            String temp=s.substring(i,j);
            map.put(temp,map.getOrDefault(temp,0)+1);
            if(map.containsKey(temp) && map.get(temp)>1)
            {
                if(map.get(temp)<3) result.add(temp);
            }



            i++;
            j++;
        }

        return result;

    }
}
