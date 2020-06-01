import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletSum {
    static List<List<Integer>> final_list=new ArrayList<>();

    public static void main(String[] args)
{
    int [] nums={0,0,0,0};

    TripletSum ts=new TripletSum();
    ts.threeSum(nums);
    for(int i=0;i<final_list.size();i++)

    {
        System.out.println(final_list.get(i));
    }
}
    public  void  threeSum(int[] nums)
    {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++)
        {
            if(i>0 && nums[i]!=nums[i-1])
            twoSum(nums,i+1,-nums[i]);
        }

    }
    public void twoSum(int nums[] ,int low, int val)
    {
        int high=nums.length-1;
        while (low<high)
        {
            if(nums[low]+nums[high]>val)
            {
                high--;
            }

            else if (nums[low]+nums[high]<val)
            {
                low++;
            }

            else
            {
                List<Integer> list=new ArrayList<>();
                int temp=-val;
                list.add(temp);
                list.add(nums[low]);
                list.add(nums[high]);
                final_list.add(list);
                low++;
                high--;

            }
        }
    }
}
