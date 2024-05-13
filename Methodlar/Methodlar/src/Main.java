public class Main {
    public static void main(String[] args) {
        System.out.println(topla(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }

    public static int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    public static int topla(int... sayilar) {
        int toplam = 0;
        for (int sayi : sayilar) {
            toplam += sayi;
        }
        return toplam;
    }
}

/*    public static void sayiBulmaca(int aranacakSayi) {
        int[] sayilar = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean varMi = false;
        for (int sayi : sayilar) {
            if (sayi == aranacakSayi) {
                varMi = true;
                break;
            }
        }
        if (varMi) {
            mesajVer("Sayı bulundu" + aranacakSayi);
        } else {
            mesajVer("Sayı bulunamadı");
        }
    }

    public static void mesajVer(String message) {
        System.out.println(message);
    }*/