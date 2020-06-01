public class ValidPalidromeII {

    public static void main(String[] args )
    {
        String s="abca";

        boolean bool=validPalindrome(s);
        System.out.println(bool);
    }

    public static boolean validPalindrome(String s) {

    int i=0;
    int j=s.length()-1;
        while (i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return isPalindrome(s,i+1,j) || isPalindrome(s,i,j--);
            }

            i++;
            j--;
        }


        return true;



    }

    public static boolean isPalindrome(String s,int i,int j)
    {


        while (i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false ;
            }

            i++;
            j--;
        }

        return true;
    }
}
