import java.util.Arrays;

public class arraySort {
    public static void main(String[] args) {
        int[] arr = {3, 2, 0, 1, 4};
        //int[] idx = Arrays.binarySearch(arr, 2);
        //System.out.println(idx);

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int idx = Arrays.binarySearch(arr, 2);
        System.out.println(idx);

        String[] str = {"김영희", "김철수", "김도영", "김동영"};
        Arrays.sort(str);
        System.out.println(str);
    }
}
