import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Graph {
    class Edge{
        int vertex;
        int weight;

        public Edge(int vertex,int weight)
        {
            this.vertex=vertex;
            this.weight=weight;
        }

        @Override
        public String toString() {
            return "{" +
                    vertex +
                    "," + weight +
                    '}';
        }
    }
    List<Edge> Graph[];
    public Graph(int n)
    {
        Graph=new LinkedList[n];
        for(int i=0;i<n;i++)
        {
            Graph[i]=new LinkedList<Edge>();
        }
    }
    void addEdge(int Vertex,int vertex,int weight )


    {
        Graph[Vertex].add(0, new Edge(vertex,weight));
    }
    @Override
    public String toString() {
        String result="";
        for(int i=0;i<Graph.length;i++)
        {
            result+=i+"-->"+Graph[i]+"\n";
        }
        return result;
    }
}
