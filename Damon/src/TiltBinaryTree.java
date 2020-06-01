import java.io.OutputStream;

public class TiltBinaryTree {
     static int res=0;

    static class Node {
        int val;
        Node left, right;
    }

    static Node newNode(int data)
    {
        Node temp = new Node();
        temp.val = data;
        temp.left = null;
        temp.right = null;
        return temp;
    }
    public static void main(String[] args ) {
        TiltBinaryTree tbt = new TiltBinaryTree();
        Node root = null;
        root = newNode(4);
        root.left = newNode(2);
        root.right = newNode(9);
        root.left.left = newNode(3);
        root.left.right = newNode(8);
        root.right.right = newNode(7);
        tbt.solve(root);
        System.out.print(res);

    }

    private int  solve(Node root) {
        if(root==null)
        {
            return 0;
        }
        int left=solve(root.left);
        int right=solve(root.right);

        int temp=Math.abs(left-right);
        res+=temp;
        return left+right+root.val;
    }
}
