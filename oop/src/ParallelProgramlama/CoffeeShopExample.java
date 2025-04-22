package ParallelProgramlama;

import java.util.concurrent.*;
import java.util.*;

public class CoffeeShopExample {

    public static void main(String[] args) {
        // 3 işçiden oluşan bir patron (thread havuzu)
        ExecutorService patron = Executors.newFixedThreadPool(3);

        // Runnable görev – sadece iş yapar, sonuç dönmez
        Runnable suGotur = () -> System.out.println(Thread.currentThread().getName() + " - Su masaya götürüldü.");

        // Callable görev – iş yapar ve sonuç döner
        Callable<String> kahveYap = () -> {
            System.out.println(Thread.currentThread().getName() + " - Kahve hazırlanıyor...");
            Thread.sleep(1000); // biraz bekletelim
            return "Kahve hazır (120 kalori)";
        };

        // Runnable'ı çalıştır (sonuç istemiyoruz)
        patron.submit(suGotur);

        // Callable'ı çalıştır ve sonucu sonradan al
        Future<String> sonuc = patron.submit(kahveYap);

        try {
            System.out.println("Garsondan kahve bekleniyor...");
            String cevap = sonuc.get(); // burası bekler, kahve hazır olunca devam eder
            System.out.println("Garson dedi ki: " + cevap);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // invokeAll örneği: birden fazla callable görevi aynı anda çalıştır
        List<Callable<String>> tumKahveler = Arrays.asList(
                () -> "Espresso hazır (80 kalori)",
                () -> "Latte hazır (150 kalori)",
                () -> "Cappuccino hazır (130 kalori)"
        );

        try {
            System.out.println("Birden fazla kahve siparişi verildi...");
            List<Future<String>> cevaplar = patron.invokeAll(tumKahveler);
            for (Future<String> cevap : cevaplar) {
                System.out.println("Garsondan geldi: " + cevap.get());
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        patron.shutdown(); 
    }
}
