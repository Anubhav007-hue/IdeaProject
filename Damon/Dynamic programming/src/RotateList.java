import java.util.ArrayList;
import java.util.List;

public class RotateList {

    ListNode head=null;

    class ListNode
    {
        int val;
        ListNode next=null;


    }

    public void insert(int val)
    {

        ListNode newNode=new ListNode();
        newNode.val=val;

        if(head==null)
        {
            head=newNode;
        }

        else {
            ListNode temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }

            temp.next=newNode;
        }
    }

    public static void main(String[] args )
    {
//        RotateList rl=new RotateList();
//        rl.insert(1);
//        rl.insert(2);
//        rl.insert(3);
//        rl.insert(4);
//        rl.insert(5);
//        rl.rotateRight(rl.head,3);

        int arr[]={1,2,3,4,5};
        int k=1;
        int n=arr.length;
        int mod = k % n-1;

        // Prints the rotated array from
        // start position
        for(int i = 0; i<n; i++)
            System.out.print(arr[(i + mod) % n]
                    + " ");

        System.out.println();

    }

    public ListNode rotateRight(ListNode head, int k) {
        List<Integer> list=new ArrayList<>();
        ListNode temp1=head;

        while(temp1.next!=null)
        {
            list.add(temp1.val);
            temp1=temp1.next;
        }
        int [] temp=new int[list.size()];

        for(int i=0;i<temp.length;i++)
        {
            temp[i]=list.get(i);
        }

        for(int i = 0; i < k; i++){
            int j, last;

            last = temp[temp.length-1];

            for(j = temp.length-1; j > 0; j--){

                temp[j] =temp[j-1];
            }

            temp[0]= last;
        }


        temp1=head;
        int l=0;
        while(temp1!=null)
        {
            temp1.val=temp[l++];
            temp1=temp1.next;
        }

        return head;

    }
}
