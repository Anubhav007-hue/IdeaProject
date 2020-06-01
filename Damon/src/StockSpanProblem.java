import java.util.HashMap;
import java.util.Stack;

public class StockSpanProblem {
    public static void main(String[] args )
    {
        int stock[]={100,80,60,70,60,75,85};
        int length=stock.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        Stack<Integer> stack=new Stack<>();
        int[] index=new int[length];
        int[] result=new int[length];
        int k=0;


        for(int i=0;i<length;i++)
        {
            if(stack.size()==0)
            {
                index[k++]=1;
                stack.push(i);

            }

            else
            {
                if(stack.size()>0 && stock[stack.peek()]>stock[i])
                {
                    index[k++]=i-stack.peek();
                    stack.push(i);
                }

                else if(stack.size()>0 && stack.peek()<stock[i])
                {
                    while(stack.size()!=0 && stock[stack.peek()]<stock[i])
                    {
                        stack.pop();
                    }

                    if(stack.size()==0)
                    {
                        index[k++]=i+1;
                    }

                    else
                    {
                        index[k++]=i-stack.peek();
                        stack.push(i);
                    }



                }
            }
        }

        for(int i :index)
        {
            System.out.print(i+" ");
        }

    }
}
