import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SortUtilTest {

    @Test
    void bubbleSort() {
        int[] given = new int[]{23, -50, 1, 55, 3, -10, 55, 12, -20, 50};
        int[] expected = new int[]{-50, -20, -10, 1, 3, 12, 23, 50, 55, 55};


        assertTrue(Arrays.equals(expected, SortUtil.bubbleSort(given)));
    }

    @Test
    void insertionSort() {
        int[] given = new int[]{23, -50, 1, 55, 3, -10, 55, 12, -20, 50};
        int[] expected = new int[]{-50, -20, -10, 1, 3, 12, 23, 50, 55, 55};

        assertTrue(Arrays.equals(expected, SortUtil.insertionSort(given)));
    }

    @Test
    void selectionSort() {
        int[] given = new int[]{23, -50, 1, 55, 3, -10, 55, 12, -20, 50};
        int[] expected = new int[]{-50, -20, -10, 1, 3, 12, 23, 50, 55, 55};

        assertTrue(Arrays.equals(expected, SortUtil.selectionSort(given)));
    }
}