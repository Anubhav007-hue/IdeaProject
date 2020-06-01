public class BitWiseAdd {
    public static void main(String[] args )
    {
        int a=-2;;
        int b=3;

        System.out.println(Add(a,b));
    }

    public static int Add(int a ,int b)
    {
        while(b!=0)
        {
            int carry=a&b;
            a=a^b;
            b=carry<<1;
        }

        return a;
    }
}
