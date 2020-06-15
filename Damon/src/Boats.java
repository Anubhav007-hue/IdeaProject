import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Boats {
    public static void main(String[] args)
    {
        int people[]={5,4,2,1};
        System.out.print(numRescueBoats(people,6));
    }


    public static  int numRescueBoats(int[] people, int limit) {

        int count=0;

        PriorityQueue<Integer> queue=new PriorityQueue<>((a,b)->b-a);
        for(int i=0;i<people.length;i++)
        {
            queue.add(people[i]);
        }
        int k=0;
        while (!queue.isEmpty())
        {
            people[k++]=queue.remove();
        }
        int i=0;
        int j=people.length-1;
        while(i<=j)
        {
            int cap=2;
            int temp=limit;
            while(i<=j && people[i]<=temp && cap>0)
            {
                temp-=people[i];
                i++;
                cap--;
            }
            while (i<=j && people[j]<=temp && cap>0)
            {
                temp-=people[j];
                j--;
                cap--;
            }
            count++;
        }

        return count;

    }
}
