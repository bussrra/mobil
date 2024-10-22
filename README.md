Java'da if-else yapısını kullanarak basit bir hesap makinesi uygulaması oluşturabilirsin. İşte bir örnek kod:

1. Main.java dosyasında şu şekilde bir kod yazabilirsin:



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan iki sayı al
        System.out.print("1. Sayıyı girin: ");
        double sayi1 = scanner.nextDouble();

        System.out.print("2. Sayıyı girin: ");
        double sayi2 = scanner.nextDouble();

        // İşlem seçimi
        System.out.println("İşlem Seçin: ");
        System.out.println("1 - Toplama");
        System.out.println("2 - Çıkarma");
        System.out.println("3 - Çarpma");
        System.out.println("4 - Bölme");
        System.out.print("Seçiminizi yapın: ");
        int secim = scanner.nextInt();

        // İşlemi gerçekleştir
        double sonuc = 0;
        boolean gecerliIslem = true;

        if (secim == 1) {
            sonuc = sayi1 + sayi2;
        } else if (secim == 2) {
            sonuc = sayi1 - sayi2;
        } else if (secim == 3) {
            sonuc = sayi1 * sayi2;
        } else if (secim == 4) {
            if (sayi2 != 0) {
                sonuc = sayi1 / sayi2;
            } else {
                System.out.println("Hata: Bölme işleminde ikinci sayı sıfır olamaz.");
                gecerliIslem = false;
            }
        } else {
            System.out.println("Hatalı seçim! Lütfen 1 ile 4 arasında bir sayı seçin.");
            gecerliIslem = false;
        }

        // Sonucu göster
        if (gecerliIslem) {
            System.out.println("Sonuç: " + sonuc);
        }

        scanner.close();
    }
}

Açıklama:

Kullanıcıdan iki sayı alınıyor ve ardından bir işlem seçmesi isteniyor.

if-else yapısı kullanılarak seçilen işleme göre aritmetik işlemler gerçekleştiriliyor.

Bölme işlemi için, ikinci sayının sıfır olup olmadığı kontrol ediliyor. Eğer sıfır ise hata mesajı gösteriliyor.

Geçersiz bir seçim yapıldığında kullanıcıya bilgi veriliyor.

Sonuç, işlem geçerli ise ekrana yazdırılıyor.


Bu kodu bir Java geliştirme ortamında (Eclipse, IntelliJ, veya NetBeans gibi) çalıştırarak basit bir konsol tabanlı hesap makinesi olarak kullanabilirsin.

