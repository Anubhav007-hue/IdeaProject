import java.util.HashSet;
import java.util.LinkedList;

public class DFS_List {

     static public class GraphImplement
     {
         int n;
         LinkedList<Integer> adjecencyList[];
         HashSet<Integer> visited=new HashSet<>();;

         public GraphImplement(int n)
         {
             this.n=n;
             adjecencyList=new LinkedList[n];
             for(int i=0;i<n;i++)
             {
                 adjecencyList[i]=new LinkedList<Integer>();
             }
         }

         public void addEdge(int source,int destination)
         {
             adjecencyList[source].add(destination);
         }


         public void dfs(int start)
         {
             visited.add(start);
             System.out.print(start+" ");
             for(int i=0;i<adjecencyList[start].size();i++)
             {
                 int current=adjecencyList[start].get(i);
                    if(!visited.contains(current))
                    {
                        dfs(current);
                    }
             }

         }

     }
    public static void main(String[] args)
    {
        GraphImplement gi=new GraphImplement(5);
        gi.addEdge(0,1);
        gi.addEdge(0,4);
        gi.addEdge(1,0);
        gi.addEdge(1,4);
        gi.addEdge(1,3);
        gi.addEdge(1,2);
        gi.addEdge(2,1);
        gi.addEdge(2,3);
        gi.addEdge(3,2);
        gi.addEdge(3,1);
        gi.addEdge(3,4);
        gi.addEdge(4,1);
        gi.addEdge(4,3);
        HashSet<Integer> visited=new HashSet<>();
        gi.dfs(0);
    }
}
