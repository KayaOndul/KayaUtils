import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LeetCodeSolutionsTest {

    @Test
    void alertNames() throws ParseException {
        var givenKeyName = new String[]{"daniel", "daniel", "daniel", "luis", "luis", "luis", "luis"};
        var givenKeyTime = new String[]{"10:00", "10:40", "11:00", "09:00", "11:00", "13:00", "15:00"};

        var expected = List.of("daniel");

        assertTrue(expected.equals(LeetCodeSolutions.alertNames(givenKeyName, givenKeyTime)));
    }

    @Test
    void alertNames_test2() throws ParseException {
        var givenKeyName = new String[]{"alice", "alice", "alice", "bob", "bob", "bob", "bob"};
        var givenKeyTime = new String[]{"12:01", "12:00", "18:00", "21:00", "21:20", "21:30", "23:00"};

        var expected = List.of("bob");

        assertTrue(expected.equals(LeetCodeSolutions.alertNames(givenKeyName, givenKeyTime)));
    }


    @Test
    void alertNames_test3() throws ParseException {
        var givenKeyName = new String[]{"a", "a", "a", "a", "a", "a", "b", "b", "b", "b", "b"};
        var givenKeyTime = new String[]{"23:27", "03:14", "12:57", "13:35", "13:18", "21:58", "22:39", "10:49", "19:37", "14:14", "10:41"};

        var expected = List.of("a");

        assertTrue(expected.equals(LeetCodeSolutions.alertNames(givenKeyName, givenKeyTime)));
    }

    @Test
    void alertNames_test4() throws ParseException {
        var givenKeyName = new String[]{"a", "a", "a", "a", "a", "a", "b", "b", "b", "b", "b"};
        var givenKeyTime = new String[]{"23:27", "03:14", "12:57", "13:35", "13:18", "21:58", "22:39", "10:49", "19:37", "14:14", "10:41"};

        var expected = List.of("a");

        assertTrue(expected.equals(LeetCodeSolutions.alertNames(givenKeyName, givenKeyTime)));
    }


    @Test
    void validParantheses_test1() {
        var given="()[]{}";
        assertEquals(true,LeetCodeSolutions.validParantheses(given));

    }

    @Test
    void validParantheses_test2() {
        var given="([)]";
        assertEquals(false,LeetCodeSolutions.validParantheses(given));

    }

    @Test
    void strStr_test1() {
        var givenHaystack="aaaaa";
        var givenNeedle="bba";

        var expected=-1;

        assertEquals(expected,LeetCodeSolutions.strStr2(givenHaystack,givenNeedle));
    }

    @Test
    void strStr2_test2() {
        var givenHaystack="hello";
        var givenNeedle="ll";

        var expected=2;

        assertEquals(expected,LeetCodeSolutions.strStr2(givenHaystack,givenNeedle));
    }

    @Test
    void strStr_test3() {
        var givenHaystack="";
        var givenNeedle="";

        var expected=0;

        assertEquals(expected,LeetCodeSolutions.strStr2(givenHaystack,givenNeedle));
    }

    @Test
    void strStr2_test4() {
        var givenHaystack="a";
        var givenNeedle="a";

        var expected=0;

        assertEquals(expected,LeetCodeSolutions.strStr2(givenHaystack,givenNeedle));
    }
    @Test
    void strStr2_test5() {
        var givenHaystack="";
        var givenNeedle="a";

        var expected=-1;

        assertEquals(expected,LeetCodeSolutions.strStr2(givenHaystack,givenNeedle));
    }
    @Test
    void maxPrices_test1(){
        var prices =new int []{7,1,5,3,6,4};

        assertEquals(7,LeetCodeSolutions.maxProfit(prices));
    }

    @Test
    void maxArea_test1(){
        var levels =new int []{1,8,6,2,5,4,8,3,7};

        assertEquals(49,LeetCodeSolutions.maxArea2(levels));
    }
    @Test
    void maxArea_test2(){
        var levels =new int []{1,1};

        assertEquals(1,LeetCodeSolutions.maxArea2(levels));
    }

    @Test
    void maxArea_test3(){
        var levels =new int []{1,2,1};

        assertEquals(2,LeetCodeSolutions.maxArea2(levels));
    }

    @Test
    void reverseDigits() {

        var result=LeetCodeSolutions.reverseDigits2(299999999);
    }

    @Test
    void isPalindrome() {
        var result=LeetCodeSolutions.isPalindrome(1221);
        assertTrue(result);
    }

    @Test
    void twoSum(){
        var result=LeetCodeSolutions.twoSum(new int[]{2,7,11,15},9);
        assertArrayEquals(result, new int[]{1, 0});
    }

    @Test
    void searchRotatedSortedArray() {
        var numsArray=new int[]{4,5,6,7,0,1,2};
        var target=0;
        var expected=4;

        assertEquals(expected,LeetCodeSolutions.searchRotatedSortedArray(numsArray,target));
    }
    @Test
    void searchRotatedSortedArray_test2() {
        var numsArray=new int[]{4,5,6,7,0,1,2};
        var target=3;
        var expected=-1;

        assertEquals(expected,LeetCodeSolutions.searchRotatedSortedArray(numsArray,target));
    }
    @Test
    void containerWithMostWaterTest() {
        var numsArray=new int[]{1,8,6,2,5,4,8,3,7};
        var expected=49;

        assertEquals(expected,LeetCodeSolutions.maxArea(numsArray));
    }

    @Test
    void romanToInt(){
        var given="IV";
        var expected=4;
        assertEquals(4,LeetCodeSolutions.romanToInt(given));
    }
}