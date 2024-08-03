public class YanlisKullanim {

    // Main'de throws Throwable yazarsak bunu kim yakalayacak ? Bütün throwable nesneleri yakalanmalıdır (istisnalar olabilir.).
    public static void main(String[] args) throws Throwable {
        YanlisKullanim yanlisKullanim = new YanlisKullanim();
        yanlisKullanim.doThis(); // yakalamak istiyorsak try-catch kullanmalıyız.
    }

    public void doThis() throws Throwable {
        doThat();
    }

    public void doThat() throws Throwable {
        Throwable throwable = new Throwable("hata mesajı");
        throw throwable;
    }
}
