import java.util.*;

public class allAnagrams {

    public static void main(String[] args)
    {
        List<Integer> index=new ArrayList<>();
        String s="abab";
        String p="ab";
        HashMap<Character,Integer> map_p=new HashMap<>();
        for(char c:p.toCharArray())
        {
            if(map_p.containsKey(c))
            {
                map_p.replace(c,map_p.get(c)+1);
            }
            else
            {
                map_p.put(c,1);
            }
        }
        int l=0;
        int r=p.length()-1;
        HashMap<Character,Integer> map_s=new HashMap<>();
        while (r<s.length())
        {
           for(int i=l;i<=r;i++)
           {
               if(map_s.containsKey(s.charAt(i)))
               {
                   map_s.replace(s.charAt(i),s.charAt(i)+1);
               }

               else
               {
                   map_s.put(s.charAt(i),1);
               }
           }


           
               int j=0;
               boolean flag=false;
               while(j<p.length())
               {
                   if (map_p.get(p.charAt(j)) == map_s.get(p.charAt(j))) {
                       flag = true;
                       j++;
                   }
                   else
                   {
                       flag=false;
                       break;
                   }
               }

               if(flag==true)
               {
                   index.add(l);
                   l++;
                   r++;
               }
           }
        }




    }
