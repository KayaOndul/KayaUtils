import java.util.*;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class LeetCodeSolutions {

    /**
     * @param keyName corresponds to a person's name  when their key-card was used in a single day
     * @param keyTime corresponds to a person's time when their key-card was used in a single day
     * @return unique worker names who received an alert for frequent keycard use(>=3 times in a day)
     * @see <a href="https://leetcode.com/problems/alert-using-same-key-card-three-or-more-times-in-a-one-hour-period/submissions/"></a>
     */
    public static List<String> alertNames(String[] keyName, String[] keyTime) {
        HashMap<String, List<Integer>> hashMap = new HashMap<>();


        for (int i = 0; i < keyName.length; ++i) {
            hashMap.computeIfAbsent(keyName[i], v -> new ArrayList<>()).add(convertToMinutes(keyTime[i]));
        }

        return hashMap.entrySet().stream().filter(e -> violatedOneHourLaw(e.getValue())).
                map(Map.Entry::getKey).sorted().collect(Collectors.toList());
    }

    public static int convertToMinutes(String time) {
        String[] arr = time.split(":");
        return Integer.parseInt(arr[0]) * 60 + Integer.parseInt(arr[1]);
    }

    public static boolean violatedOneHourLaw(List<Integer> list) {
        Collections.sort(list);
        for (int i = list.size() - 1; i >= 0; --i) {

            int count = 1;
            for (int j = i - 1;
                 count <= 3 && j >= 0 &&
                         list.get(j) + 60 >= list.get(i) && list.get(j) < list.get(i);
                 --j, ++count)
                ;
            if (count >= 3) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param s an expression with paranthesis
     * @return if any unclosed parantheses exist
     * @see <a href="https://leetcode.com/problems/valid-parentheses/submissions/"></a>
     */
    public static boolean validParantheses(String s) {

        Stack<Character> stack = new Stack<>();


        for (int i = 0; i < s.length(); ++i) {

            Character ch = s.charAt(i);

            if (ch == '{' || ch == '(' || ch == '[') {
                stack.push(ch);
            } else if (ch == '}' || ch == ')' || ch == ']') {
                if (stack.size() < 1) {
                    return false;
                }
                Character cur = stack.pop();

                if (
                        (cur == '{' && ch != '}') ||
                                (cur == '(' && ch != ')') ||
                                (cur == '[' && ch != ']')

                ) return false;
            }

        }
        return stack.size() == 0;
    }

    public static int strStr2(String haystack, String needle) {
        int len = needle.length();

        for (int i = 0; i < haystack.length() - len + 1; ++i) {
            String str = haystack.substring(i, i + len);
            if (str.equals(needle)) {
                return i;
            }
        }
        return -1;

    }

    public static int maxProfit(int[] prices) {
        int profit = 0;

        for (int i = 0; i < prices.length - 1; ++i) {
            if (prices[i + 1] > prices[i]) {
                profit += prices[i + 1] - prices[i];
            }
        }
        return profit;
    }

    public static int maxArea(int[] height) {

        int maxArea = Integer.MIN_VALUE;
        for (int i = 0; i < height.length - 1; ++i) {
            for (int j = i + 1; j < height.length; ++j) {
                int a = height[i];
                int b = height[j];
                maxArea = Math.max(maxArea, (j - i) * Math.min(a, b));
            }
        }
        return maxArea;
    }

    public static int maxArea2(int[] height) {

        int maxArea = Integer.MIN_VALUE;
        int cur = height.length - 1;

        for (int i = 0; i < cur; ) {
            int area = Math.min(height[i], height[cur]) * (cur - i);
            maxArea = Math.max(maxArea, area);

            if (height[i] <= height[cur]) {
                i++;
            } else {
                cur--;
            }
        }
        return maxArea;

    }

    public static int reverseDigits(int x) {

        boolean signed = x < 0;

        String str = String.valueOf(x);
        Pattern pattern = Pattern.compile("(\\d)");
        Matcher m = pattern.matcher(str);

        String s = m.results().map(MatchResult::group).collect(Collectors.joining());
        s = new StringBuilder(s).reverse().toString();


        Integer value;
        try {
            value = Integer.valueOf(s);

        } catch (Exception ignored) {
            return 0;
        }

        if (signed) {
            value *= -1;
        }

        return value;


    }

    public static int reverseDigits2(int x) {
        int rev = 0;

        while (x != 0) {
            int remainder = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && remainder > 7)) return 0;
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && remainder < -8)) return 0;
            rev = rev * 10 + remainder;
        }
        return rev;

    }

    public static boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        String str = String.valueOf(x);

        return str.equals(new StringBuilder(str).reverse().toString());

    }


    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap();

        int i=0;
        for(int number :nums){
            int searched=target-number;
            if(map.containsKey(searched)){
                return new int[]{i,map.get(searched)};
            }
            map.put(number,i);
            i++;
        }
        return null;
    }
}
