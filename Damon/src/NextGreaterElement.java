import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args )
    {
        int [] arr={8,3,7,5,4,3};
        int n=arr.length;
        int [] result=new int[n];
        int k=n-1;
        Stack<Integer> stack=new Stack<>();
        for(int i=n-1;i>=0;i--)
        {
            if(stack.isEmpty())
            {

                result[k--]=-1;
                stack.push(arr[i]);
            }

            else
            {
                if( stack.size()>0 &&stack.peek()<arr[i]  )
                {
                    result[k--]=stack.peek();
                    stack.push(arr[i]);
                }

                else {
                    while ( stack.size()>0 && stack.peek()>=arr[i]  ) {
                        stack.pop();
                    }

                    if(stack.isEmpty())
                    {

                        result[k--]=-1;
                        stack.push(arr[i]);
                    }

                    else
                    {
                        result[k--]=stack.peek();
                        stack.push(arr[i]);
                    }
                }
            }
        }

        for(int i:result)
        {
            System.out.print(i+" ");

        }
    }
}
