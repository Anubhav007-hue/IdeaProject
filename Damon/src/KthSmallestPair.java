import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

import static java.util.Arrays.*;

public class KthSmallestPair {
    public static void main(String[] args) {
        int[] nums = {2, 1, 2, 0, 1, 2, 2, 2, 1, 0, 0, 0, 1, 0, 2, 1, 2, 0, 0, 1, 0, 0, 2, 1, 1, 1, 0, 1, 2, 2, 1, 1, 0, 0, 2, 0, 0, 2, 1, 0, 1, 0, 1, 0, 2, 0, 0, 0, 1, 0};
        int k = 25;
        Arrays.sort(nums);
        for(int i:nums)
        {
            System.out.print(i+" ");
        }


//      System.out.print("The kth smallest pair sum is"+smallestDistancePair(nums,k));

    }
    public static int smallestDistancePair(int[] nums, int k) {

     int index=k-1;
     int left=0;
     int right=nums.length-1;

     return solve(nums,index,left,right);
    }

    private static int solve(int[] nums, int index, int left, int right) {
        while(left<=right)
        {
            int mid=left+(right-left)/2;

            if(mid==index)
            {
                if(mid==nums.length-1)
                {
                    return Math.abs(nums[mid]-nums[mid-1]);
                }
                else
                {
                    return Math.abs(nums[mid]-nums[mid+1]);
                }
            }

            else if(mid>index)
            {
                right=mid-1;
            }

            else if(mid<index)
            {
                left=mid+1;
            }
        }

        return -1;
    }


}
