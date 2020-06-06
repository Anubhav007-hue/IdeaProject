import java.util.HashSet;
import java.util.Set;

public class RepeatedStringMatch {
    public static void main(String[] args )
    {
        String A="abcabcabcabc";
        String B="abac";
        System.out.print(repeatedStringMatch(A,B));
    }
    public static int repeatedStringMatch(String A, String B)
    {
        StringBuilder sb=new StringBuilder();
        int count=0;
        while(sb.length()<B.length())
        {
            count++;
            sb.append(A);
        }
        String str=sb.toString();
        if(str.contains(B))
        {
            return count;
        }
        count++;
        sb.append(A);
        str=sb.toString();
        if(str.contains(B))
        {
            return count;
        }
        return -1;
    }
}
