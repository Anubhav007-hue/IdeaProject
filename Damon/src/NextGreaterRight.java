import java.util.*;

public class NextGreaterRight {

    public static void main(String [] args )
    {
        int [] nums2={1,3,4,2};
        System.out.println(NGR(nums2));
    }

    public static List<Integer> NGR(int[] nums2)
    {

        Stack<Integer> stack=new Stack<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=nums2.length-1;i>=0;i--)
        {
            if(stack.size()==0)
            {
                stack.push(nums2[i]);
                list.add(0,-1);
            }

            else
            {
                if(stack.size() >0 && stack.peek()>nums2[i])
                {
                    list.add(0,stack.peek());
                    stack.push(nums2[i]);
                }

                else if( stack.size()>0 && stack.peek()<=nums2[i])
                {
                    while(stack.size()>0 && stack.peek()<=nums2[i])
                    {
                        stack.pop();
                    }

                    if(stack.size()==0)
                    {
                        stack.push(nums2[i]);
                        list.add(0,-1);
                    }

                    else
                    {
                        list.add(0,stack.peek());
                        stack.push(nums2[i]);
                    }
                }

            }
        }

        return list;

    }
}
