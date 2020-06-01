import java.util.HashMap;
import java.util.Stack;

public class LargestHistogram {

    public static void main(String[] args )
    {
        int[] arr={1,2,3,4,5};
        System.out.println(largestRectangleArea(arr));

    }

    public  static int largestRectangleArea(int[] arr) {

        if(arr.length==0)
        {
            return 0;
        }


        int max=Integer.MIN_VALUE;
        int n=arr.length;
        int [] indexLeft=new int[n];
        int [] indexRight=new int[n];
        NSL(arr,indexLeft);
        NSR(arr,indexRight);
        int[] width=new int[n];
        for(int i=0;i<n;i++)
        {
            width[i]=(indexRight[i]-indexLeft[i])-1;

        }
        for(int i=0;i<arr.length;i++)
        {

            int tempMax=width[i]*arr[i];
            max=Math.max(max,tempMax);
        }

        return max;

    }

    private static void NSL(int[] arr, int[] indexLeft)
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
    private static void NSR(int [] arr,int[] indexRight)
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
