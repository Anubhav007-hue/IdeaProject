public class LongestUncommonSubSequence {

    public static void main(String[] args )
    {
        String text1="abcdabcd";
        String text2="abcabc";



        int n=text1.length() ;
        int m=text2.length ();

        int [][] dp=new int [n+1][m+1];
        dp[0][0]=0;

        for(int i=1;i<n+1;i++)
        {
            dp[i][0]=i;
        }

        for(int i=1;i<m+1;i++)
        {
            dp[0][m]=i;
        }
        StringBuilder sb=new StringBuilder();


        for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<m+1;j++)
            {
                if(text1.charAt(i-1)==text2.charAt(j-1))
                {
                    dp[i][j]=0;
//                    sb.append(text2.charAt(i-1));
                }

                else {
                    dp[i][j]=dp[i-1][j-1]+1;
                }
            }
        }
//
//        if(n!=m)
//        {
//            return Math.max(n,m);
//        }
//
//        else if(n==m && dp[n][m]!=0 && dp[n][m]==n)
//
//        {
//            return -1;
//        }
//
//        return Math.max(n,m);


    }
}
