package com.vincent.tugasmodul2.No2;


    public class Burung extends Binatang {
        public String nama;

        public Burung(String nama) {
            this.nama = nama;
        }

        public void getNama() {
            System.out.println("Nama Binatang\t: " + this.nama);
        }

        public void terbang() {
            System.out.println("Binatang ini terbang");
        }
    }

