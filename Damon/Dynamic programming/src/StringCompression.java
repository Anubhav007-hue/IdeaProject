import java.util.HashMap;

public class StringCompression {
    public static void main(String[] args) {
        char[] chars = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        int compressed = compress(chars);
        for(int i=0;i<compressed;i++)
        {
            System.out.print(chars[i]+" ");
        }

    }

    public static int compress(char[] chars) {
        StringBuilder sb=new StringBuilder();
        int left=0;
        int right=0;
        int count=1;

        if(chars.length==1)
        {
            return chars.length;
        }

        while (right<chars.length-1)
        {
            if(chars[right]==chars[right+1])
            {
                count++;
                right++;
            }

            else
            {
                if(count==1)
                {
                    sb.append(chars[right]);
                    right++;
                    left=right;
                }

                else
                {
                    sb.append(chars[right]);
                    sb.append(count);
                    right++;
                    left=right;
                    count=1;
                }
            }
        }
        if(count==1)
        {
            sb.append(chars[right-1]);
        }

        else
        {
            sb.append(chars[right-1]);
            sb.append(count);
        }

        String str=new String(sb);

        for(int i=0;i<str.length();i++)
        {
            chars[i]=str.charAt(i);
        }
        return str.length();
    }
}
