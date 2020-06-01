import java.util.Arrays;
import java.util.HashSet;

public class dijkstra_Algorithm {

    static int n;
    //     Declarying the matrix..
    static int[][] matrix;
   static HashSet<Integer> visited=new HashSet<>();
    public dijkstra_Algorithm(int n)
    {
        this.n=n;
        matrix=new int[n][n];
    }
    //      Method to connect the graph.
    public void addEdge(int source,int destination,int weight)
    {
        matrix[source][destination]=weight;
        matrix[destination][source]=weight;
    }
    //      Method to print the graph .
    public void printGraph()
    {
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public  static int dijkstra(int[][] matrix,int source,int destination)
    {
        int[] distance=new int[n];
        Arrays.fill(distance,Integer.MAX_VALUE);
        distance[source]=0;

        for(int i=0;i<n-1;i++)
        {
            int minDistanceVertex=findMinVertex(distance);
            visited.add(minDistanceVertex);
            for(int j=0;j<n;j++)
            {
                if(!visited.contains(j) && matrix[minDistanceVertex][j]!=0 && distance[minDistanceVertex]!=Integer.MAX_VALUE )
                {
                    int newDistance=matrix[minDistanceVertex][j]+distance[minDistanceVertex];
                    if(newDistance<distance[j])
                    {
                        distance[j]=newDistance;
                    }
                }
            }
        }
        return distance[destination];
    }

    private static int findMinVertex(int[] distance) {

        int minIndex=-1;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(distance[i]<min && !visited.contains(i))
            {
                min=distance[i];
                minIndex=i;
            }
        }

        return minIndex;
    }

    //      Main function.....
    public static void main(String[] args)
    {
//         Calling the constructor.
        dijkstra_Algorithm am=new dijkstra_Algorithm(5);
        am.addEdge(0,1,5);
        am.addEdge(0,4,6);
        am.addEdge(1,4,10);
        am.addEdge(1,3,1);
        am.addEdge(1,2,4);
        am.addEdge(2,3,2);
        am.addEdge(3,4,7);
//        am.printGraph();
        int distance=am.dijkstra(matrix,2,4);
        System.out.print(distance);
    }
}
