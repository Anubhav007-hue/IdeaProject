public class FirstAndLastOccurance {
    public static void main(String[] args)
    {
        int[] nums={5,7,7,8,8,10};
        int target=8;
        int [] result=new int[2];
        result[0]=-1;
        result[1]=-1;



        result[0]=firstOccurance(nums,0,nums.length-1,target);
        result[1]=lastOccurance(nums,0,nums.length-1,target);

        for(int i:result)
        System.out.print(i+" ");


    }

    private static int lastOccurance(int[] nums, int left, int right, int target) {
        if(left<=right)
        {
            int mid=left+(right-left)/2;

            if(nums[mid]==target)
            {
                if(nums[mid+1]>nums[mid])
                {
                    return mid;
                }

                else
                {
                    return lastOccurance(nums,0,mid+1,target);
                }
            }

            else if(nums[mid]>target)
            {
                return lastOccurance(nums,left,mid-1,target);
            }

            else if (nums[mid]<target)
            {
                return lastOccurance(nums,mid+1,right,target);
            }
        }
        return -1;
    }

    private static int firstOccurance(int[] nums, int left, int right, int target) {

        if(left<=right)
        {
            int mid=left+(right-left)/2;

            if(nums[mid]==target)
            {
                if(nums[mid-1]<nums[mid])
                {
                    return mid;
                }

                else
                {
                    return firstOccurance(nums,0,mid-1,target);
                }
            }

            else if(nums[mid]>target)
            {
                return firstOccurance(nums,left,mid-1,target);
            }

            else if (nums[mid]<target)
            {
                return firstOccurance(nums,mid+1,right,target);
            }
        }
        return -1;
    }
}
