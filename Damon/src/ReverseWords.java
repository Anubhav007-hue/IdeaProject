public class ReverseWords {

    public static void main(String[] args )
    {
        String s="I love Sakshi";
        s=s.trim();

        if(s.length()==0 || s==null)
        {
            System.out.println("");

        }

        else {
            int i = s.length()-1;
            int j = s.length()-1;
            StringBuilder sb = new StringBuilder();
            while (i >= 0) {
                if (s.charAt(i) == ' ') {
                    for (int l = i + 1; l <= j; l++) {
                        sb.append(s.charAt(l));
                    }

                    while (s.charAt(i) == ' ') {
                        i--;
                    }
                    sb.append(" ");

                    j = i;
                } else {
                    i--;
                }
            }

            i = 0;
            for(int k=i;k<=j;k++) {
                sb.append(s.charAt(k));
                i++;

            }
            System.out.println(sb);
        }
    }
}
