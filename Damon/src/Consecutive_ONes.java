public class Consecutive_ONes {
    public static void main(String[] args )
    {
        int n=100000000;
int count=0;
        for(int i=0;i<=n;i++)
        {
            boolean bool=true;
            String temp=Integer.toBinaryString(i);
            for(int j=0;j<temp.length()-1;j++)
            {
                if(temp.charAt(j)=='1')
                {
                    if(temp.charAt(j+1)=='1')
                    {
                        bool=false;
                        break;
                    }
                }
                else
                {
                    continue;
                }
            }
            if(bool==true)
            {
                count++;
            }

        }
        System.out.print(count);
    }
}
