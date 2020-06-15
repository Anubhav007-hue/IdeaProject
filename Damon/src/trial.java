import java.util.*;
import java.util.LinkedList;


public class trial {

int [] temp;
    public static void main(String[] args)
    {

            int n=-3;

            System.out.print(isPowerOfThree(n));

    }

    public static  boolean isPowerOfThree(int n) {

        if(n==0)
        {
            return false ;
        }
        n=Math.abs(n);

        while(n>1)
        {
            if(n%3!=0)
            {
                return false ;
            }
            n=n/3;
        }

        return true ;
    }

}
