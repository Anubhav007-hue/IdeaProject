import java.util.HashSet;

public class MaximumNumberVowels {
     static int result=0;
    public static void main(String[] args )
    {
        HashSet<Character> set=new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        HashSet<Character> visited=new HashSet<>();

        String str="weallloveyou";
        int k=7;
        int left=0;
        int right=k-1;
        int temp=0;
        int result=0;

        while(left<str.length() && right<str.length())
        {
            char c=str.charAt(left);

            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
            {
                temp++;



            }
            visited.add(c);
            left++;


            while(left<=right && !set.contains(str.charAt(left)))
            {
                left++;
                right++;
                temp=0;
            }


            result=Math.max(result,temp);
            if(left>right)
            {
                right=right+k;
                temp=0;
            }

        }
        temp=0;
        if(!visited.contains(str.charAt(str.length()-k+1)))
        {
            for(int i=left;i<str.length();i++)
            {
                char c=str.charAt(i);
                if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
                {
                    temp++;


                }

            }
        }

        result=Math.max(result,temp);
System.out.print(result);


    }





//    ------------------------------------------------------------------------------------------------------------------
//    BRUTE-------FORCE



//    public  static void maxVowels(String s, int k) {
//
//        int left=0;
//        int right=k-1;
//
//        while(right<s.length())
//        {
//            String str=s.substring(left,right+1);
//            checkVowels(str);
//            left++;
//            right++;
//        }
//
//
//    }
//
//    public  static void checkVowels(String str)
//    {
//        int i =0;
//        int temp=0;
//
//        while(i<str.length())
//        {
//            char c=str.charAt(i);
//            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
//            {
//                temp++;
//            }
//            i++;
//        }
//
//        result=Math.max(result,temp);
//    }
}

