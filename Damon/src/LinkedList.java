import java.util.ArrayList;

public class LinkedList {
    Node head = null;

    class Node {
        int data;
        Node next = null;

    }

    private void insert(int data) {
        Node new_node = new Node();
        new_node.data = data;

        if (head == null) {
            head = new_node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new_node;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insert(-129);
        ll.insert(-129);
        System.out.println();
    }

    public void isPalindrome(Node head) {
        ArrayList<Integer> list = new ArrayList<>();
        boolean bool = false;
        Node temp = head;
        while (temp != null) {
            list.add(temp.data);
            temp = temp.next;
        }

        int start = 0;
        int last = list.size() - 1;

        while (start < last) {
            if (list.get(start) != list.get(last)) {

            }
            start++;
            last--;
        }


    }
}
