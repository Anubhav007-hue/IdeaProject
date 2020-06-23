public class FlowerBed {
    public static void main(String [] args)
    {
        int [] flowerbed={0,0,1,0,0};
        int n=1;

        System.out.print(canPlaceFlowers(flowerbed,n));
    }
    public  static boolean canPlaceFlowers(int[] flowerbed, int n) {

        if(flowerbed.length==0 || flowerbed==null)
        {
            return false ;
        }

        if(n>flowerbed.length)
        {
            return false ;
        }
        if(flowerbed.length==1 && flowerbed[0]==0 )
        {
            return true ;
        }


        int count=0;
        int tempCount=n;

        for(int i=0;i<flowerbed.length && tempCount>0;)
        {

            if(flowerbed[i]==1)
            {
                i++;
            }
            else
            {
                if(i>0 && i<flowerbed.length-1)
                {
                    if(flowerbed[i-1]==0 && flowerbed[i+1]==0)
                    {
                        count++;
                        tempCount--;
                        i++;
                    }
                }
                else if(i==0)
                {
                    if(flowerbed[i+1]==0)
                    {
                        count++;
                        tempCount--;
                        i++;
                    }
                }
                else if(i==flowerbed.length-1)
                {
                    if(flowerbed[i-1]==0)
                    {
                        count++;
                        tempCount--;
                        i++;
                    }
                }

                i=i+1;
            }
        }
        return count==n ? true :false ;
    }
}
