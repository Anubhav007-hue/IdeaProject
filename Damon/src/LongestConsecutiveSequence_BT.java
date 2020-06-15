import java.util.ArrayList;
import java.util.List;

public class LongestConsecutiveSequence_BT {

    Node root=null;
    public class Node
    {
        int data;
        Node left=null;
        Node right=null;
    }

    public Node insert(int data)
    {
        Node newNode=new Node();
        newNode.data=data;

        return newNode;
    }
    public static void main(String[] args )
    {
        LongestConsecutiveSequence_BT lcs=new LongestConsecutiveSequence_BT();
        lcs.root=lcs.insert(1);
        lcs.root.left=lcs.insert(2);
        lcs.root.left.left=lcs.insert(3);
        lcs.root.right=lcs.insert(4);
        lcs.root.right.left=lcs.insert(5);
        lcs.root.right.right=lcs.insert(6);
        lcs.root.right.right.left=lcs.insert(7);

        List<List<Integer>> paths=new ArrayList<>();

        lcs.generatePaths(lcs.root,new ArrayList<Integer>(),paths);
        int maxLength=Integer.MIN_VALUE;



//        List<String> result=new ArrayList<>();
//        for(List list:paths)
//        {
//            int index=0;
//            List<Integer> temp=list;
//
//            while(index<list.size()-1)
//            {
//
//                int first=  temp.get(index);
//                int second= temp.get(index+1);
//                int count=0;
//                if( (temp.get(index+1))-(temp.get(index))==1)
//                {
//                    String s="";
//                    while(index<temp.size()-1 &&  (temp.get(index+1))-(temp.get(index))==1)
//                    {
//                        s=s+temp.get(index)+"->";
//                        count++;
//                        index++;
//                    }
//                    s=s+temp.get(index);
//                    result.add(s);
//                }
//
//                maxLength=Math.max(maxLength,count);
//                index++;
//            }
//        }
//        maxLength+=1;
//        System.out.print("The longest consecutive length is:"+maxLength);
//        System.out.println();
//        System.out.print(result+" ");
    }

    private void generatePaths(Node root, List<Integer> current, List<List<Integer>> paths)
    {
        if(root==null)
        {
            return ;
        }

        current.add(root.data);

        if(root.left==null && root.right==null)
        {
            paths.add(current);

            return ;
        }

        generatePaths(root.left,new ArrayList<>(current),paths);
        generatePaths(root.right,current,paths);
    }
}
