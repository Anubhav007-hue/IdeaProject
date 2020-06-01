public class MinimumMoves {
    public static void main(String[] args)
    {
        int[] nums={1,2,3};
        int count=minMoves(nums);
        System.out.print(count);

    }

    public static int minMoves(int[] nums) {
        boolean bool=false ;
        int count=0;
        int n=nums.length;
        while(bool!=true)
        {
            for(int i=0;i<n-1;i++)
            {
                if(nums[i]==nums[i+1])
                {
                    continue;
                }
                nums[i]=Math.max(nums[i],nums[i+1]);
                count++;
            }
            bool=check(nums);
        }
        return count;
    }

    public static boolean check(int[] nums)
    {
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]!=nums[i+1])
            {
                return false;
            }
        }

        return true;
    }
}
