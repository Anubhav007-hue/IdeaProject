import java.util.ArrayList;
import java.util.List;

public class SerializeBT {

    List<Integer> list=new ArrayList<>();
    StringBuilder sb=new StringBuilder();
    TreeNode root=null;
    TreeNode root1=null;
    int i=0;
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

    public void Serialize(TreeNode root)
    {
        if(root==null)
        {
            sb.append("null"+" ");
            list.add(Integer.MIN_VALUE);
            return ;
        }
          int data=  root.data;
        list.add(data);
        sb.append(root.data+" ");
        Serialize(root.left);
        Serialize(root.right);
    }

    public TreeNode Desearialized(TreeNode root)
    {
        int data=list.get(i);
        if(data==Integer.MIN_VALUE)
        {
         return null;
        }



            TreeNode temp = insertNode(data);
            root = temp;
            i++;
           root.left= Desearialized(root.left);
           i++;
           root.right=Desearialized(root.right);


    return  root;
    }

     public void inorder(TreeNode root)
    {
        if (root!=null)
        {

            System.out.print(root.data+" ");
            inorder(root.left);
            inorder(root.right);
        }
    }
    public static void main(String[] args)
    {
        SerializeBT sbt=new SerializeBT();
        sbt.root=sbt.insertNode(-1);
        sbt.root.left=sbt.insertNode(0);
//        sbt.root.left.left=sbt.insertNode(4);
//        sbt.root.left.right=sbt.insertNode(12);
//        sbt.root.left.right.left=sbt.insertNode(10);
//        sbt.root.left.right.right=sbt.insertNode(14);
         sbt.root.right=sbt.insertNode(1);
//        sbt.root.right.left=sbt.insertNode(4);
//        sbt.root.right.right=sbt.insertNode(5);
        System.out.println("Before Serailizing");
        sbt.inorder(sbt.root);
        System.out.println();
        sbt.Serialize(sbt.root);
        String serialized=new String(sbt.sb);
        System.out.println("Serialized string");

        System.out.print(serialized);
        System.out.println();

      sbt. root1= sbt.Desearialized(sbt.root1);
        System.out.println("After Serializing");
        sbt.inorder(sbt.root1);

    }
}
