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

}
