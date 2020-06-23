public class RotateFunction {
    public static void main(String[] args) {
        int[] nums = {4,3,2,6};
        System.out.println(maxRotateFunction(nums));
    }

    public static int maxRotateFunction(int[] nums) {

        if (nums.length == 0 || nums == null) {
            return 0;
        }

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int res = 0;
            rotate(nums, i);
            res = getSum(nums);
            max = Math.max(max, res);

        }

        return max;

    }

    public static int getSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + (i * nums[i]);
        }

        return sum;
    }


    public  static void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] temp = new int[n];
        int l = 0;
        for (int i = k; i < n; i++) {
            temp[l++] = nums[i];
        }

        for (int i = 0; i < k; i++) {
            temp[l++] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }


    }
}
