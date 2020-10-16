package com.vincent.tugasmodul2.No1;

public class Class {
    public String nama;
    public int tahunBerdiri;
    public String stadion;
    public int juaraUcl;
    public String deskripsi;

    public Class() {
    }

    public Class(String nama) {
        this.nama = nama;
    }

    public Class(String nama, String deskripsi) {
        this.nama = nama;
        this.deskripsi = deskripsi;
    }

    public Class(String nama, int tahunBerdiri, String stadion) {
        this.nama = nama;
        this.tahunBerdiri = tahunBerdiri;
        this.stadion = stadion;
    }

    public Class(String nama, int tahunBerdiri, String stadion, int juaraUcl, String deskripsi) {
        this.nama = nama;
        this.tahunBerdiri = tahunBerdiri;
        this.stadion = stadion;
        this.juaraUcl = juaraUcl;
        this.deskripsi = deskripsi;
    }

    public void getTeam() {
        if (this.nama == null) {
            System.out.println("Nama \t\t: TEST RED");
        } else {
            System.out.println("Nama \t\t: " + this.nama);
        }

        if (this.deskripsi == null) {
            System.out.println("Deskripsi \t: TEST YELLOW");
        } else {
            System.out.println("Deskripsi \t: " + this.deskripsi);
        }

        if (this.tahunBerdiri == 0) {
            System.out.println("Tahun Berdiri\t: TEST PURPLE");
        } else {
            System.out.println("Tahun Berdiri\t: " + this.tahunBerdiri);
        }

        if (this.stadion == null) {
            System.out.println("Stadion \t: TEST GREEN");
        } else {
            System.out.println("Stadion \t: " + this.stadion);
        }

        if (this.juaraUcl == 0) {
            System.out.println("Juara UCL\t\t: TEST WHITE");
        } else {
            System.out.println("Juara UCL\t\t: " + this.juaraUcl);
        }
    }
}
