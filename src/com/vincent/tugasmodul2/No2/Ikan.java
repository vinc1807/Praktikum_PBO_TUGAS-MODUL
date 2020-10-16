package com.vincent.tugasmodul2.No2;


    public class Ikan extends Binatang {
        public String nama;

        public Ikan(String nama) {
            this.nama = nama;
        }

        public void getNama() {
            System.out.println("Nama Binatang\t: " + this.nama);
        }

        public void berenang() {
            System.out.println("Binatang ini berenang");
        }
    }

