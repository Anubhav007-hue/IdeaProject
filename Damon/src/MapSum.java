import java.util.HashMap;
import java.util.Map;

public class MapSum {
    Map<String,Integer> map;

    public MapSum() {
        map=new HashMap<>();
    }

    public void insert(String key, int val) {
        if(map.containsKey(key))
        {
            map.replace(key,val);
        }
        else
        {
            map.put(key,val);
        }

    }

    public int sum(String prefix) {
        int length=prefix.length();
        int sum=0;
        for(String key:map.keySet())
        {

            if(key.length()>=length)
            {
                String temp=key.substring(0,length);
                if(temp.equals(prefix)){
                    sum+=map.get(key);
                }
            }
        }


        return sum;
    }

    public static void main(String [] args )
    {
        MapSum ms=new MapSum();
        ms.insert("a",3);
        System.out.println("THe Sum is "+ms.sum("ap"));
        ms.insert("b",2);
        System.out.println("THe Sum is "+ms.sum("a"));

    }

}
