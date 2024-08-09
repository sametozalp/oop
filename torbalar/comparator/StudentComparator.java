import java.util.Comparator;

public class StudentComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Student s = (Student) o1;
        Student s1 = (Student) o2;
        if (s.getAge() < s1.getAge())
            return -1;
        else if (s.getAge() == s1.getAge())
            return 0;
        else
            return 1;
    }
    
}
