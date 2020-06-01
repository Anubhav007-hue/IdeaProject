public class BinaryAnd {
    public static void main(String[] args )
    {

        int m=0;
        int n=1;
        int and= 0|m;

        for(int i=m+1;i<=n;i++)
        {
            and=and&i;
        }




        System.out.println(and);
    }
}
