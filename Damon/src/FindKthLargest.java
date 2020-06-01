import java.util.PriorityQueue;

public class FindKthLargest {
    public static void main(String[] args )
    {
        int [] nums={3,2,1,5,6,4};
        int k=2;
        PriorityQueue<Integer> max=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++)
        {
            if(max.size()>k)
            {
                int data=max.poll();
                System.out.println("Data deleting"+data);
            }
            System.out.println("Data adding"+nums[i]);
            max.add(nums[i]);
        }
        int result=max.poll();
        System.out.println(result);

//        System.out.println(min.peek());
    }
}
