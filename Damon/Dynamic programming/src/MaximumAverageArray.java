import java.util.ArrayList;
import java.util.List;

public class MaximumAverageArray {
    static List<Double> list=new ArrayList<>();

        public static void main(String[] args )
        {
            int nums[]={1,12,-5,-6,50,3};
            System.out.println(findMaxAverage(nums,4));
        }
    public  static double findMaxAverage(int[] nums, int k) {
        if(nums.length<k)
        {
            double sum=0.0;
            for(int i=0;i<nums.length;i++)
            {
                sum+=nums[i];
            }

            return sum/nums.length;
        }

        int i=0;

        while (i<=nums.length-k)
        {
            double sum=0.0;
            for(int j=i;j<i+k;j++)
            {
                sum+=nums[j];
            }
            double temp=sum/k;
            list.add(temp);
            i++;

        }
        double max=list.get(0);
        for(int l=1;l<list.size();l++)
        {
         if(list.get(l)>max)
         {
             max=list.get(l);
         }
        }

        return max;
    }

}
