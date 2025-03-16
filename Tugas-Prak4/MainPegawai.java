/*Nama file	: MainPegawai.java
* Deskripsi	: program utama untuk menampilkan info pegawai
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 16-03-2025
*/

public class MainPegawai{
    public static void main(String[] args) {
        //Membuat objek DosenTetap
        DosenTetap dosenTetap = new DosenTetap("1234567890", "Budi", "1 Januari 1970", "28 Maret 2015", 5000000, "Fakultas Sains dan Matematika", "1234567890");
        dosenTetap.printInfo();
        System.out.println("\n");

        //Membuat objek Dosen Tamu
        DosenTamu dosenTamu = new DosenTamu("0987654321", "Andi", "31 Desember 1990", "5 April 2020", 3000000, "Fakultas Teknik", "0987654321", "31 Desember 2025");
        dosenTamu.printInfo();
        System.out.println("\n");

        //Membuat objek tendik
        Tendik tendik = new Tendik("0987654321", "Rudi", "3 Oktober 1987", "30 September 2010", 3000000, "Keuangan");
        tendik.printInfo();
    }
}
