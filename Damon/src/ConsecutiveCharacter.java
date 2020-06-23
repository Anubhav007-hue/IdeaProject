public class ConsecutiveCharacter {
    public static void main(String[] args )
    {
        String str="ccbccbb";
        System.out.println(maxPower(str));

    }

    public static int maxPower(String s) {

        int max=0;
        int i=0;
        int j=0;
        while(j<s.length()-1)
        {
            if(s.charAt(j)!=s.charAt(j+1))
            {
                j++;
                i=j;
            }
            else
            {
                while(j<s.length()-1 && s.charAt(j)==s.charAt(j+1))
                {
                    j++;
                }
                max=Math.max(max,j-i+1);
                j++;
                i=j;
            }
        }
        return max;

    }
}
