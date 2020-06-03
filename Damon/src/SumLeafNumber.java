import java.util.ArrayList;
import java.util.List;

public class SumLeafNumber {
     static List<String> paths=new ArrayList<>();
      static int sum=0;
    static class Node {
        int val;
        Node left, right;
    }

    static Node newNode(int data) {
        Node temp = new Node();
        temp.val = data;
        temp.left = null;
        temp.right = null;
        return temp;
    }

    public static void main(String[] args) {
        SumLeafNumber tbt = new SumLeafNumber();
        Node root = null;
        root = newNode(4);
        root.left = newNode(9);
        root.right = newNode(0);
        root.left.left = newNode(5);
        root.left.right = newNode(1);
        sum=sumNumbers(root);
        System.out.println(paths);
        System.out.print(sum);
    }

    public static int sumNumbers(Node root) {
        if(root==null)
        {
            return sum;
        }

        dfs(root,"",paths);
        for(String s:paths)
        {
            String temp=s;
            int tempNum=Integer.parseInt(temp);
            sum=sum+tempNum;
        }
        return sum;
    }

    private static void dfs(Node root, String str, List<String> paths) {

        if(root==null)
        {
            return ;
        }

        str=str+root.val;

        if(root.left==null && root.right==null)
        {
            paths.add(str);
            return ;
        }
        dfs(root.left,str,paths);
        dfs(root.right,str,paths);
    }
}
