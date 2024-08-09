public class Student implements Comparable {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        Student s = (Student) o;
        if (age < s.age)
            return -1;
        else if (age == s.age)
            return 0;
        else
            return 1;
    }
}