package com.vincent.tugasmodul2.No2;

public class DemoBinatang {
    public DemoBinatang() {
    }

    public static void main(String[] args) {
        Binatang superclas = new Binatang();
        System.out.println("Superclass = ");
        superclas.Makan("Tokek");
        superclas.Tidur("Tokek");
        System.out.println();
        System.out.println("Subclass 1 =");
        Ikan subclas1 = new Ikan("Ikan");
        subclas1.getNama();
        subclas1.berenang();
        subclas1.Makan(subclas1.nama);
        subclas1.Tidur(subclas1.nama);
        System.out.println();
        System.out.println("Subclass 2 =");
        Burung subclas2 = new Burung("Burung");
        subclas2.getNama();
        subclas2.terbang();
        subclas2.Makan(subclas2.nama);
        subclas2.Tidur(subclas2.nama);
        System.out.println();
        System.out.println("Subclass 3 =");
        Kucing subclas = new Kucing("Kucing");
        subclas.getNama();
        subclas.meong();
        subclas.Makan(subclas.nama);
        subclas.Tidur(subclas.nama);
    }
}
