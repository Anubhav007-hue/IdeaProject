public class AddTwoStrings {
    public static void main(String[] args )
    {
        String num1="100";
        String num2="100";

        System.out.println(addStrings(num1,num2));


    }

    public  static  String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        if (num1.charAt(0) == '0' & num2.charAt(0) == '0') {
            sb.append(0);
            String result = new String(sb);
            return result;
        }

        int length1 = num1.length();
        int length2 = num2.length();
        int sum = 0;

        if (length1 > length2) {
            int stop = length1 - length2;
            for (int i = 0; i < stop; i++) {
                num2 =  "0" +num2 ;
            }


        } else if (length2 > length1) {
            int stop = length2 - length1;
            for (int i = 0; i < stop; i++) {
                num1 = "0"+num1 ;
            }
        }
        length1=num1.length();
        length2=num2.length();

        for (int i = length1 - 1; i >= 0; i--) {
            int first = num1.charAt(i) - '0';
            int second = num2.charAt(i) - '0';
            sum = sum + first + second;
            sb.insert(0, sum % 10);
            int carry = sum / 10;
            sum = 0;
            sum = carry;
            ;
        }

        if (sum != 0)
            sb.insert(0, sum);

        String result = new String(sb);
        return result;
    }

    }
