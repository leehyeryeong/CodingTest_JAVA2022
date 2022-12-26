import java.util.Arrays;

//1. GPA 오름차순 출력
class Student implements Comparable {
    private String name;
    private double gpa;
    public Student(String n, double g) {
        name = n;
        gpa = g;
    }
    public Student(String n) {
        name = n;
    }
    public String getName() { return name; }
    public double getGpa() { return gpa; }
    public int compareTo(Object obj) {
        Student other = (Student)obj;
//        if(gpa < other.gpa) {
//            return -1;
//        } else if(gpa > other.gpa) {
//            return 1;
//        } else {
//            return 0;
//        }
        return (other.name.compareTo(this.name));
    }
}
public class StudentTest {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("홍길동", 4.2);
        students[1] = new Student("이길동", 2.8);
        students[2] = new Student("김길동", 3.75);

//        Arrays.sort(students);
//        System.out.println("GPA 오름차순 출력");
//        for (Student s: students) {
//            System.out.println("이름 = "+s.getName()+", 평점 = "+s.getGpa());
//        }
        Arrays.sort(students);
        System.out.println("이름 오름차순 출력");
        for (Student s: students) {
            System.out.println("이름 = "+s.getName()+", 평점 = "+s.getGpa());
        }
    }
}
