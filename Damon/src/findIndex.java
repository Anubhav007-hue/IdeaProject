public class findIndex {
    public static void main(String[] args )
    {
        int[] nums={1,2,3};
        System.out.print(pivotIndex(nums));
    }
    public  static int pivotIndex(int[] nums) {
        if(nums.length<=2)
        {
            return -1;
        }

        for(int i=0;i<nums.length;i++)
        {
            if(i==0 )
            {
                if (checkSum(i+1,nums.length-1,nums)==0)
                {
                    return i;
                }
                else {
                    continue;
                }
            }
            if(i==nums.length-1)
            {
                if (checkSum(0,i-1,nums)==0)
                {
                    return i;
                }
            }
            if(checkSum(0,i-1,nums)==checkSum(i+1,nums.length-1,nums))
            {
                return i;
            }
        }

        return -1;

    }
    public  static int checkSum(int low,int high,int[] nums)
    {
        int sum=0;
        for(int i=low;i<=high;i++)
        {
            sum+=nums[i];
        }

        return sum;
    }
}
