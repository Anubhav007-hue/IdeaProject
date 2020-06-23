
import java.util.*;

public class DeleteAdjacentDuplicates {
    public static void main (String[] args) {
        DeleteAdjacentDuplicates g=new DeleteAdjacentDuplicates();
        Scanner scan=new Scanner(System.in);
        System.out.print("No of testCases");
        int T=scan.nextInt();

        while(T>0)
        {

            System.out.print("Input string");
            String str=scan.next();
            System.out.println(g.removeDuplicates(str));
            T--;
        }
    }

    public  String removeDuplicates(String S) {
        Stack<Character> stack=new Stack<>();
        int i=0;
        while(i<S.length())
        {
            if(stack.isEmpty())
            {
                stack.push(S.charAt(i));
            }

            else
            {
                if(stack.peek()==S.charAt(i))
                {
                    stack.pop();
                }
                else
                {
                    stack.push(S.charAt(i));
                }
            }
            i++;
        }
        StringBuilder sb=new StringBuilder();
        while(!stack.isEmpty())
        {
            sb.insert(0,stack.pop());
        }
        return sb.toString();
    }


}
