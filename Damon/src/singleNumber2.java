import java.util.Arrays;

public class singleNumber2 {

    public static void main(String[] args)
    {
        int [] nums={0,1,0,1,0,1,99};

        Arrays.sort(nums);
        int length =nums.length;

        for(int i=0;i<length-2;i++)
        {
            if(nums[i]==nums[i+1] && nums[i+1]==nums[i+2])
            {
                i=i+3;
            }

            else
            {
                if(nums[i+1]==nums[i])
                {
                    System.out.println(nums[i+2]);
                }

                else
                {
                    System.out.println(nums[i+1]);
                }
            }
        }
        System.out.println(nums[length-1]);
    }
}
