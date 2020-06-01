import java.util.Stack;

public class MaximalAreaRectangle {


    public static void main(String[] args )
    {
        char[][] matrix={
                {'1','0','1','0','0'},
                {'1','0','1','1','1'},
                {'1','1','1','1','1'},
                {'1','0','0','1','0'}
        };
        int n=matrix.length;
        int m=matrix[0].length;
        int[][] matrixInt=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                matrixInt[i][j]=matrix[i][j]-'0';
            }
        }
        int [] temp=new int[m];
        for(int i=0;i<m;i++)
        {
            temp[i]=matrixInt[0][i];
        }
        int max=Integer.MIN_VALUE;
        int tempMax=  largestRectangleArea(temp);
        max=Math.max(max,tempMax);
        int k=1;
        while(k<n)
        {
            for(int i=0;i<m;i++)
            {
                if(matrixInt[k][i]==1)
                {
                    temp[i]=temp[i]+matrixInt[k][i];
                }
                else
                {
                    temp[i]=0;
                }
            }
            int Max=largestRectangleArea(temp);
            max=Math.max(Max,max);
            k++;
        }
        System.out.println(max);
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
