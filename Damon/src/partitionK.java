public class partitionK {
    public static void main(String[] args )
    {
        int[] wt={4, 3, 2, 3, 5, 2, 1};
        int k=4;
        int n=wt.length;
        int w=5;



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
        System.out.print(dp[n][w]);
    }
}
