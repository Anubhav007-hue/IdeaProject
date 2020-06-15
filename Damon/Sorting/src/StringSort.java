import java.util.Arrays;

public class StringSort {
    public static void main(String [] args)
    {
        String str="351236";

        char [] temp=str.toCharArray();
        Arrays.sort(temp);
        String s=new String(temp);
        System.out.print(s);
    }
}
