import java.util.Stack;

public class SmallerRight {
    public static void main(String[] args)
    {
        int [] arr={};
        int[] indexRight=new int[arr.length];
        NSR(arr,indexRight);
        for(int i:indexRight)
        {
            System.out.print(i+" ");
        }
    }

    public static void NSR(int[] arr ,int[] indexRight)
    {


        Stack<Integer> stack =new Stack<>();

        int n =arr.length ;

        int k=n-1;
        for(int j=n-1;j>=0;j--)
        {
            if(stack.size()==0)
            {
                indexRight[k--]=n;
                stack.push(j);
            }

            else
            {
                if(  stack.size()>0 &&arr[stack.peek()]<arr[j])
                {




                    indexRight[k--]=stack.peek();


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
                        indexRight[k--]=n;
                        stack.push(j);
                    }

                    else
                    {
                        indexRight[k--]=stack.peek();
                        stack.push(j);
                    }
                }

            }
        }


    }
}
