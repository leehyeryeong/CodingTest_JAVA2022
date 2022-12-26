import java.util.Arrays;

public class arraySort {
    public static void main(String[] args) {
        int[] arr = {3, 2, 0, 1, 4};
        //int[] idx = Arrays.binarySearch(arr, 2);

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int idx = Arrays.binarySearch(arr, 2);
    }
}
