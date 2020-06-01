import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WordPattern {
    public static void main(String[] args)
    {   String str="dog cat cat dog";
        String pattern="abba";
        int i=0;
        int j=0;
        List<String> list=new ArrayList<>();

        while(j<str.length())
        {
            if(str.charAt(j)==' ')
            {
                StringBuilder sb=new StringBuilder();
                for(int k=i;k<j;k++)
                {
                    sb.append(str.charAt(k));
                }
                String current=new String(sb);
                list.add(current);
                i=j+1;
                j++;
            }

            else {
                j++;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int k=i;k<j;k++) {
            sb.append(str.charAt(k));
            i++;
        }
        String current=new String(sb );
        list.add(current);

        HashMap<Character,String> map=new HashMap<>();

        for(i=0;i<pattern.length();i++) {
            if (map.containsKey(pattern.charAt(i))) {
                String current1=map.get(pattern.charAt(i));
                String current2=list.get(i);
                if (!current1.equals(current2)) {
                    System.out.println("false");
                    break;
                }
            }
            else
                {
                map.put(pattern.charAt(i), list.get(i));
            }


        }








    }
}
