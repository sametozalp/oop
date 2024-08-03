package CheckedAndUncheckedException;

public class CheckedAndUncheckedException {
    public static void main(String[] args) {
        // Checked Exception: Yönetilmek zorundadır. Ya throw fırlatırsın ya try-catck
        // kullanırsın.
        /*
         * Exception sınıfının alt sınıfı olup da RuntimeException olmayan sınıflar
         * Checked Exception olarak adlandırılır.
         */

        // Unchecked Exception: Yönetilmek zorunda değildir.
        /*
         * RuntimeException ve alt sınıfları ise Unchecked Exception'dır. (Error sınıfı
         * da buna dahildir.)
         * Unchecked Exceptionlar programcı hatasıdır, düzeltilmelidir.
         */
    }
}