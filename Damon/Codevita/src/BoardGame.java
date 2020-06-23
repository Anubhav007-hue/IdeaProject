import java.util.Scanner;

public class BoardGame {
    public static void main(String[] args )
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of the grid");
        int N=scan.nextInt();
        int[][] matrix=new int[N][N];
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                matrix[i][j]=scan.nextInt();
            }
        }

        int [][] dp=new int[N][N];
        dp[0][0]=0;
        int prev=dp[0][0];
        int k=0;

        for(int i=1;i<N;i++)
        {
            k=matrix[0][i];
            dp[0][i]=k+(prev/2);
            prev=dp[0][i];
        }
        prev=dp[0][0];
        k=0;

        for(int i=1;i<N;i++)
        {
            k=matrix[i][0];
            dp[i][0]=k+(prev/2);
            prev=dp[i][0];
        }

        for(int i=1;i<N;i++)
        {
            for(int j=1;j<N;j++)
            {
                prev=Math.min(dp[i-1][j],dp[i][j-1]);
                k=matrix[i][j];
                dp[i][j]=k+(prev/2);
            }
        }

        System.out.println(dp[N-1][N-1]);

    }
}
