//import javax.print.DocFlavor;
//import java.util.*;
//
//public class ReplaceWords {
//    public  static void main(String[] args )
//    {
//
//        ArrayList<String> dict= new ArrayList<>();
//        dict.add("cat");
//        dict.add("bat");
//        dict.add("rat");
//        String sentence="the cattle was rattled by the battery";
//    }
//
//    public static String replaceWords(ArrayList<String> dict, String sentence) {
//        Set<String> set=new HashSet<>();
//        for(String str:dict)
//        {
//            set.add(str);
//        }
//        List<String> s=new ArrayList<>();
//        StringBuilder sb=new StringBuilder();
//        int j=0;
//        int i=0;
//        for( i=0;i<sentence.length();i++)
//        {
//            if(sentence.charAt(i)==' ')
//            {
//                s.add(sentence.substring(j,i));
//                j=i;
//                j++;
//            }
//
//        }
//        s.add(sentence.substring(j,i));
//
//    }
//}
