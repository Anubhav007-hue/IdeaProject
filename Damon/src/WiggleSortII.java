import java.util.ArrayList;
import java.util.Arrays;

public class WiggleSortII {
    public static void main(String[] args)
    {
        ArrayList<Integer> list=new ArrayList<>();
        int [] nums={1,1,2,1,2,2,1};
        Arrays.sort(nums);
        int n=nums.length;

        if(nums.length%2==0)
        {
            int i=(n/2)-1;
            int temp=i;
            int j=n-1;

            while(j>temp)
            {
                list.add(nums[i]);
                list.add(nums[j]);
                i--;
                j--;

            }
        }

        else
        {
            int i=n/2;
            int temp=i;
            int j=n-1;

            while(j>temp)
            {
                list.add(nums[i]);
                list.add(nums[j]);
                i--;
                j--;

            }

            while(i>=0)
            {
                list.add(nums[i]);
                i--;
            }
        }

        for(int j=0;j<list.size();j++)
        {
            nums[j]=list.get(j);
        }

        for(int j:nums)
        {
            System.out.print(j+" ");

        }
    }
}
