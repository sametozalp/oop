import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Samet", 15);
        Student s1 = new Student("Ahmet", 22);

        Comparator<Student> c = new StudentComparator();
        int result = c.compare(s, s1);

        Comparator<Student> c2 = c.reversed();
        c2.compare(s, s1); // ters sıralamsını verir objeden dolayı
        System.out.println(result);

        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s);

        Collections.sort(list, c); // sıralar
    }
}
