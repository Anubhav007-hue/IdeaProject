public class ZeroOneMatrix {

    public static void main(String [] args )
    {
        int [][] matrix={{0,0,0},
        {0,1,0},
        {1,1,1}};

        int [][] res=new int[matrix.length][matrix[0].length];

        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                if(matrix[i][j]==1)
                {
                    res[i][j]=dfs(matrix,i,j,0);
                }
            }
        }

        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }


    }

    public static int dfs(int[][] matrix,int i,int j,int distance)
    {
        if(i<0 || i>=matrix.length || j<0 || j>=matrix[0].length || matrix[i][j]==0)
        {
            return 0;
        }

        int left=1+dfs(matrix,i,j-1,distance);
        int right=1+dfs(matrix,i,j+1,distance);
        int up=1+dfs(matrix,i-1,j,distance);
        int down=1+dfs(matrix,i+1,j,distance);


        distance=Math.max(left,Math.max(right,Math.max(up,down)));

        return distance;
    }
}
