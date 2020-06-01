import java.util.*;

public class GraphImplementation {
    public static void main(String[] args)
    {
        Graph g=new Graph(5);
        g.addEdge(0,1,0);
        g.addEdge(0,4,0);
        g.addEdge(1,0,0);
        g.addEdge(1,4,0);
        g.addEdge(1,3,0);
        g.addEdge(1,2,0);
        g.addEdge(2,1,0);
        g.addEdge(2,3,0);
        g.addEdge(3,2,0);
        g.addEdge(3,1,0);
        g.addEdge(3,4,0);
        g.addEdge(4,1,0);
        g.addEdge(4,3,0);

        System.out.println(g);
    }
}
