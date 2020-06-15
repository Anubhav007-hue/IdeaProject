public class StringRotation {
    public static void main(String [] args )
    {
        String A="abcde";
        String B="cdeab";
       System.out.print( rotateString(A,B));

    }

    public static boolean rotateString(String A, String B) {


        if(A.length()==0 && B.length()==0)
        {
            return true;
        }

        if(A.length()==0 || B.length()==0 )
        {
            return false;

        }
        int index=0;
        for(int i=0;i<B.length();i++)
        {
            char current=B.charAt(i);
            if(current==A.charAt(0))
            {
                index=i;
                break;
            }
        }

        String temp = leftRotate(A,A.length(),A.length()-index-1);

        if(temp.equals(B))
        {
            return true ;
        }
        return false;
    }


    static String leftRotate(String str, int n,
                           int k)
    {
        char[] arr=str.toCharArray();
        char [] result=new char[arr.length];
        int mod = k % n;
        int a=0;
        for(int i = 0; i < n; ++i)
            result[a++]=arr[(i + mod) % n];

        return String.valueOf(result);
    }
}
