import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Samet", 15);
        Student s1 = new Student("Ahmet", 22);

        int result = s.compareTo(s1);
        System.out.println(result);

        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s);

        Collections.sort(list); // sıralar
    }
}
