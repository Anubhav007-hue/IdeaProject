public class StringCompression {
    public static void main(String[] args )
    {
        char[] chars={'a','a','a','b','b','a','a','a'};
        int slow=0;
        int fast=0;
        int count=0;
        StringBuilder sb=new StringBuilder();
        while(fast<chars.length)
        {
            if(chars[slow]==chars[fast])
            {
                count++;
                fast++;
            }

            else
            {
                if(count==1)
                {
                    sb.append(chars[slow]);
                }

                else
                {
                    sb.append(chars[slow]);
                    sb.append(count);
                }

                slow=fast;
                count=0;
            }
        }
        if(count==1)
        {
            sb.append(chars[slow]);
        }
        else
        {
            sb.append(chars[slow]);
            sb.append(count);
        }
        String str=new String(sb);
        char[] temp=str.toCharArray();
        for(int i=0;i<temp.length;i++)
        {
            chars[i]=temp[i];
        }

        for(int i=0;i<temp.length;i++)
        {
            System.out.print(chars[i]+" ");
        }


    }
}
