import javax.swing.text.StyledEditorKit;
import java.util.Stack;

public class BaseballGame {

    public static void main(String[] args ){
        String[] str={"5","-2","4","C","D","9","+","+"};
        System.out.print(calPoints(str));
    }

    public  static int calPoints(String[] str) {
        Stack<Integer> stack=new Stack<>();
        int sum=0;
            for (int i=0;i<str.length;i++)
            {
                String temp=str[i];

                    if (temp.charAt(0)=='+')
            {
                int first=stack.pop();
                int second=stack.pop();
                sum+=first+second;

                stack.push(first);
                stack.push(first+second);
            }

              else   if(Math.abs(temp.charAt(0)-'0')>=0 && Math.abs(temp.charAt(0)-'0')<=9)
                {
                    int in=Integer.parseInt(temp);
                    stack.push(in);
                    sum+=stack.peek();

                }

                else if(temp.charAt(0)=='C')
                {
                    sum-=stack.pop();
                }

                else if(temp.charAt(0)=='D')
                {
                    int dou=2 * stack.peek();
                    sum+=dou;
                    stack.push(dou);
                }


            }

            return sum;
    }
}
