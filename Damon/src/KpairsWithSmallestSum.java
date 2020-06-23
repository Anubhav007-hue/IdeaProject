import java.util.*;
import java.util.HashMap;

public class KpairsWithSmallestSum {

    public class pair
    {
        int first;
        int second;

        public  pair(int first,int second)
        {
            this.first=first;
            this.second=second;
        }
    }

    public static void main(String[] args)
    {
        int [] nums1={1,2};
        int [] nums2={3};

        KpairsWithSmallestSum k=new KpairsWithSmallestSum();
        System.out.println(k.kSmallestPairs(nums1,nums2,3));
    }

    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {

        HashMap<pair,Integer> map=new HashMap<>();

        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                int sum=0;
                sum=nums1[i]+nums2[j];
                map.put(new pair(nums1[i],nums2[j]),sum);
            }
        }
        List<List<Integer>> res=new ArrayList<>();
        PriorityQueue<pair> queue=new PriorityQueue<>((a,b)-> map.get(a)-map.get(b));
        queue.addAll(map.keySet());

        if(nums1.length * nums2.length <=k)
        {
            while(!queue.isEmpty())
            {
                List<Integer> list=new ArrayList<>();
                pair arr;
                arr=queue.remove();
                list.add(arr.first);
                list.add(arr.second);
                res.add(list);
            }
        }
       else
        {
            while(k>0)
            {
                List<Integer> list=new ArrayList<>();
                pair arr;
                arr=queue.remove();
                list.add(arr.first);
                list.add(arr.second);
                res.add(list);
                k--;

            }
        }
        return res;
    }
}
