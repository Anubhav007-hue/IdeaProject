import java.util.Stack;

public class ShortestCommonSuperSequence {
    public static void main(String[] args )
    {
        String text1="abac";
        String text2="cab";

        int n=text1.length();
        int m=text2.length();

        int[][] dp_lcs=new int[n+1][m+1];




        for(int i=0;i<n+1;i++)
        {
            dp_lcs[i][0]=0;
        }

        for(int i=1;i<m+1;i++)
        {
            dp_lcs[0][m]=0;
        }




        for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<m+1;j++)
            {
                if(text1.charAt(i-1)==text2.charAt(j-1))
                {
                    dp_lcs[i][j]=1+dp_lcs[i-1][j-1];
//                    sb.append(text2.charAt(i-1));
                }

                else {
                    dp_lcs[i][j]=Math.max(dp_lcs[i-1][j],dp_lcs[i][j-1]);
                }
            }
        }


        StringBuilder sb =new StringBuilder();
        Stack<Character> stack=new Stack<>();
        int i=n;
        int j=m;

        while(i>0 && j>0)
        {
            if(text1.charAt(i-1)==text2.charAt(j-1)) {

                sb.insert(0,text1.charAt(i-1));
                i--;
                j--;
            }
                else
                {


                    if(dp_lcs[i-1][j]>dp_lcs[i][j-1])
                    {
                        sb.insert(0, text1.charAt(i-1));
                        i--;
                    }
                    else
                    {
                        sb.insert(0,text2.charAt(j-1));

                        j--;
                    }
                }

        }

        while (i>0)
        {
            sb.insert(0,text1.charAt(i-1));
            i--;
        }

        while (j>0)
        {
            sb.insert(0,text2.charAt(j-1));
            j--;
        }


        String str=new String(sb);
      System.out.println(str);
    }
}
