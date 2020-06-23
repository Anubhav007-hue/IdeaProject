import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestHarmonicSub {

    public static void main(String[] args)
    {
        int [] nums={1,2,3,4};
        System.out.print(longestHarmonicSubSequence(nums));
    }

    public static int longestHarmonicSubSequence(int [] nums)
    {
        if(nums.length==0 || nums==null)
        {
            return 0;
        }

//        TO STORE THE LAST INDEX OF THE DUPLICATE NUMBER BECAUSE WE WANT THE LONGEST LENGTH.........
//        ...........................................................................................
        int maxLength=0;
        Arrays.sort(nums);

        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],i);
        }

//        TRAVERSING THE WHOLE ARRAY FOR FINDING THE PLUS ONE ELEMENT...........................
//        ........................................................................................


        for(int i=0;i<nums.length-1;i++)
        {
            if(map.containsKey(nums[i]+1))
            {
                int lastIndex=map.get(nums[i]+1);
                maxLength=Math.max(maxLength,lastIndex-i+1);

            }

            while(i<nums.length-1 && nums[i+1]==nums[i])
            {
                i++;
            }

        }

        return maxLength;
    }
}
