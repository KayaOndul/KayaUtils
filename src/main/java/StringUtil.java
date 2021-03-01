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

        int insertIndex = 0, cursor = 0;
        int total = 0;
        for (; cursor < arr.length; ++cursor) {
            if (arr[cursor] != ' ') {
                arr[insertIndex++] = arr[cursor];
            } else {
                if (insertIndex == 0) {
                    total++;
                } else if (arr[insertIndex - 1] == ' ') {
                    total++;
                } else {
                    arr[insertIndex++] = arr[cursor];
                }
            }

        }

        while (total-- > 0) {
            arr[arr.length - 1 - total] = ' ';
        }
        return arr;
    }

}
