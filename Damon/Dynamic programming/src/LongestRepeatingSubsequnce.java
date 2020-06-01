public class LongestRepeatingSubsequnce {

    public static void main(String[] args )
    {
        String text1="aab";
        String text2="aab";

        int n=text1.length() ;
        int m=text2.length ();

        int [][] dp=new int [n+1][m+1];

        for(int i=0;i<n+1;i++)
        {
            dp[i][0]=0;
        }

        for(int i=1;i<m+1;i++)
        {
            dp[0][m]=0;
        }
        StringBuilder sb=new StringBuilder();


        for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<m+1;j++)
            {
                if(text1.charAt(i-1)==text2.charAt(j-1) && i!=j)
                {
                    dp[i][j]=1+dp[i-1][j-1];
//                    sb.append(text2.charAt(i-1));
                }

                else {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        System.out.println(dp[n][m]);
    }
}
