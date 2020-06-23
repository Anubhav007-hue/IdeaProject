public class MInHeap {

    int  minHeap[];
    int maxSize;
    int size;

    public MInHeap(int maxSize )
    {
        this.maxSize=maxSize;
        this.size=0;
        minHeap =new int[maxSize+1];
        minHeap[0]=Integer.MIN_VALUE;
    }

    public int parent(int pos)
    {
        return pos/2;
    }

    public int leftChild(int pos)

    {
        return 2*pos;
    }

    public int rightChild(int pos)
    {
        return 2*pos+1;
    }

    public void print()
    {
        for (int i = 1; i <= size ; i++) {
            System.out.print(" PARENT : " + minHeap[i]);
            System.out.println();
        }
    }


    public void insert(int value)
    {
        minHeap[++size]=value;
        int current=size;

        while(minHeap[current]<minHeap[parent(current)])
        {
            int temp=minHeap[current];
            minHeap[current]=minHeap[parent(current)];
            minHeap[parent(current)]=temp;
            current=parent(current);
        }
    }

    public static void main(String[] args )
    {
        System.out.println("The Max Heap is ");
        MInHeap minHeap = new MInHeap(15);
        minHeap.insert(5);
        minHeap.insert(3);
        minHeap.insert(17);
        minHeap.insert(10);
        minHeap.insert(84);
        minHeap.insert(19);
        minHeap.insert(6);
        minHeap.insert(22);
        minHeap.insert(9);

           minHeap.print();
    }
}
