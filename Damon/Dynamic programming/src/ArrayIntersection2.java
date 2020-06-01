import java.util.ArrayList;
import java.util.Arrays;

public class ArrayIntersection2 {
    public static void main(String[] args )
    {
        int [] nums1={4,9,5};
        int [] nums2={9,4,9,8,4};
        ArrayList<Integer> list=new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int n=nums1.length;
        int m=nums2.length;
        int index=0;
        if(n>m)
        {
            for(int i=0;i<n;i++)
            {
                if(nums1[i]==nums2[index])
                {
                    list.add(nums1[i]);
                    index++;

                }
                if(index==m)
                {
                    break;
                }
            }
        }

        else
        {
            for(int i=0;i<m;i++)
            {
                if(nums2[i]==nums1[index])
                {
                    list.add(nums2[i]);
                    index++;

                }
                if(index==n)
                {
                    break;
                }
            }
        }
        index=0;
        int[] arr=new int[list.size()];
        for(int current:list)
        {
            arr[index++]=current;
        }

        System.out.println(arr);

    }
}
