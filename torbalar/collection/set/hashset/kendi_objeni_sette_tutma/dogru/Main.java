package kendi_objeni_sette_tutma.dogru;

import java.util.HashSet;
import java.util.Set;

import kendi_objeni_sette_tutma.yanlis.Student2;

public class Main {
    public static void main(String[] args) {

        // burda aynı öğrenciyi tekrar listeye eklemez

        Student2 student = new Student2("Samet", 1);
        Student2 student2 = new Student2("Samet", 1);

        Set set = new HashSet();
        set.add(student);
        set.add(student2);

        System.out.println(set);
    }
}
