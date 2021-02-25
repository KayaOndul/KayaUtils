public class NumUtil {

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b % a, a);
    }


    /**
     * @param nums array to convert to running sum values.
     * @return the array
     * <p>
     * This function calculates running sum of an array without extra memory space.
     * It has O(n) complexity
     * @see <a href="https://leetcode.com/problems/running-sum-of-1d-array/">link to question</a>
     */
    public static int[] runningSumOfAnArray(int[] nums) {

        int i;
        for (i = 1; i < nums.length; ++i) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}
