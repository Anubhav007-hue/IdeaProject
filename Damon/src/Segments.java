public class Segments {
    public static void main(String[] args)
    {
        String str="Hello, my name is John";
        System.out.println(countSegments(str));

    }

    public static  int countSegments(String s) {
        int length=s.length();
        int count=0;
        for(int i=0;i<length;i++)
        {
            if(s.charAt(i)==' ')
            {
                count++;
            }
        }
return length-count;
    }
}
