public class WiggleSequence {

    public static void main(String[] args)
    {
        int[] nums={1,2,3,4,5};
        System.out.println(wiggleMaxLength(nums));
    }
    public  static int wiggleMaxLength(int[] nums) {
        int n=nums.length;
        int [] dp=new int[n];
        dp[0]=0;
        dp[1]=1;

        int sign=nums[0]-nums[1] >0 ? 1 : -1;

        for(int i=2;i<n;i++)
        {
            int tempSign=nums[i-1]-nums[i] >0 ?1 : -1;

            if(tempSign==1 && sign==-1 || tempSign==-1 && sign==1)
            {
                dp[i]=dp[i-1]+1;
                sign=tempSign;
            }
            else
            {
                dp[i]=Math.max(dp[i],dp[i-1]);
                sign=tempSign;
            }
        }


        return dp[n-1] +1;
    }


}
