import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class IdenticalTree {



    class TreeNode {
        int val;
        TreeNode left=null;
        TreeNode right=null;
    }

    public TreeNode insert(int val)
    {
        TreeNode new_node=new TreeNode();
        new_node.val=val;
        return new_node;
    }

    public static void main(String[] args )
    {
        boolean bool=false;

        IdenticalTree it=new IdenticalTree();

        IdenticalTree call=new IdenticalTree();
        TreeNode root1 =  it.insert(1);
        root1.left=it.insert(2);
        root1.right=it.insert(3);
        root1.left.left=it.insert(4);
        root1.left.left.right=it.insert(5);
        int hei=height(root1);



    }

    private static int height(TreeNode root) {

        if(root==null)
        {
            return 0;
        }

        int left=height(root.left);
        int right=height(root.right);

        if(left>right)
        {
             return left+1;
        }

        else
        {
            return right +1;
        }


    }


}




