import java.util.HashSet;

public class ReverseVowels {
    public static void main(String[] args )
    {
        String s="hello";

        int i=0;
        int j=s.length()-1;
        char[] arr=s.toCharArray();
        HashSet<Character> set=new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');

        while (i<j)
        {
            if(checkVowels(arr[i],set)==true && checkVowels(arr[j],set)==true)
            {
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }

            else if (checkVowels(arr[i],set)!=true && checkVowels(arr[j],set)==true)
            {
                i++;
            }

            else if (checkVowels(arr[i],set)==true && checkVowels(arr[j],set)!=true)
            {
                j--;
            }
            else if(checkVowels(arr[i],set)!=true && checkVowels(arr[j],set)!=true)
            {
                i++;
                j--;
            }
        }


        String newString=new String(arr);

        System.out.println(newString);
    }

    public static boolean checkVowels(Character k, HashSet<Character> set)
    {
        if(set.contains(k))
        {
            return true;
        }
        return false;
    }
}
