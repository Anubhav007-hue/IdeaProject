import java.util.ArrayList;
import java.util.List;

public class PowerSet {

        public static void main(String[] args )
        {
            int [] nums={1,2,3};
            List<List<Integer>> subSets=new ArrayList<>();
            generateSubSets(0,nums,new ArrayList<Integer>(),subSets);
            System.out.print(subSets);
        }

    private static void generateSubSets(int index, int[] nums, ArrayList<Integer> current, List<List<Integer>> subSets)
    {
        subSets.add(new ArrayList<>(current));
        for(int i=index;i<nums.length;i++)
        {
            int temp=nums[i];
            current.add(temp);
            generateSubSets(i+1,nums,current,subSets);
            current.remove(current.size()-1);
        }
    }


}

