import java.util.Arrays;
import java.util.HashMap;

public class FIrstUnique {
    public static void main(String[] args )
    {
        String s="loveleetcode";
        char[] character=s.toCharArray();

        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<character.length;i++)
        {
            if(map.containsKey(character[i]))
            {
                map.replace(character[i],map.get(character[i])+1);

            }

            else
            {
                map.put(character[i],1);
            }
        }
        int i=0;

        for(char keys:character)
        {
                if(map.get(keys)==1)
                System.out.print(keys + " ");



        }
    }
}
