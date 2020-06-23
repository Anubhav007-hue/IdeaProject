import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Lexicograpgical {

    public static void main(String[] args )
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of testCase");
        int T=scan.nextInt();


        while(T>0)
        {

            String P=scan.next();
            String S=scan.next();
            HashMap<Character,Integer> map=new HashMap<>();
            StringBuilder sb=new StringBuilder();
            for(char c:S.toCharArray())
            {
                map.put(c,map.getOrDefault(c,0)+1);
            }

            for(char current:P.toCharArray())
            {
                if(map.containsKey(current))
                {
                    sb.append(current);
                    map.remove(current,map.get(current)-1);
                    if(map.get(current)==0)
                    {
                    map.remove(current);
                    }
                }
            }

            System.out.println(sb.toString());
            T--;

        }
    }
}
