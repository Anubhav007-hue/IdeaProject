import java.util.*;

public class DetectCycle {
    int[] result=new int[2];

    public static class graph{
          int n;
        List<Integer> adjacencyList[];
        Set<Integer> visited=new HashSet<>();


        public  graph(int n)
        {
            this.n=n;
            adjacencyList=new LinkedList[n];
            for(int i=0;i<n;i++)
            {
                adjacencyList[i]=new LinkedList<Integer>();
            }
        }

        public void addEdge(int source ,int destination)
        {
            adjacencyList[source].add(destination);
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
    public static void main(String[] args )
    {
        int edges[][]={{3,4},{1,2},{2,4},{3,5},{2,5}};
        graph g=new graph(edges.length);
        int N=edges.length;
        for(int [] i:edges)
        {
            int[] temp=i;
            g.addEdge(temp[0],temp[1]);
        }
//        for(int [] i:edges)
//        {
//            int[] temp = i;
//
//            if (!g.visited.contains(temp[0])) {
//                g.visited.add(temp[0]);
//                System.out.print(temp[0] + "--[");
//
//                for (int j = 0; j < g.adjacencyList[temp[0]].size(); j++) {
//                    System.out.print(+g.adjacencyList[temp[0]].get(j) + "-->");
//                }
//                System.out.print("]");
//                System.out.println();
//            }

//        }

        DetectCycle dc=new DetectCycle();
       System.out.println( dc.isCyclicDisconntected(g.adjacencyList,N));
    }
    public boolean isCyclicDisconntected(List<Integer>[] adjacencyList, int N)
    {

        // Mark all the vertices as not visited
        boolean visited[] = new boolean[N];
        Arrays.fill(visited,false);

        for (int i = 0; i < N; i++)
            if (!visited[i] &&
                    isCyclicConntected(adjacencyList, i, N, visited))
                return true;
        return false;
    }

    public boolean isCyclicConntected(List<Integer> adjacencyList[], int src,
                                      int N, boolean visited[])
    {

        // Set parent vertex for every vertex as -1.
        int parent[] = new int[N];
        Arrays.fill(parent, -1);

        // Create a queue for BFS
        Queue<Integer> q = new LinkedList<>();

        // Mark the current node as
        // visited and enqueue it
        visited[src] = true;
        q.add(src);

        while (!q.isEmpty())
        {

            // Dequeue a vertex from
            // queue and print it
            int u = q.poll();


            // Get all adjacent vertices
            // of the dequeued vertex u.
            // If a adjacent has not been
            // visited, then mark it visited
            // and enqueue it. We also mark parent
            // so that parent is not considered
            // for cycle.
            for (int i=0; i<adjacencyList[u].size();i++)
            {
                int v = adjacencyList[u].get(i);
                if (!visited[v])
                {
                    visited[v] = true;
                    q.add(v);
                    parent[v] = u;
                }
                else if (parent[u] != v)
                    return true;
            }
        }
        return false;
    }
}
