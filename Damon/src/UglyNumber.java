public class UglyNumber {
    public static void main(String[] args )
    {
        int n=1352;
        int count=1;
        int i=2;
        while(count<n) {
            if (checkUgly(i)) {
                count++;
            }
            i++;

        }

        System.out.println(i-1);

    }

    private  static boolean checkUgly(int n)
    {


        if(n>Integer.MAX_VALUE  || n<Integer.MIN_VALUE)
        {
            return false ;
        }
        if(n<0){
            return false ;
        }

        while (n>=2)
        {
            if(n%2==0 || n%3==0 || n%5==0)
            {
                if(n%2==0)
                {
                    n=n/2;
                }
               else if(n%3==0)
                {
                    n=n/3;
                }

               else if(n%5==0)
                {
                    n=n/5;
                }

            }

            else
            {
                return false;
            }
        }
        return true ;
    }

}
