import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class StringUtil {
    /**
     * @param s      String to  split
     * @param chunks chunk sizes to get
     * @return List of splitted substrings
     */
    public static List<String> splitStringIntoSubstring_Java9(String s, int chunks) {
        List<String> strings = new ArrayList<>();

        IntStream.iterate(0, n -> n < s.length(), i -> i + chunks)
                .forEach(num -> strings.add(s.substring(num, num + 3)));

        return strings;
    }

    /**
     * @param s      String to  split
     * @param chunks chunk sizes to get
     * @return List of splitted substrings
     */
    public static List<String> splitStringIntoSubstring_Java8(String s, int chunks) {
        List<String> strings = new ArrayList<>();
        IntStream.iterate(0, i -> i + chunks)
                .peek(num -> strings.add(s.substring(num, num + chunks)))
                .allMatch(num -> num < s.length() - chunks);

        return strings;
    }

    public static boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start < end && s.charAt(start++) == s.charAt(end--)) ;
        return start >= end;
    }

    public static boolean isAnagram(String s1, String s2) {

        for (char c = 'a'; c <= 'z'; ++c) {
            int sum = 0;
            for (int i = 0; i < s1.length(); ++i) {
                if (s1.charAt(i) == c) {
                    sum += 1;
                }
            }
            for (int i = 0; i < s2.length(); ++i) {
                if (s2.charAt(i) == c) {
                    sum -= 1;
                }
            }
            if (sum != 0) {
                return false;
            }
        }
        return true;

    }


    /**
     * @param arr a char array with random space characters in between word characters
     * @return returns the characters by moving all of the letters to start
     * <p>
     * O(n) complexity with O(1) in space.
     * </p>
     */
    public static char[] removeAllWhiteSpace(char[] arr) {

        int count = 0;
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] != ' ') {
                arr[count++] = arr[i];
            }
        }

        for (int i = arr.length - 1; i > count; --i) {
            arr[i] = ' ';
        }
        return arr;
    }

    /**
     * @param arr a char array with random space characters in between word characters
     * @return returns the sentence by moving all extra spaces to the end, leaving one space between each
     * letter
     * <p>
     * O(n) complexity with O(1) in space.
     * </p>
     */
    public static char[] removeUnnecessarySpaces(char[] arr) {

        int insertIndex = 0;
        int totalExtraSpaces = 0;
        for (int cursor = 0; cursor < arr.length; ++cursor) {
            if (arr[cursor] != ' ') { //If cursor is a letter, put cursor to insert index and iterate i.index by 1
                arr[insertIndex++] = arr[cursor];
            } else { //If cursor is space
                if (insertIndex == 0) { //If first insertIndex is space, +1 to extraSpaces
                    totalExtraSpaces++;
                } else if (arr[insertIndex - 1] == ' ') { //If my latest insertions' left neighbor is space, +1 to extra spaces
                    totalExtraSpaces++;
                } else { //Else put cursor to insert index and iterate i.index by 1
                    arr[insertIndex++] = arr[cursor];
                }
            }
        }

        while (totalExtraSpaces-- > 0) {
            arr[arr.length - 1 - totalExtraSpaces] = ' ';
        }
        return arr;
    }

    /**
     * @param s a string with balanced letter count
     * @return possible balanced substrings
     * @see <a href="https://leetcode.com/problems/split-a-string-in-balanced-strings/submissions/">link to question</a>
     */
    public static int balancedStringSplit(String s) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == 'R') {
                sum -= 5;
            } else {
                sum += 5;
            }

            if (sum == 0) {
                count++;
                sum = 0;
            }

        }
        return count;
    }
}
