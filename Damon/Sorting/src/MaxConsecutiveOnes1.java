public class MaxConsecutiveOnes1 {

    public static void main(String[] args )
    {
        int [] nums={1,1,1,1,1,1,0,0,1,1,1,1,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    public  static int findMaxConsecutiveOnes(int[] nums) {
        int max=Integer.MIN_VALUE;
        int i=0;
        int j=0;
        while(j<nums.length)
        {
            if(nums[j]==0)
            {
                j++;
                i=j;
            }
            else
            {
                while(j<nums.length && nums[j]==1)
                {
                    j++;
                }
                max=Math.max(max,j-i);
                i=j;
            }
        }
            return max;
    }
}
