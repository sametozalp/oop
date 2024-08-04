package Lambda;

public class App {

    // Lambda
    /*
     * Arayüzde tek fonksiyon olmalı ve @FunctionalInterface olarak işaretlenmeli.
     */
    public static void main(String[] args) throws Exception {
        MyInterface myInterface = (int i) -> System.out.println(i * i);
        myInterface.f(5); // 25
    }
}
