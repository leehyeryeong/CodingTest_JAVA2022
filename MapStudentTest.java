import java.util.*;

public class MapStudentTest {
    private int sno;
    private String name;
    public MapStudentTest(int sno, String name) {
        this.sno = sno;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            MapStudentTest student = (MapStudentTest)obj;
            return ((sno==student.sno)&&(name==student.name));
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return sno+name.hashCode();
    }

    @Override
    public String toString() {
        return "학생 번호: "+sno+", 학생 이름: "+name;
    }

    public static void main(String[] args) {
        Map<MapStudentTest, Integer> map = new HashMap<MapStudentTest, Integer>();

        map.put(new MapStudentTest(1, "홍길동"), 95);
        map.put(new MapStudentTest(1, "홍길동"), 90);
        map.put(new MapStudentTest(2, "김길동"), 80);

        System.out.println("총 Entry 수: "+map.size());
        System.out.println(map);
    }
}
