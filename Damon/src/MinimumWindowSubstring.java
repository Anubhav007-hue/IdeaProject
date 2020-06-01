import java.util.Arrays;

public class MinimumWindowSubstring {

    public static void main(String[] args )
    {
        String s="cabwefgewcwaefgcf";
        String t="cae";
        String result="";

        int left=0;
        int right=0;
        int min=Integer.MAX_VALUE;

        while (right<s.length())
        {
            StringBuilder sb=new StringBuilder();
            for(int i=left;i<=right;i++)
            {
                sb.append(s.charAt(i));
            }
            String str=new String(sb);

            if(check(str,t)==true)
            {
                if(min>(right-left+1))
                {
                    min=right-left+1;
                    result=str;
                }

                left++;


            }

            else
            {
                right++;
            }
        }


        System.out.println("The min window length is:"+min);
        System.out.println("THe minimum windows is :" +result);

    }

    public  static boolean check(String str,String t)
    {
        int count=0;
        int i=0;
        int j=0;
        char[] character_str=str.toCharArray();
        char[] character_t=t.toCharArray();
        Arrays.sort(character_str);
        Arrays.sort(character_t);
        while(i<str.length() && j<t.length())
        {
            if(character_str[i]!=character_t[j])
            {
                i++;
            }
            else
            {
                j++;
                i++;
                count++;
            }
        }

        if(t.length()==count)
        {
            return true ;
        }

        return false ;
    }
}
