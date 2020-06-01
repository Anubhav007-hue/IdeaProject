public class PeakElement {

    public static void main(String[] args)

    {
        int nums[]={1,2,3,1};
        int peak=findPeakElement(nums);
        System.out.print("The peak element is :"+peak);
    }
    public  static int findPeakElement(int[] nums) {
        int low =0;
        int high=nums.length-1;

        if(nums.length==1)
        {
            return 0;
        }

        while(low<=high)
        {
            int mid=low+(high-low)/2;

            if(mid==0)
            {
                if(nums[mid+1]<nums[mid])
                {
                    return mid;
                }
                else
                {
                    return mid+1;
                }
            }

            else if(mid==nums.length-1)
            {
                if(nums[mid-1]<nums[mid])
                {
                    return mid;
                }
                else
                {
                    return mid-1;
                }
            }
            else if(mid>low && mid<high && nums[mid]>nums[mid+1] && nums[mid]>nums[mid-1] )
            {
                return mid;
            }

            else if(mid>low && mid<high && nums[mid+1]>nums[mid])
            {
                low=mid+1;
            }

            else if(mid>low && mid<high && nums[mid-1]>nums[mid])
            {
                high=mid-1;
            }
        }

        return -1;
    }
}
