import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {

    public static class customSort implements Comparator<String>
    {


        @Override
        public int compare(String a, String b) {

            String first=a+b;
            String second=b+a;
            return second.compareTo(first);
        }
    }
    public static void main(String[] args )
    {
        int [] nums={3,30,34,5,9};
        System.out.print(largestNumber(nums));
    }
    public static String largestNumber(int[] nums) {
        String[] str=new String[nums.length];
        int k=0;
        for(int current:nums)
        {
            str[k++]=String.valueOf(current);
        }

        Arrays.sort(str, new customSort());

        StringBuilder sb=new StringBuilder();
        for(String current:str)
        {
            sb.append(current);
        }
String temp=new String(sb);
        return temp;

    }
}
