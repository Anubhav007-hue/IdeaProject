import java.util.*;
import java.util.function.DoubleToIntFunction;

public class SSSP_BFS {
   static  int n ;
   static List<Integer> Graph[];
   HashSet<Integer> visited=new HashSet<>();
        public SSSP_BFS(int n)
        {
            this.n=n;
            Graph=new LinkedList[n];
            for(int i=0;i<n;i++)
            {
                Graph[i]=new LinkedList<>();
            }
        }

        public void addEdge(int source,int destination)
        {
            Graph[source].add(destination);
        }

        public void printGraph()
        {
            for(int i=0;i<n;i++)
            {
                System.out.print("{"+i+"}");
                System.out.print("[");
                for(int j=0;j<Graph[i].size();j++)
                {
                    System.out.print("-->");
                    System.out.print(Graph[i].get(j));
                }
                System.out.print("]");
                System.out.println();
            }
        }


        public int distance(int startVertex,int destination)
        {
            Queue<Integer> queue=new LinkedList<>();
            int [] distance=new int[n];
            Arrays.fill(distance,-1);
            visited.add(startVertex);
            queue.add(startVertex);
            distance[startVertex]=0;

            while(!queue.isEmpty())
            {
                startVertex=queue.remove();
                for(int i=0;i<Graph[startVertex].size();i++)
                {
                    int current=Graph[startVertex].get(i);
                    if(!visited.contains(current))
                    {
                        visited.add(current);
                        distance[current]=distance[startVertex]+1;
                        queue.add(current);
                    }
                }
            }

            return distance[destination];

        }
        public static void main(String[] args)
        {
            SSSP_BFS gi=new SSSP_BFS(4);
            gi.addEdge(0,1);
            gi.addEdge(0,2);
            gi.addEdge(1,2);
            gi.addEdge(2,0);
            gi.addEdge(2,3);
            gi.addEdge(3,3);
//            gi.printGraph();
       int distance= gi.distance(3,0);
        System.out.print("The shortest distance the source vertex to the given vertex is :"+distance);

        }
}
