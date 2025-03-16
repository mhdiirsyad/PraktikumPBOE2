import java.time.LocalDate;
public class DosenTamu extends Dosen {
    /*ATRIBUT */
    private String NIDK;
    private int masaKontrak;

    /*METODE */
    //Konstruktor
    public DosenTamu() {
    }

    public DosenTamu(String NIP, String nama, String tanggalLahir, String TMT, double gajiPokok, String jabatan, String fakultas, String NIDK, int masaKontrak) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok, jabatan, fakultas);
        this.NIDK = NIDK;
        this.masaKontrak = masaKontrak;
    }

    //Mengeset NIDK dosen tamu
    public void setNIDK(String NIDK) {
        this.NIDK = NIDK;
    }

    //Mengembalikan NIDK dosen tamu
    public String getNIDK() {
        return NIDK;
    }

    //Mengeset masa kontrak kerja
    public void setMasaKontrak(int masaKontrak) {
        this.masaKontrak = masaKontrak;
    }

    //Mengembalikan Masa kontrak kerja
    public int getMasaKontrak() {
        return masaKontrak;
    }

    //Mengembalikan tanggal berakhir kontrak
    public String getEndKontrak() {
        LocalDate endKontrak = LocalDate.now().plusMonths(masaKontrak);
        return endKontrak.format(formatter);
    }

    //Menampilkan tunjangan dosen tamu
    public double getTunjangan() {
        double tunjangan = 0.025 * this.getGajiPokok();
        return tunjangan;
    }

    //Menampilkan info dosen tamu
    @Override
    public void printInfo() {
        System.out.println("======== Dosen Tamu ========");
        super.printInfo();
        System.out.println("NIDK \t\t\t : " + this.NIDK);
        System.out.println("Masa Kontrak \t\t : " + this.masaKontrak + " bulan");
        System.out.println("Tanggal Berakhir Kontrak : " + this.getEndKontrak());
        System.out.println("Tunjangan \t\t : 2,5% x " + formatRupiah.format(getGajiPokok()) + " = " + formatRupiah.format(this.getTunjangan()));
    }


    /*ENDCLASS DOSENTAMU */
}
