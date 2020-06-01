public class LowerOrHigher {
 static    int n=10;

    public static void main(String[] args )
    {


        int left=1;
        int right=n;
        int result=findNumber(left,right);

        System.out.println(result);
    }

    public static int findNumber(int left,int right)
    {
        int mid=(left+right)/2;

        while(guess(mid)!=0)
        {



             if(guess(mid)<0)
            {
                findNumber(mid,right);
            }

            else if (guess(mid)>0)
            {
                findNumber(left,mid);
            }
        }

        return mid;
    }

    public  static int guess(int num)
    {
        int check=6;
        if(num<check)
        {
            return -1;
        }
        else if(num>check )
        {
            return 1;
        }
        return 0;
    }
}
