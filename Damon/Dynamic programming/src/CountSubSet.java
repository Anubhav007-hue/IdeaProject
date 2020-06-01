import java.util.ArrayList;
import java.util.List;

public class CountSubSet {

    public static void main(String[] args )
    {
        List<List<Integer>> subset= new ArrayList<>();
        int [] wt={1,2,3};
        int w=5;
        int n=wt.length;
        int count=0;

        int[][] dp=new int[n+1][w+1];

        for(int i=0;i<n+1;i++)
        {
            dp[i][0]=1;

        }
        for(int i=1;i<w+1;i++)
        {
            dp[0][i]=0;
        }


        for(int i=1;i<n+1;i++)
        {

            for( int j=1;j<w+1;j++)
            {
                if(wt[i-1]<=j)
                {
                    dp[i][j]=dp[i-1][j-wt[i-1]]+dp[i-1][j];


                }

                else if(wt[i-1]>j)
                {
                    dp[i][j]=dp[i-1][j];
                }
            }


        }
    System.out.println(dp[n][w]);

//        for(int i=0;i<n+1;i++)
//        {
//            for(int j=0;j<w+1;j++)
//            {
//                System.out.print(dp[i][j]+" ");
//            }
//            System.out.println();
//        }
    }
}
