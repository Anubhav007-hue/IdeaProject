import java.util.HashSet;
import java.util.Set;

public class ShortestWayFormString {

    public static void main(String[] args )
    {
        String source="xyz";
        String target="xzyxt";
        System.out.print(minSteps(source,target));
    }

    public  static int minSteps(String source,String target)
    {
//        Checking if the source string contains all the varibles required to make target.
            Set<Character> count_source=new HashSet<>();

            for(char c:source.toCharArray())
            {
                count_source.add(c);
            }

        Set<Character> count_target=new HashSet<>();

            for(char c:target.toCharArray())
            {
                count_target.add(c);
            }

            if(!count_source.equals(count_target))
            {
                return -1;
            }


        int minStep=0;
        int i=0;


        while(i<target.length())
        {
            int j=0;

            while(j<source.length())
            {
                if(source.charAt(j)==target.charAt(i))
                {
                    i++;
                    j++;

                }
                else
                {
                    j++;
                }
            }
            minStep+=1;
        }

return minStep;
    }
}
