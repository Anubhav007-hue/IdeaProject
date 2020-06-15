import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BagOfTokens {
    public static void main(String[] args )
    {
        int[] tokens={100};
        int P=50;
        System.out.print(bagOfTokensScore(tokens,P));
    }

    public static int bagOfTokensScore(int[] tokens, int P) {
        List<Integer> list=new ArrayList<>();
        for(int token:tokens)
        {
            list.add(token);
        }
        Collections.sort(list);

        int maxPoints=0;
        int currentPoint=0;
        for(int i=0;i<list.size();)
        {
            if(P<list.get(i))
            {
                i++;
                continue;

            }

            else
            {
                P-=list.get(i);
                list.remove(i);
                currentPoint++;
                maxPoints=Math.max(maxPoints,currentPoint);

                if(currentPoint>0 && i<list.size() && list.get(i)>P)
                {
                    currentPoint--;
                    P+=list.get(list.size()-1);
                    list.remove(list.size()-1);

                }
            }
        }

        return maxPoints;

    }
}
