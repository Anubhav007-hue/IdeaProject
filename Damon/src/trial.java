import java.util.*;


public class trial {

    public static void main(String[] args)
    {
        HashMap<String,Integer> map=new HashMap<>();
        String[] str={"ab","ab","ab","ab"};
        for(String current:str)
        {
            map.put(current,map.getOrDefault(current,0)+1);
        }

        System.out.println(map.get("ab"));

    }
}
