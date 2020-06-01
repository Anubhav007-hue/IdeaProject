import java.util.ArrayList;
import java.util.List;

public class ValidSquare {

    public static void main(String[] args )
    {
        int n=4;
        List<Integer> list=new ArrayList<>();
        int sum=0;
        int i=0;
        while (sum<n)
        {
            sum=(int)Math.pow(i,i);
            list.add(sum);
            i++;
        }
        for(int j=0;j<list.size()-1;j++)
        {
            for(int k=1;k<list.size();k++)
            {
                if(list.get(j)+list.get(k)==n)
                {
                    System.out.println("true");
                }
            }
        }

    }
}
