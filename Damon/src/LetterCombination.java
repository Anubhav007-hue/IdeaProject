import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombination {
    public static void main(String[] args )
    {
        List<String> result=new ArrayList<>();
        String s="23";
        result=letterCombinations(s);
    }
    public static List<String> letterCombinations(String digits) {

//        Building the hashMap for the various combinations.....

        Map<Integer,List<Character>> map=new HashMap<>();
        List<String> finalList=new ArrayList<>();
        String str="abcdefghijklmnopqrstuvwxyz";
        int k=0;
        for(int i=2;i<=9;i++)
        {
            List<Character> temp=new ArrayList<>();
            if(i!=7 || i!=9)
            {
                for(int j=0;j<3;j++)
                {
                    char current=str.charAt(k++);
                    temp.add(current);
                }
            }
            else
            {
                for(int j=0;j<4;j++)
                {
                    char current=str.charAt(k++);
                    temp.add(current);
                }
            }
            map.put(i,temp);
        }

//        Finished building the hashMap......
        
             return finalList;
    }
}
