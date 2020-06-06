import java.util.*;
import java.util.LinkedList;


public class trial {


    public static void main(String[] args)
    {
        HashMap<String,Integer> map=new HashMap<>();
        String [] str={"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
        int k=4;
        trial t=new trial();
        List<String > result=new ArrayList<>();
        List<String> final_list=new ArrayList<>();
        t.topKFrequent(str,k,result,final_list);
        System.out.print(final_list+"");

    }
    public List<String> topKFrequent(String[] words, int k, List<String> result, List<String> final_list) {
        HashMap<String,Integer> map=new HashMap<>();
        for(String s:words)
        {
            map.put(s,map.getOrDefault(s,0)+1);
        }



        for(int i=words.length-1;i>=0;i--)
        {
            ArrayList<String> temp=new ArrayList<>();
            for(String key:map.keySet())
            {
                if(map.get(key)==i)
                {

                    temp.add(key);
                }
            }

            Collections.sort(temp);
                result.addAll(temp);

        }

        for (int i=0;i<k;i++)
        {
            final_list.add(result.get(i));
        }

        return final_list;
    }
}
