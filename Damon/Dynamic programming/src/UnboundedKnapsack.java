public class UnboundedKnapsack {
    public static void main(String[] args)
    {
        int[] wt={1,4,9};
//      int [] val={1,5,8,9,10,17,17,20};
        int w=12;
        int n=wt.length;

        int[][] dp=new int[n+1][w+1];
        for(int i=0;i<n+1;i++)
        {
            dp[i][0]=0;
        }
        for(int i=1;i<w+1;i++ )
        {
            dp[0][i]=0;
        }

        for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<w+1;j++)
            {

                if(wt[i-1]<=j)
                {
                    dp[i][j]=Math.min(1+dp[i][j-wt[i-1]],dp[i-1][j]);

                }

                else if(wt[i-1]>j)
                {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        System.out.println(dp[n-1][w]);
    }
}
