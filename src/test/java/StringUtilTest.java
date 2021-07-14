import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilTest {

    @Test
    void splitStringIntoSubstring_Java9() {

        var actual = StringUtil.splitStringIntoSubstring_Java9("soiuahjdowqjwjeowqjoqwjiewqowjeqiowqeijwqeoww", 3);

        var expected = List.of("soi", "uah", "jdo", "wqj", "wje", "owq", "joq", "wji", "ewq", "owj", "eqi", "owq", "eij", "wqe", "oww");

        assertEquals(expected, actual);
    }

    @Test
    void splitStringIntoSubstring_Java8() {

        var actual = StringUtil.splitStringIntoSubstring_Java8("soiuahjdowqjwjeowqjoqwjiewqowjeqiowqeijwqeoww", 3);

        var expected = List.of("soi", "uah", "jdo", "wqj", "wje", "owq", "joq", "wji", "ewq", "owj", "eqi", "owq", "eij", "wqe", "oww");

        assertEquals(expected, actual);
    }

    @Test
    void isPalindRomeTest() {

        assertTrue(StringUtil.isPalindrome("madam"));
        assertTrue(StringUtil.isPalindrome("anna"));
        assertTrue(StringUtil.isPalindrome("kabak"));
        assertTrue(StringUtil.isPalindrome("ey edip adanada pide ye"));
    }

    @Test
    void isAnagram() {

        assertTrue(StringUtil.isAnagram("margana", "anagram"));
        assertFalse(StringUtil.isAnagram("lenovo", "dell"));
        assertFalse(StringUtil.isAnagram("abcdbcda", "bbccddaaxyz"));
        assertFalse(StringUtil.isAnagram("xyzw", "xyxy"));

    }

    @Test
    void removeAllWhitSpace() {
        var given = "  John   Doe ".toCharArray();
        var expected = "JohnDoe      ".toCharArray();
        var real = StringUtil.removeAllWhiteSpace(given);


        assertEquals(expected.length, real.length);
        assertTrue(Arrays.equals(expected, real));

    }

    @Test
    void removeUnnecessarySpaces() {
        var given = "  John    Doe ".toCharArray();
        var expected = "John Doe      ".toCharArray();
        var real = StringUtil.removeUnnecessarySpaces(given);


        assertEquals(expected.length, real.length);
        assertTrue(Arrays.equals(expected, real));

    }

    @Test
    void removeUnnecessarySpaces_Test_2() {
        var given = " a  tall    cat is       passing  by           ".toCharArray();
        var expected = "a tall cat is passing by                       ".toCharArray();
        var real = StringUtil.removeUnnecessarySpaces(given);


        assertEquals(expected.length, real.length);
        assertTrue(Arrays.equals(expected, real));

    }

    @Test
    void removeUnnecessarySpaces_Test_3() {
        var given = "a  tall    cat is       passing  by           ".toCharArray();
        var expected = "a tall cat is passing by                      ".toCharArray();
        var real = StringUtil.removeUnnecessarySpaces(given);


        assertEquals(expected.length, real.length);
        assertTrue(Arrays.equals(expected, real));

    }

    @Test
    void balancedStringSplit() {
        String given = "RLRRRLLRLL";
        int output = 2;

        assertEquals(output, StringUtil.balancedStringSplit(given));
    }
    @Test
    void str() {
        String given = "HelloWorld";
        var res=StringUtil.maximumOccurringCharacter(given);
        int i=1;
    }

    @Test
    void num(){
        List<Integer> list=List.of(10,8,7,6,5);
        var res=StringUtil.maxTrailing(list);
        int i=1;
    }

    @Test
    void num2(){
       String testVal="6:3 3:10 2:10";
     StringUtil.ss(testVal);
        int i=1;
    }
}