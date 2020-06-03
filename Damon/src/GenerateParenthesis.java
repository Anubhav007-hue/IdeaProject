import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
     static List<String> list=new ArrayList<>();
    public static void main(String[] args)
    {
        int n=3;

        int open=n;
        int close=n;
        char[] str1=new char[n*2];
        generate(str1 ,open,close,0);
        for(String str:list)
        {
            System.out.println(str);
        }
    }

    private static void generate(char[] s, int open, int close,int pos) {
        if( open==0 && close ==0)
        {
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<s.length;i++)
            {
                sb.append(s[i]);
            }

            list.add(sb.toString());
            return ;
        }
        else
        {

             if(close>open)
            {
                s[pos]=')';
                generate(s,open,close-1,pos+1);
            }
            if(open>0)
            {
                s[pos]='(';
                generate(s,open-1,close,pos+1);
            }
        }
    }
}
