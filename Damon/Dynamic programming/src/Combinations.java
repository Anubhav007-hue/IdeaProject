import java.util.ArrayList;
import java.util.List;

public class Combinations {
   static  List<List<Integer>> permutation=new ArrayList<>();

    public static void main(String[] args )
    {
        int n=4;
        int k=2;

        combine(n,k);
        for(List list:permutation)
        {
            System.out.print(list.get(0) +","+list.get(1)+" ");
        }
    }

    public  static List<List<Integer>> combine(int n, int k) {

        int [] nums=new int [n];
        int l=1;
        for(int i=0;i<n;i++)
        {
            nums[i]=l;
            l++;
        }

        permute(nums,0,nums.length-1, k);
        return permutation;
    }

    public static void permute(int[] current,int low,int high,int k)
    {
        if(low==high)
        {
            ArrayList<Integer> list=new ArrayList<>();
            for(int i=0;i<current.length;i++)
            {
                list.add(current[i]);
            }

            if(list.size()==k)
            {
                permutation.add(list) ;
            }

        }

        else
        {
            for(int i=low;i<=high;i++)
            {
                swap(current,low,i);
                permute(current,low+1,high,k);
                swap(current,low,i);
            }
        }

    }
    public static void swap(int[] current ,int left ,int i )
    {

        int temp=current[left];
        current[left]=current[i];
        current[i]=temp;


    }

}
