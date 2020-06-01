import java.util.HashMap;

public class LongestCommonPrefix {
    public static void main(String[] args)
    {
        String[] strs={"dog","dog"};
        System.out.println(getPrefix(strs));
    }

    private static String getPrefix(String[] strs) {
        int length=strs.length;
        boolean bool=true;

        int k=0;
        int l=0;
        char [] check=strs[0].toCharArray();
        StringBuilder sb=new StringBuilder();
        String result="";

        while (bool!=false)
        {
            HashMap<Character,Integer> map=new HashMap<>();
            for(String current:strs)
            {

                char[] temp=current.toCharArray();
                if(k>=temp.length)
                {
                    return result;

                }
                if(map.containsKey(temp[k]))
                {
                    map.replace(temp[k],map.get(temp[k])+1);
                }
                else
                {
                    map.put(temp[k],1);
                }
            }

            if(map.get(check[l])!=length)
            {
                return result;
            }
            else
            {
                result=result+check[l];
            }
            k++;
            l++;
        }



        return result;
    }
}
