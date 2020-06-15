public class Kth_Grammer {
    public static void main(String [] args )
    {
        int n=30;
        int k=434991989;
        System.out.print(kthGrammar(n,k));
    }

    public static int kthGrammar(int N, int K) {
        String temp="0";
        int count=1;

        while(count!=N)
        {
            int i=0;
            StringBuilder sb=new StringBuilder();
            while(i<temp.length())
            {

                if(temp.charAt(i)=='0')
                {
                    sb.append(0);
                    sb.append(1);
                }
                if(temp.charAt(i)=='1')
                {
                    sb.append(1);
                    sb.append(0);
                }
                i++;
            }
            count++;

            temp=sb.toString();
        }
        return temp.charAt(K-1)-'0';
    }
}
