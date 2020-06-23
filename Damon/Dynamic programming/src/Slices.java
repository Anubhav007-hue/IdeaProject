public class Slices {
    public static void main(String [] args)
    {
        int [] nums={2,4,6,8,10};
        int [] dp=new int [nums.length];
        int sum=0;

        for(int i=2;i<nums.length;i++)
        {
            if(nums[i]-nums[i-1]==nums[i-1]-nums[i-2])
            {
                dp[i]=1+dp[i-1];
                sum+=dp[i];
            }
        }

        System.out.println(sum);

    }
}
