import java.util.PriorityQueue;

public class KthSmallestInSortedArray {

    public static void main(String[] args )
    {
        int [][] matrix={
                { 1,  5,  9},
        {10, 11, 13},
        {12, 13, 15}
};

        System.out.println(kthSmallest(matrix,8));

    }

    public static int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> queue=new PriorityQueue<>();
        int n=matrix.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                int temp=matrix[i][j];
                queue.add(-matrix[i][j]);
                if(queue.size()>k)
                {
                    int remove=queue.remove();

                }
            }
        }

         return -queue.remove();

    }
}
