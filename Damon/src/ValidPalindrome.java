public class ValidPalindrome {

    public static void main(String[] args )
    {
        String s="0P";
        s.toLowerCase();
        String str=new String(s.toLowerCase());
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<s.length();i++)
        {
            if((str.charAt(i)>='a' && str.charAt(i)<='z')  )
            {
                sb.append(str.charAt(i));
            }
        }

      int start=0;
        int end=sb.length()-1;

        while(start<end)
        {
            if(sb.charAt(start)!=sb.charAt(end))
            {
                System.out.println("false ");
                break;
            }

            start++;
            end--;
        }
System.out.println("true");
    }
}
