public class MainPegawai{
    public static void main(String[] args) {
        // Pegawai P1 = new Pegawai();
        // Pegawai P2 = new Pegawai("1234", "Budi", "20 Juni 1980", "1 April 2010", 5000000);
        // P2.printInfo(); 
        // // Dosen D1 = new Dosen();
        // Dosen D2 = new Dosen("1234", "Budi", "20 Juni 1980", "1 April 2010", 5000000, "Lektor", "FILKOM");
        // D2.printInfo();
        DosenTetap DT1 = new DosenTetap();
        DosenTetap DT2 = new DosenTetap("1234", "Budi", "20 Juni 1980", "1 April 2010", 5000000, "Lektor", "FILKOM", "1234");
        DT2.printInfo();
        System.out.println("\n");
        DosenTamu DM1 = new DosenTamu();
        DosenTamu DM2 = new DosenTamu("1234", "Budi", "20 Juni 1980", "1 April 2010", 5000000, "Lektor", "FILKOM", "1234", 12);
        DM2.printInfo();
        System.out.println("\n");
        Tendik T1 = new Tendik();
        Tendik T2 = new Tendik("1234", "Budi", "20 Juni 1980", "1 April 2010", 5000000, "Staff", "Keuangan");
        T2.printInfo();
    }
}
