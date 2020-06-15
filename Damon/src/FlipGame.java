import java.util.ArrayList;
import java.util.List;

public class FlipGame {
    public static void main(String[] args )
    {
        String str="++++";
        List<String> result=new ArrayList<>();
        flip(str,0,1,result);
        System.out.print(result);
    }

    public static void flip(String str,int slow,int fast ,List<String> result)
    {

        if(fast==str.length())
        {
            return;
        }
        String original=str;
        char [] temp=str.toCharArray();
        if(temp[slow]=='+')
        {
            temp[slow]='-';
        }
        else
        {
            temp[slow]='+';
        }

        if(temp[fast]=='+')
        {
            temp[fast]='-';
        }
        else
        {
            temp[fast]='+';
        }

        result.add(temp.toString());
        flip(original,slow++,fast++,result);

    }
}
