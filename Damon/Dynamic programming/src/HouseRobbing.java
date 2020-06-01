public class HouseRobbing {

    public static void main(String[] args)
    {
        int[] nums={1,1,1,2};
        int n=nums.length;
        if(nums.length==0 || nums==null)
        {
//            return 0;

        }
        if(nums.length==1)
        {
//            return nums[0];
        }

        if(nums.length==2)
        {
//            return Math.max(nums[0],nums[1]);
        }

        int[] dp=new int[n];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);

        for(int i=2;i<n;i++)
        {
            dp[i]=Math.max((nums[i]+nums[i-2]),nums[i-1]);
        }
//        return dp[n-1];
    }
}
