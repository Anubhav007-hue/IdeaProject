import java.util.HashSet;

public class RemoveDuplicateLetters {
    public static void main(String[] args)
    {
        String s="cbacdcbc";


        HashSet<Character> set=new HashSet<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(!set.contains(s.charAt(i)))
            {
                set.add(s.charAt(i));
                sb.append(s.charAt(i));
            }
        }

        String str=new String(sb);
        System.out.println(str);

    }
}
