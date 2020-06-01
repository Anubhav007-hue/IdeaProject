public class BuyAndSellStock {

    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int min_pointer = 0;
        int max_pointer = 0;

        int [] prices={2,4,1};

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
                min_pointer = i;
            }
        }

        for (int i = min_pointer+1; i < prices.length; i++) {
            if (prices[i] > max) {
                max = prices[i];
                max_pointer = i;
            }
        }


        if (min_pointer > max_pointer) {
            System.out.println("0");
        }


        System.out.println(prices[max_pointer] - prices[min_pointer]);

    }
}
