public class MaximumContiguousSubarray {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.print(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int n = nums.length;

        int left = 0;
        int right = 0;
        int runningSum = 0;
        int max = nums[0];
        int res = max;
        while (right < n) {


            runningSum = runningSum + nums[right];
            if (runningSum<max) {
                res = max;
                runningSum = 0;
                left = right;
                max = nums[right];


            } else {
                right++;
                max = Math.max(runningSum, max);

            }
        }


        return res;
    }
}
