public class toLowerCase {
    public static void main(String[] args )
    {
        String str="HELLO";
        char [] current=str.toCharArray();

        for(int i=0;i<str.length();i++)
        {
            if(current[i]>='A' && current[i]<='Z') {
                int temp = current[i];
                temp = temp + 32;
                current[i] = (char) temp;
            }
        }
        for(char c:current)
        {
            System.out.print(c+" ");
        }
    }
}
