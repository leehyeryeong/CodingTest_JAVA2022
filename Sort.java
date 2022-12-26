import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class Sort {
    public static void main(String[] args) {
        String[] str =  {"a", "1", "가", "A", "3", "나"};

        for(String s: str) {
            System.out.print(s + " ");
        }
        System.out.println();

        Arrays.sort(str, Collections.reverseOrder());
        for(String s: str) {
            System.out.print(s + " ");
        }
    }
}