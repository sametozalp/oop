package SiradisiDurumNesnesiOlusturmak;

public class MyException extends Exception {
    private double argument;

    public MyException(String message, double argument) {
        super(message);
        this.argument = argument;
    }

    public MyException(String message) {
        super(message);

    }

    public double getArgument() {
        return argument;
    }

    public void setArgument(double argument) {
        this.argument = argument;
    }
}