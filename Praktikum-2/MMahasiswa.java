/*Nama file     : MMahasiswa.java
 * Deskripsi    : main class mahasiswa
 * Pembuat      : Muhammad Irfan Irsyad / 24060123130085
 * Tanggal      : 01-03-2025
 */

public class MMahasiswa {
    public static void main(String[] args) {
        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
        MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);
        Mahasiswa M1 = new Mahasiswa("24060123130085", "Irsyad", "Informatika");
        Dosen D1 = new Dosen("123", "Irfan", "Informatika");
        Kendaraan K1 = new Kendaraan("K1", "Mobil");

        M1.setDosWali(D1); //Menambhakan dosen wali ke objek M1
        M1.setKendaraan(K1); //Menambhakna kendarasaan ke objek M1
        M1.addMatKul(PBO); //Menambahkan matkul PBO ke obje M1
        M1.addMatKul(MBD); //Menambahkan matkul MBD ke objek M1

        M1.printDetailMhs(); //Menampilkan detail mahasiswa
        System.out.println("Jumlah matakuliah = " + M1.getjumMatkul()); //menampilkan jumlah matkul yang diambil mahasiswa
        System.out.println("Jumlah SKS = " + M1.getjumSKS()); //Menampilkan jumlah sks yang diambil mahasiswa
    }
}
