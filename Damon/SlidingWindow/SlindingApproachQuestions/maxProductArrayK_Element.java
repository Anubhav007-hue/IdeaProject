public class maxProductArrayK_Element {
    public static void main(String[] args)
    {
        int nums[]={-4,-3,-2,0,60};
        int k=3;
        System.out.print(maximumProduct(nums));
    }
    public static int maximumProduct(int[] nums) {

        int n=nums.length;
        if(n==0 || nums==null)
        {
            return 0;
        }
        int k=3;
        int windowStart=0;
        int windowEnd=0;
        int max=Integer.MIN_VALUE;
        int currentProduct=1;

        while(windowEnd<n)
        {
            if(nums[windowEnd]==0)
            {
                while(windowEnd<n && nums[windowEnd]==0)
                {
                    currentProduct=0;
                    windowEnd++;

                }
                max=Math.max(max,currentProduct);
                currentProduct=1;
                windowStart=windowEnd;
                if(windowEnd==n)
                {
                    return max;
                }
            }
            currentProduct*=nums[windowEnd];
            if(windowEnd-windowStart>=k-1)
            {
                max=Math.max(currentProduct,max);
                currentProduct/=nums[windowStart];
                windowStart++;
            }

            windowEnd++;
        }

        return max;
    }
}
