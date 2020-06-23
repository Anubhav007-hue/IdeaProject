import java.util.HashMap;
import java.util.Scanner;

public class SimilarCharacter {

    public static void main(String [] args )
    {
        SimilarCharacter sc=new SimilarCharacter();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the length of the String");
        int length=scan.nextInt();
        System.out.println("Enter the String ");
        String str=scan.next();
        System.out.println("Enter the Queries");
        int queries=scan.nextInt();

        while(queries>0)
        {
            System.out.println("Enter the index");
            int index=scan.nextInt();
            char asked=str.charAt(index-1);
            HashMap<Character,Integer> map=new HashMap<>();
            for(int i=0;i<index-1;i++)
            {
                char current=str.charAt(i);
                if(current==asked)
                {
                    map.put(current,map.getOrDefault(current,0)+1);
                }
            }
            System.out.println(map.get(asked));
            queries--;
        }
    }
}
