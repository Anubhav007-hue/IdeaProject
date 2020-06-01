import java.util.Stack;

public class StringSplit {
    public static void main(String[] args)
    {
        String s="RLLLLRRRLR";
        int substring=balancedStringSplit(s);
        System.out.print(substring);
    }
    public static int balancedStringSplit(String s) {
        int start=0;
        Stack<Character> balanced=new Stack<>();
        int count=0;
        while(start<s.length())
        {
            char current=s.charAt(start);
            if(balanced.isEmpty())
            {
                balanced.push(current);
                start++;
            }
            else
            {
                if(current==balanced.peek())
                {
                    balanced.push(current);
                    start++;
                }
                else
                {
                    while(balanced.size()>0 && balanced.peek()!=s.charAt(start))
                    {
                        balanced.pop();
                        start++;
                    }
                    if(balanced.size()==0)
                    {
                        count++;
                    }
                }
            }
        }

    return count;
    }
}
