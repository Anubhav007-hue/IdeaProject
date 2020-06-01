public class CircularArrayGreater {

    Node head=null;
    public class Node
    {
        int data;
        Node next;
    }
    public void  insert(int data)
    {
        Node newNode=new Node();
        newNode.data=data;

        if(head==null)
        {
            head=newNode;
        }

        else
        {
            Node temp=head;
            while (temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }
    public static void main(String[] args )
    {
        CircularArrayGreater cag=new CircularArrayGreater();
        int [] nums={1,2,1};
        int n=nums.length;
        int[] result=new int[n];
        for(int i=0;i<n;i++)
        {
            cag.insert(nums[i]);
        }
        Node temp=cag.head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=cag.head;
        cag.nextGreaterElements(cag.head,n,result);
        for(int i:result)
        {
            System.out.print(i+" ");
        }
    }

    public   void nextGreaterElements(Node head,int n,int[] result) {
        Node slow=head;
        Node fast=slow.next;
        boolean bool=false ;

        for(int i=0;i<n;i++)
        {
            while(bool!=true)
            {
                if(bool==false && slow==fast)
                {
                    result[i]=-1;
                    bool=true;
                }
                else if(bool==false && fast.data>slow.data)
                {
                    result[i]=fast.data;
                    bool=true;
                }
                fast=fast.next;
            }
            slow=slow.next;
            fast=slow.next;
            bool=false ;
        }

    }
}
