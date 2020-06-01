public class IntegerReplacement {

    public static void main(String[] args ) {


        int n=999;
       int[] dp = new int[n + 1];
        int temp=integerReplacement(n,dp);
        System.out.println(temp);



    }
    public  static int integerReplacement(int n,int [] dp)
    {
        if(n==1)
        {
            return 0;
        }

        else if (n%2==0)
        {
            if(dp[n]!=0)
            {
                dp[n]=1+integerReplacement(n/2,dp);
            }
            else
            {
                return dp[n];
            }
        }



            if(dp[n]!=0)
            {
                dp[n]=1+Math.min(integerReplacement(n-1,dp),integerReplacement(n+1,dp));
            }


                return dp[n];



    }
}
