public class QuickSort {
    public static void main(String[] args )
    {
        int arr[]={2,6,3,5,7,9,5};
        int left=0;
        int right=arr.length-1;
        sort(arr,left,right);
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }

    public static void sort(int[] arr,int left,int right)
    {
        if(left<right) {
            int pi = partition(arr, left, right);
            sort(arr, left, pi - 1);
            sort(arr, pi + 1, right);
        }
    }
    public static int partition(int [] arr,int left,int right)
    {
        int pivot=arr[right];
        int i=left-1;

        for(int j=left;j<right;j++)
        {
            if(arr[j]<=pivot)
            {
                i++;

                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    i++;
        int temp=arr[i];
        arr[i]=arr[right];
        arr[right]=temp;

        return i;
    }
}
