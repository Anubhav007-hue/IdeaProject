//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class subStringConcatenation {
//    public static void main(String[] args )
//    {
//        String S="barfoothefoobarman";
//        String [] words={"foo","bar"};
//        System.out.print(findSubstring(S,words));
//    }
//
//    public static List<Integer> findSubstring(String s, String[] words) {
//
//
//        List<Integer> list=new ArrayList<>();
//        int left=0;
//        int right=coun
//
//        while(right<s.length())
//        {
//            Map<Character,Integer> temp=new HashMap<>();
//            for(int i=left;i<=right;i++)
//            {
//                temp.put(s.charAt(i), temp.getOrDefault(s.charAt(i),0)+1);
//            }
//
//            if(map_words.equals(temp))
//            {
//                list.add(left);
//            }
//            left++;
//            right++;
//        }
//return list;
//
//    }
//
//}
