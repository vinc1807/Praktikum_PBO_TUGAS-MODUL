package com.vincent.tugasmodul2.No1;

public class DemoClass {
        public DemoClass() {
        }

        public static void main(String[] args) {
            Class se = new Class();
            Class nama = new Class("Institut Teknologi Telkom Purwokerto");
            Class jurusan = new Class("Software Engineering", "Angkatan 2019");
            Class club = new Class("Iptek", 2016, "IOT 501");
            Class volly = new Class("Volly Putra", 2017, "Wisma Olahraga", 1, "Volly Putra Institut Teknologi Telkom Purwokerto");
            se.getTeam();
            System.out.println();
            nama.getTeam();
            System.out.println();
            jurusan.getTeam();
            System.out.println();
            club.getTeam();
            System.out.println();
            volly.getTeam();
            System.out.println();
        }

}

