public class Attendance {
    public static void main(String[] args )
    {
        String s="AA";
        System.out.println(checkRecord(s));
    }

    public static  boolean checkRecord(String s) {
        int count=0;
        int index=0;
        int continuos_L=0;
        while(index<s.length()-1)
        {
            if(s.charAt(index)=='L')
            {
                if(s.charAt(index+1)=='L')
                {
                    continuos_L++;
                }
            }

            index++;
        }
        index=0;
        while (index<s.length())
        {
            if(s.charAt(index)=='A')
            {
                count++;
            }
            index++;
        }
        if(count>1 )
        {
            return false ;
        }

        if(continuos_L>=2)
            return false ;


        return true ;

    }
}
