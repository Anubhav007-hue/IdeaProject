import java.util.PriorityQueue;
import java.util.Stack;

public class ContiguosArray {

    public static void main(String[] args)
    {
        int [] nums={0,1,1};



        Stack<Integer> stack=new Stack<>();

        PriorityQueue<Integer> maxArray=new PriorityQueue<>();
        int count=0;
        int i=0;
        while (i<nums.length)
        {
            if(nums[i]==0)
            {
                stack.push(nums[i]);
            }
            else if(nums[i]==1 && !stack.isEmpty())
            {
                int current=stack.pop();
                count=count+2;
            }

            if(stack.isEmpty())
            {
                maxArray.add(-count);
                count=0;
            }

            i++;

        }

        System.out.println(-maxArray.remove());
    }
}
