package kendi_objeni_sette_tutma.dogru;

public class Student {
    private String name;
    private int no;

    public Student(String name, int no) {
        this.name = name;
        this.no = no;
    }

    @Override
    public int hashCode() {
        return no;
    }

    @Override
    public boolean equals(Object obj) {
        Student student = (Student) obj;
        if (no != student.no)
            return false;
        return true;
    }
}
