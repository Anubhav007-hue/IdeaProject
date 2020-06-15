public class MergeSort {

    public static void main(String[] args )
    {
        int [] nums={38,27,43,3,9,82,10};
        split(nums,0,nums.length-1);
        for(int current:nums)
        {
            System.out.print(current+" ");
        }
    }

    public static void split(int [] nums,int left,int right)
    {
        if(left<right)
        {
            int mid=left+(right-left)/2;
            split(nums,left,mid);
            split(nums,mid+1,right);
            merge(nums,left,mid,right);
        }
    }

    public static void merge(int[] nums,int left,int mid,int right)
    {
        int n=mid-left+1;
        int m=right-mid;

        int[] temp1=new int[n];
        int[] temp2=new int[m];

        for(int i=0;i<n;i++)
        {
            temp1[i]=nums[left+i];
        }

        for(int i=0;i<m;i++)
        {
            temp2[i]=nums[mid+1+i];
        }

        int i=0;
        int j=0;
        int k=left;

        while(i<n && j<m)
        {
            if(temp1[i]<=temp2[j])
            {
                nums[k++]=temp1[i++];
            }

            else
            {
                nums[k++]=temp2[j++];
            }
        }

        while(i<n)
        {
            nums[k++]=temp1[i++];
        }

        while(j<m)
        {
            nums[k++]=temp2[j++];
        }
    }
}
