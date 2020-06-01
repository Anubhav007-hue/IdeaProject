public class JumpGame {

    public static void main(String[] args )
    {
        int [] nums={2,3,1,1,4};
        JumpGame jm=new JumpGame();
        boolean bool=jm.check(nums);
        System.out.println(bool);
    }

    private boolean check(int[] nums)
        {
            int lastIndex=nums.length-1;
            for(int i=nums.length-1;i>=0;i--)
            {
                if(i+nums[i]>=lastIndex)
                {
                    lastIndex=i;
                }
            }

        return lastIndex==0;
    }
}
