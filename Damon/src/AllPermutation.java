public class AllPermutation{
    int count =0;

    public static void main(String[] args) {
        String str = "123";
        int n = str.length();
        AllPermutation permutation = new AllPermutation();
        permutation.permute(str, 0, n - 1);
        System.out.println("The count is :"+permutation.count);

        
    }

    private void permute(String str, int l, int r) {
        if (l == r)
        {
            count++;
            System.out.print(str + " ");
        }

        else
            {
            for (int i = l; i <= r; i++)
            {
                str = swap(str, l, i);
                permute(str, l + 1, r);
                str = swap(str, l, i);
            }
        }
    }

    public String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
