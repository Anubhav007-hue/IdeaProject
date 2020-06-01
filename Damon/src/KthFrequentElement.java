import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.PriorityQueue;

public class KthFrequentElement {
    public static void main(String[] args )
    {
        int[] nums={1,1,1,2,2,3};
        int k=2;

        HashMap<Integer,Integer> map=new HashMap<>();
        int[] arr=new int[k];
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>();
        for(int i:nums)
        {
            if(map.containsKey(i))
            {
                map.replace(i,map.get(i)+1);
            }

            else
            {
                map.put(i,1);
            }
        }
        int l=0;
        int count=0;
        int val=nums.length;
        while(count!=k)
        {
            for (int keys : map.keySet()) {
                if(map.get(keys)==val)
                {
                    arr[l++]=keys;
                    count++;
                }
            }
            val--;
        }


//        for(int j=0;j<k;j++)
//        {
//            arr[j]=maxHeap.remove();
//        }



    }
}
