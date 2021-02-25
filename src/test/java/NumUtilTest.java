import org.junit.jupiter.api.Test;

import java.util.Arrays;

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
}