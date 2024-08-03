public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Yazılım karmaşıklığının 2 bileşeni vardır:
         * 1. Bileşen karmaşıklığı (Companent complexity)
         * 2. İlişkisel karmaşıklık (Coordinative """)
         */

        // Companent Complexity
        /*
         * Bir sistemin ayrı ayrı parçaları kendi işlerine odaklı olmalı (Single
         * responsibility).
         * Tek bir amaca - sorumluluğa odaklıdır.
         * Birliktelik => cohesion
         * Dışarıya karşı minimum ilgi..
         */

        // Bağımlılık (Coupling)
        /*
         * İlişkisel karmaşıklıkta bir iş böyle olabilmeli ki diğer iş şöyle olabilsin
         * bağlılığı vardır.
         * Bağımlılık literatürde dependency'dir.
         */

        /*
         * Data coumpling kaçmaya çalışıyoruz. (Yeni gelen durumlara göre else if
         * yazmak)
         * Alınan değer yerine daha soyut bir şey geçebilirsek (mesela interface
         * implementationlarına sahip olsak bir sınıf için) if else'lerden
         * kurtulabiliriz.
         */

    }
}
