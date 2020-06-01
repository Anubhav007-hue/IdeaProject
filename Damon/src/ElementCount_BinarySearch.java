public class ElementCount_BinarySearch {

    public static void main(String[] args)
    {
        int nums[]={10};
        int key=10;
        int count=0;

        ElementCount_BinarySearch eb=new ElementCount_BinarySearch();

         int sum1=eb.leftSearchCount(nums,0,nums.length-1,key,count);
         int sum2 =eb.rightSearchCount(nums,0,nums.length-1,key,count);
         System.out.println(sum1+sum2-1);
    }
    public int leftSearchCount(int[] nums,int left,int right,int key,int count)
    {
        if(left<=right)
        {
            int mid=left+(right-left)/2;
            if(nums[mid]==key)
            {
                count+=1;
                 return leftSearchCount(nums,left,mid-1,key,count) ;

            }

            else if(nums[mid]<key)
            {
                return leftSearchCount(nums,mid+1,right,key,count);

            }

            else
            {
                return leftSearchCount(nums,left,mid-1,key,count);
            }
        }

        return count;
    }
    public int rightSearchCount(int[] nums,int left,int right,int key,int count)
    {
        if(left<=right)
        {
            int mid=left+(right-left)/2;
            if(nums[mid]==key)
            {
                count+=1;
                return rightSearchCount(nums,mid+1,right,key,count);
            }

            else if(nums[mid]<key)
            {
                return rightSearchCount(nums,mid+1,right,key,count);

            }

            else
            {
                return rightSearchCount(nums,left,mid-1,key,count);
            }
        }

        return count;
    }
}
