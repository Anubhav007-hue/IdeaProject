public class ReversePairs {

    public static void main(String[] args )
    {
        int nums[]={Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MIN_VALUE,Integer.MIN_VALUE,Integer.MIN_VALUE,Integer.MAX_VALUE};

        int count=reversePairs(nums);
        System.out.print(count);

    }

    public  static int reversePairs(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]<0 && nums[j]<0){
                    long temp=nums[j];
                    long temp1=temp*2;
                    if(nums[i]>temp1)
                    {
                        count++;
                    }


                }
                else
                {
                    if(nums[i]<=nums[j])
                    {
                        continue;
                    }
                    if(nums[i]>0 && nums[j]<0)
                    {
                        count++;
                    }
                    else
                    {
                        long temp=nums[j];
                        long temp1=temp*2;
                        if(nums[i]>temp1)
                        {
                            count++;
                        }
                    }
                }
            }
        }
        return count;

    }
}
