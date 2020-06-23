public class ArrayRotation_ReversalAlgo {

    public static void main(String[] args )
    {   ArrayRotation_ReversalAlgo ar=new ArrayRotation_ReversalAlgo();
        int []nums={4,3,2,6};
        int k=2;
        ar.rotate(nums,k);
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i]+" ");
        }
    }

    public void rotate(int [] nums,int k)
    {
        int n=nums.length;
        int [] temp=new int[n];
        int l=0;
        for(int i=k;i<n;i++)
        {
            temp[l++]=nums[i];
        }

        for(int i=0;i<k;i++)
        {
            temp[l++]=nums[i];
        }

        for(int i=0;i<n;i++)
        {
            nums[i]=temp[i];
        }


    }
}

