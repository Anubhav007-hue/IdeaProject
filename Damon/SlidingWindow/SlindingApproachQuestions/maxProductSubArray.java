public class maxProductSubArray {
    public static void main(String[] args )
    {
        int[] nums={0,2};
        System.out.print(maxProduct(nums));
    }

    public static int maxProduct(int[] nums) {

        if(nums.length==0)
        {
            return 0;
        }

        if(nums.length==1)
        {
            return nums[0];
        }
        int max=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++)
        {
            int p=1;
            int tempMax=Integer.MIN_VALUE;
            for(int j=i;j<nums.length;j++)
            {
                p=p*nums[j];
                tempMax=Math.max(p,tempMax);
            }
            max=Math.max(max,tempMax);
        }

        return max;
    }
}
