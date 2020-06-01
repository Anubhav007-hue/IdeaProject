import java.util.ArrayList;
import java.util.List;

public class FlattenBinaryTree {

    List<Integer> pre=new ArrayList<>();
    int index=0;


    public class TreeNode
    {
        int data;
        TreeNode left=null , right=null;
    }

    public TreeNode insertNode(int data)
    {
        TreeNode new_node=new TreeNode();
        new_node.data=data;
        new_node.left=null;
        new_node.right=null;
        return new_node;
    }

    public static void main(String[] args )
    {
        TreeNode root=null;
        FlattenBinaryTree fbt=new FlattenBinaryTree();
      root= fbt.insertNode(1);
      root.right=fbt.insertNode(2);
      root.right.right=fbt.insertNode(3);
      root.right.right.right=fbt.insertNode(4);
      root.right.right.right.right=fbt.insertNode(5);

      System.out.println("Before flattening");
      fbt.preorderPrint(root);
      System.out.println("List Values");
      fbt.preorder(root);
      for(int i:fbt.pre)
      {
         System.out.print(i+" ");
      }
      System.out.println();
        System.out.println();
        System.out.println();
        TreeNode root1=null;
        root1=fbt.construct(root1);
        System.out.println("After Flattening");
      fbt.preorderPrint(root1);



    }

    private void preorderPrint(TreeNode root) {

        if(root==null) {
            return;
        }

            int data=root.data;
            System.out.print(data + " ");
            preorderPrint(root.left);
            preorderPrint(root.right);

    }

    public void preorder(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        pre.add(root.data);
        preorder(root.left);
        preorder(root.right);
    }

    public TreeNode construct(TreeNode root)
    {
        if(index>pre.size()-1)
        {
            return null;
        }
        int data =pre.get(index);
        TreeNode temp=insertNode(data);
        root=temp;
        index++;
        root.left=construct(root.left);
        index++;
        root.right=construct(root.right);

        return root;
    }
}
