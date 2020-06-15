public class SubArraySum_K {
    public static void main(String[] args )
    {
        int[] nums={1,2,3};
        int k=3;

        System.out.print(countSubArray(nums,k));
    }

    private static int countSubArray(int[] nums, int k) {
        int right=0;

        int count=0;
        int res=0;
        while(right<nums.length) {

            int sum=0;
            for(int i=0;i<=right;i++)
            {
                sum=sum+nums[i];
            }

            if(sum==k)
            {
                count++;
            }
            right++;
        }

        return count;


    }
}
