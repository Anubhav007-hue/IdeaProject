import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumIndexSumofTwoLists {
    public static void main(String[] args )
    {
        String[] list1={"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2={"KFC", "Shogun", "Burger King"};

         findRestaurant(list1,list2);

    }
    public  static void  findRestaurant(String[] list1, String[] list2) {
        Map<String,Integer> map=new HashMap<>();

        for(int i=0;i<list1.length;i++)
        {
            map.put(list1[i],i);
        }
        List<Integer> result=new ArrayList<>();

        int max=Integer.MAX_VALUE;
        for(int i=0;i<list2.length;i++)
        {
            if(map.containsKey(list2[i]))
            {
                int temp=map.get(list2[i]);
                int tempSum=temp+i;
                if(tempSum<=max)
                {
                    result.add(temp);
                    max=tempSum;
                }
            }
        }
//        Finding the min index value;
        int min=Integer.MAX_VALUE;
        for(int i:result)
        {
            min=Math.min(i,min);
        }
        System.out.print("The min index is:"+min);
//        Adding the result of the min index;

        String [] res=new String[result.size()];
        for(int i=0;i<res.length;i++)
        {
            if(result.get(i)==min)
            {
                res[i]=list1[min];
            }
        }
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }

    }
}
