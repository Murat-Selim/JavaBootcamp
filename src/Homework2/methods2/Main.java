package Homework2.methods2;

public class Main {
    public static void main(String[] args) {
        String mesaj = "Merhaba Dunya!";
        System.out.println(mesaj);
        
        String yeniMesaj = sehir();
        System.out.println(yeniMesaj);
        int toplam = topla(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(toplam);
    }

    public static int topla(int... sayilar) {
        int toplam = 0;
        for (int sayi : sayilar) {
            toplam += sayi;
        }
        return toplam;
    }

    public static void add() {
        System.out.println("eklendi");
    }

    public static void delete() {
        System.out.println("silindi");
    }

    public static void update() {
        System.out.println("guncellendi");
    }

    public static String sehir() {
        return "Istanbul";
    }


}
