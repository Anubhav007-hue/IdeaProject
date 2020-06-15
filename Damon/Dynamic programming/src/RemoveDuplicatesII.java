import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesII {
    public static void main(String[] args )
    {
        int nums[]={-3,-1,0,0,0,3,3};
        int size=removeDuplicates(nums);
        for(int i=0;i<size;i++)
        {
            System.out.print(nums[i]+" ");
        }
    }

    public  static int removeDuplicates(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>();

        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }

        for(int key:map.keySet())
        {
            if(map.get(key)>2)
            {
                map.replace(key,2);
            }
        }

        for(int key:map.keySet())
        {
            list.add(key);
        }
        ArrayList<Integer> res=new ArrayList<>();

        for(int i=0;i<list.size();i++)
        {
            for(int j=0;j<map.get(list.get(i));j++)
            {
                res.add(list.get(i));
            }
        }
        Collections.sort(res);

        for(int i=0;i<res.size();i++)
        {
            nums[i]=res.get(i);
        }

        return res.size();

    }
}
