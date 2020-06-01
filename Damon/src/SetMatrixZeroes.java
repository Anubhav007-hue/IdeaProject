import java.util.ArrayList;
import java.util.List;

public class SetMatrixZeroes {
     static int[][] matrix={{0,1,2,0},{3,4,5,2},{1,3,1,5}};
     static List<int[]> index=new ArrayList<>();
    public static void main(String[] args)
    {
        int n=matrix.length;
        int m=matrix[0].length;
        modifyMatrix(n,m);

       for(int i=0;i<n;i++)
       {
           for(int j=0;j<m;j++)
           {
               System.out.print(matrix[i][j]+" ");
           }
           System.out.println();
       }
    }

    private static void modifyMatrix(int n, int m) {

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                int[] temp=new int[2];
                if(matrix[i][j]==0)
                {
                    temp[0]=i;
                    temp[1]=j;
                    index.add(temp);
                }
            }
        }

        int l=0;
        while (l<index.size())
        {
            int current[]=index.get(l);

            for(int k=0;k<m;k++)
            {
                matrix[current[0]][k]=0;
            }

            for(int k=0;k<n;k++)
            {
                matrix[k][current[1]]=0;
            }
            l++;
        }
    }
}
