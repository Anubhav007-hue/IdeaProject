public class SubarryProduct {
    public static void main(String[] args )
    {
        int nums[]={10,9,10,4,3,8,3,3,6,2,10,10,9,3};
        int k=19;
        System.out.print(numSubarrayProductLessThanK(nums,k));

    }
    public static  int numSubarrayProductLessThanK(int[] nums, int k) {
        if(nums.length==0 || nums==null || k==0)
        {
            return 0;
        }


        int count =0;
        for(int i:nums)
        {
            if(i<k)
            {
                count++;
            }
        }
        for(int i=0;i<nums.length-1;i++)
        {
            int temp=nums[i];
            for(int j=i+1;j<nums.length;j++)
            {
                temp=temp*nums[j];
                if(temp<k)
                {
                    count ++;
                }
                else
                {
                    break;
                }
            }
        }

        return count;
    }
}
