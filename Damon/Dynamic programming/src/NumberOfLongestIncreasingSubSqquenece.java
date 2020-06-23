import java.util.HashSet;
import java.util.Set;

public class NumberOfLongestIncreasingSubSqquenece {

    public static void main(String[] args)
    {
        int [] nums={2,2,2,2,2};
        System.out.println(findNumberOfLIS(nums));
    }

    public static int findNumberOfLIS(int[] nums) {
        int n=nums.length;

//        GET THE MAXIMUM LENGTH OF THE INCREASING SEQUENCE...........................
//        ............................................................................
//        ............................................................................

        int final_Max=Integer.MIN_VALUE;
        int [] dp=new int[n];
        dp[0]=1;
        for(int i=1;i<n;i++)
        {
            int temp=0;
            for(int j=0;j<i;j++)
            {
              if(nums[i]>nums[j])  temp=Math.max(temp,dp[j]);
            }

            dp[i]=temp+1;
            final_Max=Math.max(dp[i],final_Max);
        }



//        TO GET THE NUMBER OF LENGTH EQUALS TO THE FINAL_MAX LENGTH...........................
//        .....................................................................................
//        .....................................................................................
//
        Set<String> set=new HashSet<>();
        int final_count=0;

        for(int i=0;i<n;i++)
        {
            int min=nums[i];
            int max=nums[i];
    StringBuilder sb=new StringBuilder();
            String minString=getMin(nums ,min,0,i-1,sb.append(min));
            String maxString=getMax(nums,max,i+1,n-1,minString);
            if(maxString.length()==final_Max && !set.contains(maxString))
            {
                final_count++;
                set.add(maxString);
            }

        }

        return final_count;
    }

    public static String  getMax(int[] nums,int max,int low,int high,String minString)
    {
        StringBuilder sb=new StringBuilder();
        sb.append(minString);
        int count=0;
        for(int i=low;i<=high;i++)
        {
            if(nums[i]>max)
            {
                max=nums[i];
                sb.append(max);
            }
        }

        return sb.toString();
    }
//
    public static String getMin(int[] nums,int min,int low,int high ,StringBuilder sb)
    {
        int count=0;
        for(int i=high;i>=low;i--)
        {
            if(nums[i]<min)
            {
                min=nums[i];
                sb.insert(0,min);
            }
        }

        return sb.toString();

    }
}
