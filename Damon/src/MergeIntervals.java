import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
     ArrayList<int[]> intervals=new ArrayList<>();
     int[] temp=new int[2];

     temp[0]=1;
     temp[1]=3;
     intervals.add(temp);
        temp[0]=2;
        temp[1]=6;
     intervals.add(temp);
        temp[0]=8;
        temp[1]=10;
        intervals.add(temp);
        int i=0;
        int j=1;
        int length =intervals.size();

        while(i<length-1 && j<length  )
        {
            int [] current=intervals.get(i);
            int [] next=intervals.get(j);

            if(current[1]>=next[0])
            {
                next[0]=Math.min(current[0],next[0]);
                next[1]=Math.max(current[1],next[1]);
                intervals.remove(current);
                j++;
            }

            else if (current[1]<next[0])
            {
                i=j;
                j++;
            }
        }
System.out.println(intervals);
    }
}
