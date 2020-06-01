public class LastWordLength {

    public static void main(String[] args )
    {
        String s=" a";
        System.out.println(lengthOfLastWord(s));
    }

    public  static int lengthOfLastWord(String s) {


        s=s.trim();
        int j=s.length()-1;

        int count=0;
        if(s.length()==0 || s==null)
        {
            return count;
        }
        while(j>=0 && s.charAt(j)!=' ')
        {
            count++;
            j--;


        }
        return count;

    }
}
