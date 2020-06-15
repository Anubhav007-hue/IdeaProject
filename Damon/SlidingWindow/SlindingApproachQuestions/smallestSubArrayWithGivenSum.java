public class smallestSubArrayWithGivenSum {
    public static void main(String[] args )

    {
        smallestSubArrayWithGivenSum ssw=new smallestSubArrayWithGivenSum();
        int [] nums={2,3,1,2,4,3};
        int s=7;
        System.out.print(ssw.minSubArrayLen(s,nums));
    }
    public int minSubArrayLen(int s, int[] nums)
    {
//        For storing the length of the subArray.

        int min=Integer.MIN_VALUE;

//        For getting the current running sum..

        int currentRunning=0;
        int left=0;
        int right=0;

        while(right<nums.length)
        {
            currentRunning+=nums[right];

            while(currentRunning>=s)
            {
                min=Math.min(min,right-left+1);
                currentRunning-=currentRunning;
                left++;
            }

            right++;
        }


        return (min != Integer.MAX_VALUE) ? min : 0;
    }
}
