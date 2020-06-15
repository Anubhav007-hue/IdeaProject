public class InsertionSort {

    public static void main(String[] args)
    {
        int nums[]={4,42,2,4,1,2,45,2};
        int sentinalValue=0;
        int i=1;
        while(i<nums.length)
        {
            int j=i-1;
            int temp=nums[i];
            while(j>=sentinalValue && temp<nums[j])
            {
                nums[j+1]=nums[j];
                j=j-1;
            }
            nums[j+1]=temp;
            i++;
        }

        for(int current:nums)
        {
            System.out.print(current+" ");
        }
    }
}
