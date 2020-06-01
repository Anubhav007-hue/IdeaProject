public class FIndElementIn_Rotated {
    public static void main(String[] args)
    {
        int nums[]={1};
        int target=2;
        int result=findIndex(nums,target);
        System.out.println("The index of the target is :"+result);
    }

    public static int findIndex(int[] nums,int target)
    {
        int N=nums.length;
        int index=0;

//        Means the array is not rotated.............

        if(nums[0]<=nums[N-1])
        {
            index=normalBinarySearch(nums,0,N-1,target);
        }

//        Means the array is rotated ................
        else
        {
            index=findMinIndex(nums);
            System.out.println(index);
            if(target>=nums[index] && target<=nums[N-1])
            {
                index=normalBinarySearch(nums,index,N-1,target);
            }

            else if (target>=nums[0] && target<=nums[index-1])
            {
                return normalBinarySearch(nums,0,index-1,target);
            }
            else
            {
              index=  normalBinarySearch(nums,0,N-1,target);
            }
        }
        return index;
    }
    public static int findMinIndex(int[] nums)
    {
        int N=nums.length;
        int left=0;
        int right=N-1;

        while(left<=right)
        {
            int mid=left+(right-left)/2;
            int next=(mid+1)%N;
            int prev=(mid+N-1)%N;
            if(nums[mid]<=nums[next] && nums[mid]<=nums[prev])
            {
                return mid;
            }
            else if (nums[mid]<=nums[right])
            {
                right=mid-1;
            }

            else if(nums[mid]>=nums[left])
            {
                left=mid+1;
            }


        }
        return -1;
    }

    public static int normalBinarySearch(int[] nums, int left, int right,int target)
    {
        if(left<=right)
        {
            int mid =left+(right-left)/2;

            if(nums[mid]==target)
            {
                return mid;
            }

            else if (nums[mid]>target)
            {
                return normalBinarySearch(nums,left,mid-1,target);
            }

            else if (nums[mid]<target)
            {
                return normalBinarySearch(nums,mid+1,right,target);
            }
        }
        return -1;
    }
}
