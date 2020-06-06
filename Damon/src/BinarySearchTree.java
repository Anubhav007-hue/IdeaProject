//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//public class BinarySearchTree {
//    private static List<T> trim;
//
//    class Node
//    {
//        int data;
//        Node left=null;
//        Node right=null;
//
//
//        public Node(Integer integer) {
//            this.data=integer;
//        }
//    }
//
//
//    private Node insert(Node root,int key)
//    {
//        if(root==null)
//        {
//           return CreateNewNode(key);
//        }
//
//        else if(root.data>key)
//        {
//            root.left=insert(root.left,key);
//        }
//
//        else
//        {
//            root.right=insert(root.right,key);
//        }
//
//        return root;
//    }
//
//    private Node CreateNewNode(int key) {
//        Node new_node=new Node();
//        new_node.data=key;
//        return new_node;
//    }
//      List<Integer> trim=new ArrayList<>();
//    public static void main(String[] args )
//    {
//        Node root=null;
//        BinarySearchTree tree = new BinarySearchTree();
//
//
//      root=tree.insert(root,3);
//      root=tree.insert(root,0);
//      root=tree.insert(root,4);
//      root=tree.insert(root,2);
//      root=tree.insert(root,1);
//      Node root1=trimBST(root,1,3);
//      System.out.println("The Trimmed tree is");
//      inorder1(root1);
//    }
//    public static void inorder1(Node root)
//    {
//        if (root == null) {
//            return;
//        }
//
//        inorder1(root.left);
//        System.out.print(root.data + " ");
//        inorder1(root.right);
//    }
//    public static Node trimBST(Node root, int L, int R) {
//        if(root==null)
//        {
//            return null;
//        }
//
//
//        inorder(root,L,R);
//        Collections.sort(trim);
//        return constructTree(0,trim.size()-1);
//    }
//    public static void inorder(Node root, int L, int R)
//    {
//        if(root==null)
//        {
//            return ;
//        }
//        inorder(root.left,L,R);
//        if(root.data>=L && root.data<=R)
//        {
//            trim.add(root.data);
//        }
//        inorder(root.right,L,R);
//    }
//    public static Node constructTree(int left, int right)
//    {
//        if(left>right)
//        {
//            return null;
//        }
//        int mid=left+(right-left)/2;
//        Node root=new Node(trim.get(mid));
//        root.left=constructTree(left,mid-1);
//        root.right=constructTree(mid+1,right);
//        return root;
//    }
//    }
