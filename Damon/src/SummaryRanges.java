import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static void main(String [] args )
    {
        int [] nums={0,2,3,4,6,8,9};
        System.out.print(summaryRanges(nums)+" ");
    }

    public static  List<String> summaryRanges(int[] nums) {

        List<String> res=new ArrayList<>();
        int slow=0;
        int fast=0;

        while(fast<nums.length-1)
        {
            if(nums[fast+1]-nums[fast]==1)
            {
                fast++;
            }

            else
            {
                StringBuilder sb=new StringBuilder();
                if(slow!=fast)
                {
                    sb.append(nums[slow]);
                    sb.append("->");
                    sb.append(nums[fast]);

                }

                else
                {
                    sb.append(nums[fast]);
                }
                res.add(sb.toString());
                fast++;
                slow=fast;
            }
        }
        StringBuilder sb=new StringBuilder();

        if(slow==fast)
        {

            sb.append(nums[fast]);

        }
        else
        {
            sb.append(nums[slow]);
            sb.append("->");
            sb.append(nums[fast]);
        }
        res.add(sb.toString());

        return res;

    }

}
