import java.util.Arrays;

public class LongestIncreasingSequence {
    public static void main(String[] args )
    {
        int [] nums={10,9,2,5,3,7,101,18};
        int result=0;
        int count=1;

        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>nums[i-1])
            {
                count++;
            }
            else if(nums[i]<nums[i-1])
            {
                result=Math.max(result,count);
                count=1;
            }
        }
    }
}
