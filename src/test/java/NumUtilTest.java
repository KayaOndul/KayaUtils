import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class NumUtilTest {
    @Test
    void testGcd() {
        int expected = 3;
        assertEquals(expected, NumUtil.gcd(21, 72));
    }

    @Test
    void runningSumOfAnArray() {
        int[] given = new int[]{1, 3, 8, 14, 18};
        int[] expected = new int[]{1, 4, 12, 26, 44};

        assertTrue(Arrays.equals(expected, NumUtil.runningSumOfAnArray(given)));
    }

    @Test
    void shuffle() {
        int[] given = new int[]{2, 5, 1, 3, 4, 7};
        int zipLength = 3;
        int[] expected = new int[]{2, 3, 5, 4, 1, 7};

        assertTrue(Arrays.equals(expected, NumUtil.shuffle(given, zipLength)));
    }

    @Test
    void sortArrayByParity() {
        int[] given = new int[]{5, 7, 2, 4};
        int[] expected = new int[]{2, 4, 5, 7};
        LinkedList<Integer> ll = new LinkedList<>();

        int[] result = Arrays.stream(NumUtil.sortArrayByParity(given)).sorted().boxed().mapToInt(x -> x).toArray();
        assertTrue(Arrays.equals(expected, result));

    }

    @Test
    void arrayPairSum_test1() {
        int[] given = new int[]{6, 2, 6, 5, 1, 2};
        int expected = 9;
        assertEquals(expected, NumUtil.arrayPairSum(given));
    }

    @Test
    void arrayPairSum_test2() {
        int[] given = new int[]{1, 1, 2, 2};
        int expected = 3;
        assertEquals(expected, NumUtil.arrayPairSum(given));
    }

    @Test
    void arrayPairSum_test3() {
        int[] given = new int[]{1, 4, 3, 2};
        int expected = 4;
        assertEquals(expected, NumUtil.arrayPairSum(given));
    }

    @Test
    void arrayPairSum_test5() {
        int[] given = new int[]{4, 2, 5, 5, 6, 0};
        int expected = 9;
        assertEquals(expected, NumUtil.arrayPairSum(given));
    }
}