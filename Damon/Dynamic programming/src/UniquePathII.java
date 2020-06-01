public class UniquePathII {
    public static void main(String[] args)
    {
        int [][] obstacleGrid={{0,1,0},{0,0,0},{1,0,0}};
       int result= uniquePathsWithObstacles( obstacleGrid);
       System.out.println("The number of paths are :"+result);
    }

    private static int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int n=obstacleGrid.length;
        int m=obstacleGrid[0].length;

        if(obstacleGrid[0][0]==1)
        {
            return 0;
        }

        int dp[][] =new int[n][m];

        for(int i=0;i<m;i++)
        {
            if(obstacleGrid[0][i]==0)
            {
                dp[0][i]=1;
            }
            else if(obstacleGrid[0][i]==1)
            {
                for(int j=i;j<m;j++)
                {
                    dp[0][j]=0;
                }
                break;
            }
        }

        for(int i=0;i<n;i++)
        {
            if(obstacleGrid[i][0]==0)
            {
                dp[i][0]=1;
            }
            else if(obstacleGrid[i][0]==1)
            {
                for(int j=i;j<n;j++)
                {
                    dp[j][0]=0;
                }
                break;
            }
        }

        for(int i=1;i<n;i++)
        {
            for(int j=1;j<m;j++)
            {
                if(obstacleGrid[i][j]==1)
                {
                    dp[i][j]=0;
                }

                else if(obstacleGrid[i][j]==0)
                {
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }
            }
        }
        return dp[n-1][m-1];

    }
}
