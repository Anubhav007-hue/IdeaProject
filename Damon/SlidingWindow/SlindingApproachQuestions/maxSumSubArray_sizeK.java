public class maxSumSubArray_sizeK {

    public static void main(String[] args)
    {
        maxSumSubArray_sizeK mss=new maxSumSubArray_sizeK();
        int [] nums={4,2,1,7,8,1,2,8,1,0};
        System.out.print(mss.getMaxSum(nums,0,0,3));
    }

    public int getMaxSum(int [] nums,int left,int right,int k)
    {
        int max=Integer.MIN_VALUE;
        int currentRunning=0;
        while(right<nums.length)
        {
            currentRunning+=nums[right];
            if(right-left>=k-1)
            {
                max=Math.max(max,currentRunning);
                currentRunning-=nums[left];
                left++;
            }
            right++;
        }

        return max;
    }
}
