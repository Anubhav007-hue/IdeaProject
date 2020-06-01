import java.util.HashMap;
import java.util.PriorityQueue;



public class MinimumDiffrence {
  static  int res=0;
    public static void main(String[] args)
    {
        int nums[]={3,5,8,10,15};
        int key=12;

      int min=  find_ElementMin(nums,key,0,nums.length -1);
      System.out.println("The minmum element is "+nums[min]);
    }
    public static int find_ElementMin(int[] nums,int key,int left,int right )
    {
        if(left<=right)
        {
            int mid=left+(right-left)/2;

            if(nums[mid]==key)
            {
                return mid;
            }
            else if(nums[mid]<key)
            {
                if(mid<right && nums[mid+1]<key)
                {
                    return find_ElementMin(nums,key,mid+1,right);
                }
                else if(mid<right)
                {
                    if(Math.abs(nums[mid]-key)<Math.abs(nums[mid+1]-key))
                    {
                        res= mid;
                    }
                    else
                    {
                        res=mid+1;
                    }
                }
                else
                {
                    res=mid;
                }
            }

            else if(nums[mid]>key)
            {
                if(mid>left && nums[mid-1]>key)
                {
                    return find_ElementMin(nums,key,left,mid-1);
                }
                else if(mid>left)
                {
                    if(Math.abs(nums[mid]-key)<Math.abs(nums[mid-1]-key))
                    {
                        res= mid;
                    }
                    else
                    {
                        res= mid-1;
                    }
                }
                else
                {
                    res=mid;
                }
            }
        }

        return res;
    }
}
