public class maxHeap {
    int MaxHeap [];
    int maxSize;
    int size;

    public maxHeap(int maxSize)
    {
        this.maxSize=maxSize;
        this.size=0;
        MaxHeap=new int[maxSize+1];
        MaxHeap[0]=Integer.MAX_VALUE;

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

    public void insert(int value)
    {
        MaxHeap[++size]=value;
        int current=size;

        while(MaxHeap[current] >MaxHeap[parent(current)])
        {
            int temp=MaxHeap[current];
            MaxHeap[current]=MaxHeap[parent(current)];
            MaxHeap[parent(current)]=temp;
            current=parent(current);
        }
    }

    public void print()
    {
        for (int i = 1; i <= size / 2; i++) {
            System.out.print(" PARENT : " + MaxHeap[i] + " LEFT CHILD : " +
                    MaxHeap[2 * i] + " RIGHT CHILD :" + MaxHeap[2 * i + 1]);
            System.out.println();
        }
    }

    public int getMax()
    {
        int popped=MaxHeap[1];
        MaxHeap[1]=MaxHeap[size--];
        Hepify(1);
        return popped;
    }

    public void Hepify(int pos)
    {
        if(pos>=size/2 && pos<=size)
        {
            return ;
        }

      if(MaxHeap[pos]<MaxHeap[leftChild(pos)]  ||  MaxHeap[pos]<MaxHeap[rightChild(pos)])
      {
          if(MaxHeap[leftChild(pos)]> MaxHeap[rightChild(pos)])
          {
              int temp=MaxHeap[leftChild(pos)];
              MaxHeap[leftChild(pos)]=MaxHeap[pos];
              MaxHeap[pos]=temp;
          }

          else {

              int temp=MaxHeap[rightChild(pos)];
              MaxHeap[rightChild(pos)]=MaxHeap[pos];
              MaxHeap[pos]=temp;

          }
      }
    }

    public static void main(String[] args )
    {
        System.out.println("The Max Heap is ");
        maxHeap maxHeap = new maxHeap(15);
        maxHeap.insert(5);
        maxHeap.insert(3);
        maxHeap.insert(17);
        maxHeap.insert(10);
        maxHeap.insert(84);
        maxHeap.insert(19);
        maxHeap.insert(6);
        maxHeap.insert(22);
        maxHeap.insert(9);

//        maxHeap.print();

        int max=maxHeap.getMax();
//        System.out.print(max);
        max=maxHeap.getMax();
        System.out.print(max);
        maxHeap.insert(97);
        System.out.print(maxHeap.getMax());
        System.out.print(maxHeap.size );




    }
}
