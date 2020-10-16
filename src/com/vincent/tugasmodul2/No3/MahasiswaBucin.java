package com.vincent.tugasmodul2.No3;

public class MahasiswaBucin {
    public String nama;
    public String status;
    public int semester;

    public MahasiswaBucin(String nama, String status, int semester) {
        this.nama = nama;
        this.status = status;
        this.semester = semester;
    }

    public void getStatus() {
        System.out.println("Status Mahasiswa\t: " + status);
    }
}
