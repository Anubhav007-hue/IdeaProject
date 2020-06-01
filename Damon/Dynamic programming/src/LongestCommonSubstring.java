public class LongestCommonSubstring {
    public static void main(String[] args)
    {
        String x="eidbaooo";
        int n=x.length();
       String y="ba";
        int m=y.length();

        int[][] dp=new int[n+1][m+1];
        for(int i=0;i<n+1;i++)
        {
            dp[i][0]=0;
        }
        for(int i=1;i<m+1;i++)
        {
            dp[0][i]=0;
        }

        for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<m+1;j++)
            {
                if(x.charAt(i-1)==y.charAt(j-1))
                {
                    dp[i][j]=1+dp[i-1][j-1];
                }

                else
                {
                    dp[i][j]=0;
                }
            }
        }

        int max=Integer.MIN_VALUE;

        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=m;j++)
            {
                if(max<dp[i][j])
                    max=dp[i][j];
            }
        }

        System.out.println(max);
//        int start=0;
//        int end=0;
//        for( int i=0;i<n+1;i++)
//        {
//            for(int j =0;j<=m;j++)
//            {
//                if(max==dp[i][j])
//                {
//                    start=i;
//                    end=j;
//                    break;
//                }
//            }
//        }
//
//        StringBuilder result=new StringBuilder();
//
//        while(dp[start][end]!=0)
//        {
//            result.insert(0,x.charAt(start-1));
//            start--;
//            end--;
//        }
//
//        System.out.println(result);
    }

}
