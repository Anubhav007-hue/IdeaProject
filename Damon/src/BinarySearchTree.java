public class BinarySearchTree {
    class Node
    {
        int data;
        Node left=null;
        Node right=null;
    }


    private Node insert(Node root,int key)
    {
        if(root==null)
        {
           return CreateNewNode(key);
        }

        else if(root.data>key)
        {
            root.left=insert(root.left,key);
        }

        else
        {
            root.right=insert(root.right,key);
        }

        return root;
    }

    private Node CreateNewNode(int key) {
        Node new_node=new Node();
        new_node.data=key;
        return new_node;
    }

    public static void main(String[] args )
    {
        Node root=null;
        BinarySearchTree tree = new BinarySearchTree();


      root=tree.insert(root,15);
      int data1=root.data;
      root=tree.insert(root,10);
      int data2=root.data;
      root=tree.insert(root,20);
      root=tree.insert(root,8);
      root=tree.insert(root,12);
      root=tree.insert(root,16);
      root=tree.insert(root,25);
       tree.inorder(root);
    }
    public static void inorder(Node root)
    {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    }
