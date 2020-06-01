public class ContiguosSubarraySum {
    public static void main(String[] args )
    {
        int[] nums={23,2,4,6,7};
        boolean bool=checkSubarraySum(nums,6);
        System.out.print(bool);
    }
    public  static boolean checkSubarraySum(int[] nums, int k) {
        int n=nums.length;
        if(n<2)
        {
            return false ;
        }

        for(int i=0;i<n-1;i++)
        {
            int sum=nums[i];
            for(int j=i+1;j<n;j++)
            {
                sum=sum+nums[j];
                if(k==0 && sum==0)
                {
                    if(nums[j-1] == 0 && nums[j]==0)
                    {
                        return true;
                    }
                    else continue;
                }
                else if( k==0 && sum!=0)
                {
                    continue;
                }
                else
                {
                    if(sum%k ==0)
                    {
                        return true;
                    }
                }
            }
        }
        return false ;
    }
}
