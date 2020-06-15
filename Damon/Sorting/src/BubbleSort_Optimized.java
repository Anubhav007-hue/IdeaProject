public class BubbleSort_Optimized {
    public static void main(String [] args )
    {
        int [] nums={6,5,4,3,2,1};
        int i=nums.length-1;
        int j=0;
        int lastSwap=j;


        while(i>0)
        {
            for(j=0;j<i;j++ )
            {
                if(nums[j]>nums[j+1])
                {
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    lastSwap=j;
                }
            }

            i=lastSwap;
        }

        for(i=0;i<nums.length;i++)
        {
            System.out.print(nums[i]+" ");
        }
    }
}
