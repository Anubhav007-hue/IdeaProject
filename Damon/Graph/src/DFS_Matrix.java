import java.util.HashSet;

public class DFS_Matrix {


    static int n;
    //     Declarying the matrix..
    static int[][] matrix;
    HashSet<Integer> visited=new HashSet<>();

    public DFS_Matrix(int n) {
        this.n = n;
        matrix = new int[n][n];
    }

    //      Method to connect the graph.
    public void addEdge(int source, int destination, int weight) {
        matrix[source][destination] = weight;
        matrix[destination][source] = weight;
    }

    //      Method to print the graph .
    public void printGraph() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void dfs(int start)
    {
        visited.add(start);
        System.out.print(start+" ");
        for(int i=0;i<n;i++)
        {
            int current=matrix[start][i];
            if(!visited.contains(i) &&  current==1)
            {
                dfs(i);
            }
        }

    }

    //      Main function.....
    public static void main(String[] args) {
//         Calling the constructor.
        DFS_Matrix am=new DFS_Matrix(5);
        am.addEdge(0, 1, 1);
        am.addEdge(0, 4, 1);
        am.addEdge(1, 0, 1);
        am.addEdge(1, 4, 1);
        am.addEdge(1, 3, 1);
        am.addEdge(1, 2, 1);
        am.addEdge(2, 1, 1);
        am.addEdge(2, 3, 1);
        am.addEdge(3, 2, 1);
        am.addEdge(3, 1, 1);
        am.addEdge(3, 4, 1);
        am.addEdge(4, 1, 1);
        am.addEdge(4, 3, 1);
        am.dfs(0);


    }
}

