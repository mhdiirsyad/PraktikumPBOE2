public class MMahasiswa {
    public static void main(String[] args) {
        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
        MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);
        Mahasiswa M1 = new Mahasiswa("24060123130085", "Irsyad", "Informatika");
        Dosen D1 = new Dosen("123", "Irfan", "Informatika");
        Kendaraan K1 = new Kendaraan("K1", "Mobil");

        M1.setDosWali(D1);
        M1.setKendaraan(K1);
        M1.addMatKul(PBO);
        M1.addMatKul(MBD);

        M1.printDetailMhs();
        System.out.println("Jumlah matakuliah = " + M1.getjumMatkul());
        System.out.println("Jumlah SKS = " + M1.getjumSKS());
    }
}
