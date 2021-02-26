public class NumUtil {

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
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

    /**
     * @param nums gets a list of integers between -10000 to 10000
     * @return max possible summation by pairing two integers and selecting the minimum
     * Solution is O(n) complexity with extra O(d) space, by design choice for faster runtime.
     * Runtime: 9 ms, faster than 97.11% of Java online submissions for Array Partition I.
     * Memory Usage: 40.9 MB, less than 86.75% of Java online submissions for Array Partition I.
     * @see <a href="https://leetcode.com/problems/array-partition-i/submissions/">link to question</a>
     */
    public static int arrayPairSum(int[] nums) {
        int[] arr = new int[20001];


        for (int i = 0; i < nums.length; i++) {
            arr[nums[i] + 10000]++;
        }

        int sum = 0;
        int temp = -999999;
        int value = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            value = i - 10000;
            count = arr[i];

            if (temp != -999999 && count > 0) {
                sum += temp;
                count--;
                temp = -999999;
            }
            int multiplier = count / 2;
            if (multiplier > 0) {
                sum += multiplier * value;
                count -= multiplier * 2;
            }
            if (count == 1) {
                temp = value;
            }

        }
        return sum;

    }
}
