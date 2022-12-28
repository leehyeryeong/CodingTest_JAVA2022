import javax.swing.Timer;
import java.util.*;

public class LamdaTest {

    public static void main(String[] args) {
        Timer t = new Timer(1000, event -> System.out.println("beep"));
        t.start();

        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {

            }
        }
    }
}
