public class CountOne {
    public static void main(String[] args )
    {
        int n =13;
        int count=0;
        for(int i=1;i<=n;i++)
        {
            StringBuilder sb=new StringBuilder();
            sb.append(i);
            for(int j=0;j<sb.length();j++)
            {
                if(sb.charAt(j)=='1')
                {

                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
