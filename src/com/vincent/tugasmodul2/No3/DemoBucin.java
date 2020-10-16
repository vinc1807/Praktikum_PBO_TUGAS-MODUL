package com.vincent.tugasmodul2.No3;

import java.io.*;

public class DemoBucin {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bfr = new BufferedReader(isr);
        String nama, status;
        int semester;

        System.out.print("Nama Mahasiswa\t: ");
        nama = bfr.readLine();

        System.out.print("Status Mahasiswa\t: ");
        status = bfr.readLine();

        System.out.print("Semester\t: ");
        semester = Integer.parseInt(bfr.readLine());

        MahasiswaBucin mhs = new MahasiswaBucin(nama, status, semester);
        mhs.getStatus();
        System.out.println();

        String namaPacar;
        String lamaHubungan;

        System.out.print("Nama Pacar\t: ");
        namaPacar = bfr.readLine();

        System.out.print("Lama Hubungan\t: ");
        lamaHubungan = bfr.readLine();

        MahasiswaBucin pcr = new Pacar(nama, status, semester, namaPacar, lamaHubungan);
        pcr.getStatus();
    }
}
