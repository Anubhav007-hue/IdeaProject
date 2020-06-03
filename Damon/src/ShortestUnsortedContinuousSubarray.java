import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ShortestUnsortedContinuousSubarray {
    public static void main(String[] args )
    {
        int [] nums={2,6,4,8,10,9,15};

        System.out.println(findUnsortedSubarray(nums));
    }
    public  static int findUnsortedSubarray(int[] nums) {
        int start=0;
        int end =nums.length-1;

        int[] clone=nums.clone();
        Arrays.sort(clone);

        for(int i=0;i<clone.length;i++)
        {
            if(nums[i]!=clone[i])
            {
                start=i;
                break;
            }
        }

        for(int i=nums.length-1;i>=0;i--)
        {
            if(nums[i]!=clone[i])
            {
                end=i;
                break;
            }
        }

        if(end-start==nums.length-1)
        {
            return 0;
        }

        return end-start+1;
    }
}
