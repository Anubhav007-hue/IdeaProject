import java.util.Stack;

public class CountBinaryString {
    public static void main(String[] args)
    {
        String s="0100010001";
        System.out.print(countBinarySubstrings(s));
    }

    public static int countBinarySubstrings(String s) {
        int n=s.length();
        int j=1;
        Stack<Character> stack =new Stack<>();
        int count=0;
        while(j<n)
        {
            if(stack.size()==0)
            {
                int i=j-1;
                char permanent=s.charAt(i);
                while(i>=0 && s.charAt(i)==permanent)
                {
                    stack.push(s.charAt(i));
                    i--;
                }
            }

            else
            {
                if(stack.peek()!=s.charAt(j))
                {
                   while ( j<n && stack.size()>0 && stack.peek()!=s.charAt(j) )
                   {
                       count++;
                       stack.pop();
                       j++;
                   }

                }
                else
                {
                    stack.push(s.charAt(j));
                    j++;
                }
            }

        }

        return count;

    }


}
