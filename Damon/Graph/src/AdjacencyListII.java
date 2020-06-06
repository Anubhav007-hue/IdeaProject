import java.util.LinkedList;
import java.util.List;

public class AdjacencyListII {

    static public class Edge{
        int destinationVertex;
        int weight;

        public Edge(int destinationVertex,int weight)
        {
            this.destinationVertex=destinationVertex;
            this.weight=weight;
        }


        @Override
        public String toString() {
            return "{" +
                    destinationVertex +
                    "," + weight +
                    '}';
        }
    }

    static public class GraphSecond {
        int n;
        List<Edge> adjacencyList[];

        public GraphSecond(int n) {
            this.n = n;
            adjacencyList = new LinkedList[n];
            for (int i = 0; i < n; i++) {
                adjacencyList[i] = new LinkedList<Edge>();
            }
        }

        public void addEdge(int source ,char destination,int weight)
        {
            adjacencyList[source].add(0,new Edge(destination,weight));
        }
        @Override
        public String toString() {
            String result="";
            for(char i=0;i<adjacencyList.length;i++)
            {
                result+=i+"-->"+adjacencyList[i]+"\n";
            }
            return result;
        }
    }
    public static void main(String[] args)
    {
        GraphSecond g=new GraphSecond(5);
        g.addEdge('A','B',0);
        g.addEdge('A','C',0);
        g.addEdge('B','A',0);
        g.addEdge('B','D',0);
        g.addEdge('B','E',0);
        g.addEdge('E','B',0);
        g.addEdge('E','D',0);
        g.addEdge('D','B',0);
        g.addEdge('D','E',0);
        g.addEdge('D','C',0);
        System.out.println(g);
    }


}
