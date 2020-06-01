import java.util.Arrays;

public class BulbSwitcher {

    public static void main(String [] args)
    {
        int n=5;
        int[] bulb=new int[n+1];
        Arrays.fill(bulb,0);

        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j=j+i)
            {
                if(bulb[j]==0)
                {
                    bulb[j]=1;
                }
                else
                {
                    bulb[j]=0;
                }
            }
        }
        int count=0;
        for(int current:bulb)
        {
            if(current==1)
            {
                count++;
            }
        }

        System.out.println(count);
    }
}
