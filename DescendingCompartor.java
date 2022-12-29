import java.util.*;

public class DescendingCompartor implements Comparator {
    public int compare(Object o1, Object o2) {
        Fruit fruit1 = (Fruit)o1;
        Fruit fruit2 = (Fruit)o2;

        if(fruit1.price < fruit2.price) {
            return 1;
        } else if(fruit1.price == fruit2.price) {
            return 0;
        } else {
            return -1;
        }
    }
}