public class SortUtil {

    /**
     * @param arr array to sort
     * @return array sorted
     */
    public static int[] bubbleSort(int[] arr) {
        for (int k = 0; k < arr.length - 1; ++k) {
            for (int i = 0; i < arr.length - k - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
        }

        return arr;

    }

    /**
     * <p>
     * Starting from first element to last loop:
     * Protect current element in a container
     * While current element is smaller than the left one, shift right by one.
     * Finally put current element before elements bigger than him
     * <p>
     * Complexity is same with bubblesort, bu lesser swaps by using array insertion.
     * </p>
     *
     * @param arr array to sort
     * @return array sorted
     */
    public static int[] insertionSort(int[] arr) {


        int tempContainer;
        for (int outer = 1; outer < arr.length; ++outer) {

            tempContainer = arr[outer];
            int inner = outer - 1;
            for (; inner >= 0 && arr[inner] > tempContainer; --inner) {
                arr[inner + 1] = arr[inner];//Base difference against bubblesort
            }
            arr[inner + 1] = tempContainer;


        }
        return arr;
    }

    /**
     * <p>
     * For all indexes in an array, select current as min and current index as minIdx,
     * starting from right to the end, check whether any element is lesser then min,
     * if so swap with current index.
     * </p>
     *
     * @param arr array to sort
     * @return array sorted
     */
    public static int[] selectionSort(int[] arr) {
        int min, minIdx;
        for (int outer = 0; outer < arr.length - 1; ++outer) {
            min = arr[outer];
            minIdx = outer;
            for (int inner = outer + 1; inner < arr.length; ++inner) {
                if (arr[inner] < min) {
                    min = arr[inner];
                    minIdx = inner;
                }
            }
            swap(arr, minIdx, outer);
        }
        return arr;
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
