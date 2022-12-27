import java.util.*;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();

        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("추가할 학생의 이름을 입력하세요: ");
            String name = scanner.next();

            set.add(name);
        }

        System.out.println(set);
    }
}
