import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class PermutationSequence {
  static PriorityQueue<Integer> minHeap=new PriorityQueue<>((a,b)-> a-b);
  static int c=0;
    public static void main(String[] args )
    {
        int n=9;
        int k=116907;
        System.out.print(getPermutation(n,k));
    }

    public static String getPermutation(int n, int k) {
        StringBuilder sb=new StringBuilder();

        for(int i=1;i<=n;i++)
        {
            sb.append(i);
        }

        String str=new String(sb);

        permute(str,0,str.length()-1,k);
        int count=0;

        while(!minHeap.isEmpty())
        {
            count++;
            if(count==k)
            {
                return Integer.toString(minHeap.remove());
            }
            minHeap.remove();
        }
            return "";
    }

    public static void permute(String str,int low,int high,int k)
    {
        if(low==high)
        {
            minHeap.add(Integer.parseInt(str));
        }

        else
        {
            for(int i=low;i<=high;i++)
            {
                str=swap(str,low,i);
                permute(str,low+1,high,k);
                str=swap(str,low,i);
            }
        }
    }

    public static  String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
