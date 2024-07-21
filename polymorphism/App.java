public class App {
    public static void main(String[] args) throws Exception {

        // UPCASTING

        /*
         * Alt referansı üst referansa eşitlemektir.
         * 
         * Her zaman güvnelidir ama tam tersi değildir.
         *
         */

        /*
         * Polimorfizm sayesinde arayüz ile gerçekleştirmeyi ayırabiliriz.
         */

        // Kodu genel yazmak gerekiyor

        // ************************************************ //

        // Polimorfik metodlar
        /*
         * Bir metodun bir arayüzü olur ama birden fazla implementation'a sahip
         * olabilir.
         */

        // ************************************************ //

        // BINDING
        /*
         * Bizim gördüğümüz şeyi compilerda görür (statik bağlama). Biz göremiyorsak o
         * da göremez (dinamik bağlama).
         * 
         * final, static ve private statik bağlama şeklinde çalışır.
         */

        Parent parent = new Child1();
        parent.doIt();

        /*
         * Yukarıdaki örnekte parentın içindeki fonksiyon çağırılır çünkü fonksiyon
         * statictir ve referansı Parent'tir. Static olmasa child fonksiyonu
         * çağıırlırdı.
         */
    }
}
