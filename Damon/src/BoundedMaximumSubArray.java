public class BoundedMaximumSubArray {
    public static void main(String[] args)
    {
        int nums[]={2,9,2,5,6};
        int l=2;
        int r=8;
        System.out.print(numSubarrayBoundedMax(nums,l,r));
    }

    public static int numSubarrayBoundedMax(int[] nums, int L, int R) {

        int index=-1;
        int max=Integer.MIN_VALUE;
        int res=0;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>=L && nums[i]<=R)
            {
                max=nums[i];
                index=i;
                break;
            }
        }

        if(index!=-1)
        {
            int left=index;
            int right=index;

            while(left>=0 && nums[left]<=max)
            {

                res=res+(right-left+1);
                left--;
            }

            left++;
            right++;



            while(right<nums.length)
            {
                if(nums[right]<max)
                {

                    res=res+(right-left);
                    right++;
                }
                else if(nums[right]>R)
                {
                    while(nums[right]>R)
                    {
                        right++;
                    }
                    left=right;
                    right++;
                    res=res+(right-left);

                }
                else if(nums[right]>=L && nums[right]<=R)
                {
                    if(nums[right]>max)
                    {
                        max=nums[right];
                    }
                    res=res+(right-left+1);
                    right++;
                }
            }
        }



        return res;
    }
}
