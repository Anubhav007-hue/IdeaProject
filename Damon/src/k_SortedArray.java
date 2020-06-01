import java.util.PriorityQueue;

public class k_SortedArray {

    public static void main(String[] args )
    {
        int[] arr={1,4,7,2,2,4,5};
        int k=3;
        int index=0;
        PriorityQueue<Integer> min=new PriorityQueue<>();
        for(int current:arr)
        {
            min.add(current);
            if(min.size()>k)
            {
                arr[index++]=min.remove();
            }
        }

        while(!min.isEmpty())
        {
            arr[index++]=min.remove();
        }

        for(int current:arr)
        {
            System.out.print(current+" ");
        }
    }
}
