public class SearchUtil {

    public static int binarySearch(int[] arr, int value) {

        int left = 0;
        int right = arr.length - 1;

        int i = (right + left) / 2;
        for (; right > left; i = (right + left) / 2) {


            if (arr[i] < value) {
                left = i + 1;
            } else if (arr[i] > value) {
                right = i - 1;
            } else {
                return i;
            }
        }
        return -1;


    }
}
