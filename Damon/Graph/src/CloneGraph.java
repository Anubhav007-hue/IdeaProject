import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CloneGraph {

    static  int n;
    static List<Integer> Graph[];
    HashSet<Integer> visited=new HashSet<>();

    public CloneGraph(int n)
    {
        this.n=n;
        Graph=new LinkedList[n];
        for(int i=0;i<n;i++)
        {
            Graph[i]=new LinkedList<Integer>();
        }
    }

    public void addEdge(int source,int destination)
    {
        Graph[source].add(destination);
    }

    public void clone(int start)
    {
        Queue<Integer> queue=new LinkedList<>();
        visited.add(start);
        queue.add(start);

        while(!queue.isEmpty())
        {

            start=queue.poll();
            System.out.print(start+" ");
            for(int i=0;i<Graph[start].size();i++)
            {
                int current=Graph[start].get(i);
                if(!visited.contains(current))
                {
                    visited.add(current);
                    queue.add(current);
                }
            }

        }

    }


    public static void main(String[] args)
    {
        BFS_AdjacencyList.GraphImplementation gi=new BFS_AdjacencyList.GraphImplementation(4);
        gi.addEdge(0,2);
        gi.addEdge(0,1);
        gi.addEdge(1,2);
        gi.addEdge(2,0);
        gi.addEdge(2,3);
        gi.addEdge(3,3);
}
}