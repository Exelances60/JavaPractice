public class Main {
    public static void main(String[] args) {
        KrediUI krediUI = new KrediUI();
        double ogretmenTutar = krediUI.krediHesapla(new OgretmenKrediManager(), 1000);
        double tarimTutar = krediUI.krediHesapla(new TarimKrediManager(), 500);
        System.out.println(ogretmenTutar);
        System.out.println(tarimTutar);
    }
}