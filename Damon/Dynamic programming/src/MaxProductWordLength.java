import java.util.HashSet;

public class MaxProductWordLength {
    public static void main(String[] args )
    {
        int max=Integer.MIN_VALUE;
        String [] words={"a","ab","abc","d","cd","bcd","abcd"};
        for(int i = 0;i<words.length-1;i++)
        {
            for(int j=1;j<words.length;j++)
            {
                String string_i=words[i];
                String string_j=words[j];
                if(isCorrect(string_i,string_j)!=true)
                {
                    max=Math.max((string_i.length() * string_j.length()),max);

                }
            }

        }
        System.out.println(max);
    }

    public static boolean isCorrect(String string_i, String string_j)
    {
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<string_i.length();i++)
        {
            set.add(string_i.charAt(i));
        }
        for(int i=0;i<string_j.length();i++)
        {
            if(set.contains(string_j.charAt(i)))
            {
                return true;
            }
        }


        return false ;
    }
}
