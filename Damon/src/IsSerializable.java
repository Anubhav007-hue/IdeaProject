

import java.util.*;
import java.util.ArrayList;

public class IsSerializable {
    public static void main(String[] args)
    {
        String str="#,#,3,5,#";
        System.out.print(isValidSerialization(str));

    }


    public  static boolean isValidSerialization(String preorder)
    {

        List<String> list=new ArrayList<>();
        int i=0;
        int j=0;

        while(j<preorder.length())
        {
            char curr=preorder.charAt(j);

            while(j<preorder.length() && preorder.charAt(j)!=',')
            {
                j++;
            }
            String temp=preorder.substring(i,j);
            list.add(temp);
            j++;
            i=j;
        }
//        j++;
//        list.add(preorder.substring(i,j));


        return validation(list);

    }

    private static boolean validation(List<String> list) {

        int i=0;
        int j=0;
        int nodes =1;
        while(i<list.size())
        {
            String current=list.get(i);


            if(current.equals("#"))
            {
                nodes-=1;

            }
            else
            {
                nodes-=1;
                nodes+=2;
            }
            i++;
        }

        if(nodes==0)
        {
            return true ;
        }

        return false ;
    }
}
