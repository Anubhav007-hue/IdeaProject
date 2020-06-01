import java.util.HashMap;
import java.util.Stack;

public class SmallerLeft {

    public static void main(String[] args)
    {
        HashMap<Integer,Integer> map=new HashMap<>();

        int [] arr={0,2,0};
        int[] indexLeft=new int[arr.length];
        NSL(arr,indexLeft);
        for(int i:indexLeft)
        {
            System.out.print(i+" ");
        }
    }

    public static void NSL(int[] arr,int[] indexLeft)
    {
        int length=arr.length;


        Stack<Integer> stack =new Stack<>();



        int k=0;
        for(int j=0;j<length;j++)
        {
            if(stack.size()==0)
            {
                indexLeft[k++]=-1;
                stack.push(j);
            }

            else
            {
                if(  stack.size()>0 && arr[stack.peek()]<arr[j])
                {
                    indexLeft[k++]=stack.peek();
                    stack.push(j);
                }
                else if(stack.size()>0 && arr[stack.peek()]>=arr[j])
                {

                    while(stack.size()!=0 && arr[stack.peek()]>=arr[j])
                    {

                        stack.pop();
                    }
                    if(stack.size()==0)
                    {
                        indexLeft[k++]=-1;
                        stack.push(j);
                    }

                    else
                    {
                        indexLeft[k++]=stack.peek();
                        stack.push(j);
                    }
                }

            }
        }


    }
}
