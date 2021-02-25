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

    /**
     * @param nums array to shuffle
     * @param n    x,y divider
     *             <p>
     *             This function shuffles an array O(n) complexity,
     *             O(n) memory
     *
     *             </p>
     * @see <a href="https://leetcode.com/problems/shuffle-the-array/">link to question</a>
     */
    public static int[] shuffle(int[] nums, int n) {
        int[] list = new int[nums.length];
        for (int i = 0, j = 0; i < n; ++i, j += 2) {
            list[j] = nums[i];
            list[j + 1] = nums[i + n];
        }
        return list;
    }

    /**
     * @param A array to sort
     * @return sorted array evens first odds following
     * This solves unnecessary swap by using odd pointer at the end of the array.
     * @see <a href="https://leetcode.com/problems/sort-array-by-parity/submissions/">link to question</a>
     * O(n) complexity O(1)space
     */
    public static int[] sortArrayByParity(int[] A) {
        int left, right = A.length - 1, cur, temp;
        for (left = 0; left < A.length - 1 && right > left; ) {
            cur = A[left];

            if (cur % 2 != 0) {
                temp = A[right];
                A[right] = cur;
                A[left] = temp;
                right--;
            } else {
                left++;
            }

        }
        return A;

    }
}
