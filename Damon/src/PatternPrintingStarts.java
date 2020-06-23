public class PatternPrintingStarts {
    public static void main(String[] args )
    {
        for(int i=4;i>=0;i--)
        {

//            FOR THE FIRST SPACE

            for(int j=4;j>i;j--)
            {
                System.out.print("   ");
            }

//            FOR THE SECOND SPACE

//            for(int j=4;j>i;j--)
//            {
//                System.out.print("  ");
//            }
            for(int k=0;k<=i;k++)
            {
                System.out.print("*");

            }

            System.out.println("");
        }

        System.out.println();
    }
}
