import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindKPairs {
    public static void main(String[] args)
    {
        int k=3;
        int[] nums1={1,1,2};
        int [] nums2={1,2,3};
        List<List<Integer>> finalList=new ArrayList<>();
        finalList=CheckList(nums1,nums2,k);
        System.out.println(finalList);
    }

    public static List<List<Integer>> CheckList(int[] nums1, int[] nums2, int k)
    {
        List<List<Integer>> result=new ArrayList<>();
        List<List<Integer>> temp=new ArrayList<>();

        int n=nums1.length;
        int m=nums2.length;


        if(n*m<=k)
        {
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    List<Integer> list=new ArrayList<>();
                    list.add(nums1[i]);
                    list.add(nums2[j]);
                    result.add(list);

                }
            }
                return result;
        }
        ArrayList<Integer> initial=new ArrayList<>();
        int sum1=nums1[0]+nums2[0];
        int sum2=nums1[0]+nums2[0];
        int sum3=nums1[0]+nums2[0];
        int i=0;
        for(int j=0;j<m;j++)
        {
            ArrayList<Integer> list=new ArrayList<>();
            list.add(nums1[i]);
            list.add(nums2[j]);
            temp.add(list);
        }

        for(int l=1;l<n;l++)
        {
            for(int j=0;j<m;j++)
            {
                int sum=nums1[l]+nums2[j];
                if(sum<sum1 || sum<sum2 || sum<sum3)
                {
                    ArrayList<Integer> list=new ArrayList<>();
                    list.add(nums1[l]);
                    list.add(nums2[j]);
                    temp.add(0,list);

                }
            }
        }

        for(int l=0;l<k;l++)
        {
            result.add(temp.get(l));
        }

        return result;
    }
}
