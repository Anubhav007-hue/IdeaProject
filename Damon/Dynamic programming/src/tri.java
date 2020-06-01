import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class tri {

    public static void main(String[] args)
    {
        String s="abbc";
      HashSet<Character> set=new HashSet<>();
      for(int i=0;i<s.length();i++)
      {
          set.add(s.charAt(i));
      }
       System.out.println(set.size());}

}
