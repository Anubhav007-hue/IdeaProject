import java.util.ArrayList;
import java.util.List;

public class CasePermutation {

    public static void main(String[] args)
    {
        String str="a1b2";
        System.out.print(letterCasePermutation(str));
    }

    public static List<String> letterCasePermutation(String str) {
        List<String> result=new ArrayList<>();
        if(str.length()==0 || str==null)
        {
            return result;
        }
        permuate(0,str.length()-1,str,result);
        return result;
    }

    private static void permuate(int low, int high , String str, List<String> result) {


        result.add(str);
        for(int i=low;i<high;i++)
        {
            char[] temp=str.toCharArray();
            if(str.charAt(i)>='1' && str.charAt(i)<='9')
            {
                continue;
            }

            else
            {
                if(str.charAt(i)>='a' && str.charAt(i)<='z')
                {
                    temp[i]=Character.toUpperCase(str.charAt(i));
                    String newString=new String(temp);
                    permuate(i+1,newString.length()-1, newString, result);
                }

                else
                {

                    temp[i]=Character.toLowerCase(str.charAt(i));
                    String newString=new String(temp);
                    permuate(i+1,newString.length()-1, newString, result);
                }
            }
        }
    }
}
