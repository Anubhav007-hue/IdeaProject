import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RedundantConnections {
    public static void main(String[] args )
    {
        int [][] edges={{3,4},{1,2},{2,4},{3,5},{2,5}};
    Arrays.sort(edges,(a,b)-> a[1]-b[1]);
//        Set<Integer> redundant=new HashSet<>();
//        int[] result=new int[2];
//        for(int [] i:edges)
//        {
//            int[] temp=i;
//            if(redundant.contains(temp[0]) && redundant.contains(temp[1]))
//            {
//
//            }
//            redundant.add(temp[0]);
//            redundant.add(temp[1]);
//        }
//
//        return result;
for(int[] i:edges)
{
    int[] temp=i;
    System.out.println("[" +temp[0]+","+temp[1]);
}
    }

}
