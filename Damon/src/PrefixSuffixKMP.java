public class PrefixSuffixKMP {
    public static void main(String[] args )
    {
        String s="abcddcba";
        int k=0;
        int n=s.length();
        int[] dp=new int[n];
        dp[0]=0;
        int i=1;
        while(i<n)
        {
            if(s.charAt(i)==s.charAt(k))
            {
                k++;
                dp[i] = k;
                i++;
            }

            else
            {
                // This is tricky. Consider
                // the example. AAACAAAA
                // and i = 7. The idea is
                // similar to search step.
                if (k != 0)
                {
                    k= dp[k-1];

                    // Also, note that we do
                    // not increment i here
                }

                // if (len == 0)
                else
                {
                    dp[i] = 0;
                    i++;
                }
            }
        }

        int res = dp[n-1];



   System.out.println((res > n/2)? (n/2) : res);
    }

}
