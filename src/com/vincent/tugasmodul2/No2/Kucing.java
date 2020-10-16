package com.vincent.tugasmodul2.No2;


    public class Kucing extends Binatang {
        public String nama;

        public Kucing(String nama) {
            this.nama = nama;
        }

        public void getNama() {
            System.out.println("Nama Binatang\t: " + this.nama);
        }

        public void meong() {
            System.out.println("Binatang ini bersuara 'Meong' ");
        }
    }

