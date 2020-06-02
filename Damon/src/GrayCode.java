import java.util.ArrayList;
import java.util.List;

public class GrayCode {
   static  List<String> permuatations=new ArrayList<>();
   static  List<String> result=new ArrayList<>();
    public static void main(String[] args)
    {
        int n=2;

//        Generating the grayCode.....

        StringBuilder code=new StringBuilder();
        for(int i=0;i<Math.pow(2,n);i++)
        {
            code.append(i);
        }
        String str=new String(code);

//        Gettting the various permutations of the code

        permuate(str,0,str.length()-1);

//        CHECKING FOR THE ONE BIT DIFFRENCE....

        checkBitDiffrence(permuatations);

//        ONLY PRINTING THE FIRST STRING OF THE SEQUENCE

        System.out.print(result.get(0));
    }

    private static void checkBitDiffrence(List<String> permuatations) {
        int slow=0;
        int fast=1;
        int index=0;

        while(index<permuatations.size())
        {
            boolean bool=true;

//            GETTING THE FIRST STRING OF THE PERMUATED LIST..

            String grayCode=permuatations.get(index);

//            CHECKING EVERY CHARACTER OF THE RETURNED STRING OF THE LIST..

            while(slow<grayCode.length()-1 && fast<grayCode.length())
            {
//                CHANGING THE CHARACTER TO INTEGER..

                int first=grayCode.charAt(slow)-'0';
                int second=grayCode.charAt(fast)-'0';

                if(!isPowerOfTwo(first^second))
                {
                    bool=false;
                    break;
                }
                slow ++;
                fast ++;

            }
            if(bool==true)
            {
                result.add(grayCode);
            }
            index++;
        }

    }
    static boolean isPowerOfTwo(int x)
    {
        return x!= 0 && ((x & (x - 1)) == 0);
    }


    public static  void permuate(String str,int l,int r){
        if(l==r)
        {
            permuatations.add(str);
        }
        else {
            for (int i = l; i <= r; i++) {
//                  SETTING THE VARIABLES..

                str = swap(str, l, i);

//                TAKING THE NEXT VARIABLE ...

                permuate(str, l + 1, r);

//                BACKTRCKING FOR THE POSSIBLE REPLACEMENT

                str = swap(str, l, i);
            }
        }
    }
    public static  String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
