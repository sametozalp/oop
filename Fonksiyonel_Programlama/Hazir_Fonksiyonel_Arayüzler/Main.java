package Hazir_Fonksiyonel_Arayüzler;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        // Function<T,R> arayüzünü kullanmak

        Function<Integer, Boolean> isEven = num -> num % 2 == 0; // çift mi
        System.out.println(isEven.apply(3));
        System.out.println(isEven.apply(4));
    }
}
