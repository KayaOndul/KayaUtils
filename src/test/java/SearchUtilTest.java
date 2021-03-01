import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchUtilTest {

    @Test
    void binarySearch_test1() {
        int[] given = IntStream.range(0, 10000).map(i -> i * i).toArray();
        int value = 6400;
        int expected = 80;

        assertEquals(expected, SearchUtil.binarySearch(given, value));
    }

    @Test
    void binarySearch_test2() {
        int[] given = IntStream.range(0, 10).map(i -> i * i).toArray();
        int value = 4;
        int expected = 2;

        assertEquals(expected, SearchUtil.binarySearch(given, value));
    }


    @Test
    void binarySearch_test3() {
        int[] given = IntStream.range(0, 10).map(i -> i * i).toArray();
        int value = 21;
        int expected = -1;

        assertEquals(expected, SearchUtil.binarySearch(given, value));
    }
}