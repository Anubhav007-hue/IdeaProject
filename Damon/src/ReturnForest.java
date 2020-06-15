public class ReturnForest {

        Node root=null;
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

    public static void main(String [] args )
    {
        ReturnForest rf=new ReturnForest();


    }
}
