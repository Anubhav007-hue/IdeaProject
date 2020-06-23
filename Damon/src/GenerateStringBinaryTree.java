public class GenerateStringBinaryTree {


    public class TreeNode {
        int data;
        TreeNode left = null, right = null;
    }

    public TreeNode insertNode(int data) {
        TreeNode new_node = new TreeNode();
        new_node.data = data;
        new_node.left = null;
        new_node.right = null;
        return new_node;
    }

    public static void main(String[] args) {
        TreeNode root = null;
        GenerateStringBinaryTree fbt = new GenerateStringBinaryTree();
        root = fbt.insertNode(1);
        root.right = fbt.insertNode(3);
        root.left = fbt.insertNode(2);
        root.left.left = fbt.insertNode(4);

        System.out.print(tree2str(root));


    }  public  static String tree2str(TreeNode root) {

        String str="";

        if(root==null)
        {
            return null;
        }

StringBuilder sb=new StringBuilder();
        inorder(root,sb);

        return sb.toString();

    }

    public static void inorder(TreeNode root,StringBuilder str)
    {
        if(root==null)
        {

            return ;
        }

      str.append(root.data);
      if (root.left == null && root.right == null)  return;  /* stop recursion if no child */
        str.append("(");
        inorder(root.left, str);  /* left recursion if has child */
        str.append(")");
        if (root.right != null) {
            str.append("(");
            inorder(root.right, str);   /* right recursion only when right child exists */
            str.append(")");
        }


    }
}
