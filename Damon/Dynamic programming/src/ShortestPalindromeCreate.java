public class ShortestPalindromeCreate {



    public static void main(String[] args )
    {
        String s="aabba";
        if(s.length()==0 || s==null)
        {

        }

        int n=s.length();
        StringBuilder sb =new StringBuilder();
        for(int i=0;i<n;i++)
        {
            sb.insert(0,s.charAt(i));
        }
        String reverse=new String(sb);

        StringBuilder sb1=new StringBuilder();

        for(int i=0;i<n;i++)
        {
            sb1.append(s.charAt(i));
        }

        for(int i=0;i<n;i++)
        {
            sb1.append(reverse.charAt(i));
        }
        String prefix=new String(sb1);
        int pivot=countPrefix(prefix);
        StringBuilder sb2=new StringBuilder();
        for(int i=0;i<n-pivot;i++ )
        {
            sb2.append(reverse.charAt(i));
        }
        for(int i=0;i<n;i++ )
        {
            sb2.append(s.charAt(i));
        }

        String finals=new String(sb2);

        System.out.println(finals);
    }



    public static int countPrefix(String s) {
        int k = 0;
        int n = s.length();
        int[] dp = new int[n];
        dp[0] = 0;
        int i = 1;
        while (i < n) {
            if (s.charAt(i) == s.charAt(k)) {
                k++;
                dp[i] = k;
                i++;
            } else {
                // This is tricky. Consider
                // the example. AAACAAAA
                // and i = 7. The idea is
                // similar to search step.
                if (k != 0) {
                    k = dp[k - 1];

                    // Also, note that we do
                    // not increment i here
                }

                // if (len == 0)
                else {
                    dp[i] = 0;
                    i++;
                }
            }
        }

        int res = dp[n - 1];

        return (res > n / 2) ? (n / 2) : res;
    }
}
