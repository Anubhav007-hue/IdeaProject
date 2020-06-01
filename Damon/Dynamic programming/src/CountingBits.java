import java.util.HashMap;

public class CountingBits {
    public static void main(String[] args )
    {
        int num=2;
        int[] arr=new int[num+1];
        int index=0;

        for(int i=0;i<=num;i++)
        {
            String current=Integer.toBinaryString(i);
            HashMap<Character,Integer> map=new HashMap<>();
            char[] character=current.toCharArray();
            for(char j:character)
            {
                if(map.containsKey(j))
                {
                    map.replace(j,map.get(j)+1);
                }
                else
                {
                    map.put(j,1);
                }
            }
            if(map.containsKey('1'))
            {
                arr[index++]=map.get('1');
            }
            else
            {
                arr[index++]=0;
            }
        }

        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
}
