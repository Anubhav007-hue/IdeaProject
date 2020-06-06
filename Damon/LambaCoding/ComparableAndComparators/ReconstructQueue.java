import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class ReconstructQueue {

    public static void main(String[] args) {
        int[][] nums = {{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}};
        List<int[]> result=new ArrayList<>();
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]);
        Collections.addAll(maxHeap, nums);
//        while(!maxHeap.isEmpty())
//        {
//            int [] temp=maxHeap.remove();
//            System.out.print(temp[0]+","+temp[1]+"  ");
//        }

        while(!maxHeap.isEmpty())
        {
            int [] temp= maxHeap.remove();
            result.add(temp[1],temp);
        }
        int[][] finalArray=new int[result.size()][];
       int j=0;
        for(int [] i:result)
        {
            int [] temp=i;
            finalArray[j]=temp;
            j++;
        }

        for(int[] i:finalArray)
        {
            int[] temp=i;
            System.out.print(temp[0]+","+temp[1]+"  ");
        }

    }
}