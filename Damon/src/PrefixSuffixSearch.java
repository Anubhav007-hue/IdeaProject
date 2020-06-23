import java.util.Stack;

public class PrefixSuffixSearch {

    public static void main(String [] args )
    {
        String str="abcewjeefab";
        int length=0;
        length=getLength(str);
        System.out.println("The length od the longes prefix and suffix is :"+length);
    }

    public static int getLength(String str)
    {
        Stack<Character> stack=new Stack<>();
        int i=0;
        int j=str.length()-1;
        char [] temp=str.toCharArray();
        int res=0;

        int size=0;
        while(i<temp.length)
        {
            if(stack.isEmpty())
            {
                stack.push(temp[i]);
            }

            else
            {
                if(stack.peek()!=temp[j])
                {
                    stack.push(temp[i]);
                }
                else
                {
                    size=stack.size() ;
                    while(stack.size()>0 && temp[j]==stack.peek())
                    {
                        stack.pop();
                        j--;
                    }
                    res=size-stack.size();
                    break;
                }
            }
            i++;
        }

        return res;
    }
}
