public class LongestPAlindromicSubSequence {

    public static void main(String[] args )
    {
        String s="a";
        StringBuilder sb=new StringBuilder();
        int n=s.length();
        int m=n;

        for(int i=n-1;i>=0;i--)
        {
            sb.append(s.charAt(i));
        }

        String b=new String(sb );
        int [][] dp=new int[n+1][m+1];
        for(int i=0;i<n+1;i++)
        {
            dp[i][0]=0;
        }

        for(int i=0;i<m+1;i++)
        {
            dp[0][i]=0;
        }

        for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<m+1;j++)
            {
                if(s.charAt(i-1)==b.charAt(j-1))
                {
                    dp[i][j]=1+dp[i-1][j-1];
                }

                else
                {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }

        System.out.println(dp[n][m]);
    }
}
