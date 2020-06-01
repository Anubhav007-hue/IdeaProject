import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SlidingWindow {
    public static void main(String[] args ) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k=3;
        int final_max=Integer.MIN_VALUE;

        int temp=k;
        List<Integer> list=new ArrayList<>();

        for(int i=0;i<=nums.length-k;i++)
        {
            int tempMax=Integer.MIN_VALUE;
            tempMax=calculateMax(i,temp,nums);

            list.add(tempMax);
            temp++;

        }


        int[] result=new int[list.size()];
        for(int i=0;i<result.length;i++)
        {
            result[i]=list.get(i);
        }

    }


    public static int calculateMax(int i, int temp,int[] nums)
    {int max=Integer.MIN_VALUE;
        for(int k=i;k<temp;k++)
        {
            max= Math.max(max,nums[k]);
        }

        return max;
    }
}
