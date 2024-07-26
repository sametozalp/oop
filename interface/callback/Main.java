package callback;

public class Main {
    public static void main(String[] args) {

        // Callback mantığı bu şekilde..
        
        ActionListener listener = new TimePrinter();
        listener.listen();
    }
}
