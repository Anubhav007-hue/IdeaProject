import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAdress {
    public static void main(String[] args)
    {
        String[] emails={"test.email+alex@leetcode.com", "test.email@leetcode.com"};
        int result=numUniqueEmails(emails);
        System.out.print(result);
    }
    public static int numUniqueEmails(String[] emails)
    {
        Set<String> unique=new HashSet<>();

        for(String email:emails)
        {
            StringBuilder adress=new StringBuilder();
            for(int i=0;i<email.length();i++)
            {
                char current=email.charAt(i);
                if(current=='.')
                {
                    continue;
                }
                else if (current=='+') {
                    while (email.charAt(i) != '@') {
                        i++;
                    }
                    adress.append(email.substring(i));

                }
                else if(current=='@')
                {
                    adress.append(email.substring(i));

                }
                else
                {
                    adress.append(current);
                }
            }
            unique.add(adress.toString());
        }
     return  unique.size();
    }

}
