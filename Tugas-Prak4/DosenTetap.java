import java.time.LocalDate;

public class DosenTetap extends Dosen {
    /*ATRIBUT */
    private String NIDN;

    /*METODE */
    //Konstruktor
    public DosenTetap() {
    }

    public DosenTetap(String NIP, String nama, String tanggalLahir, String TMT, double gajiPokok, String fakultas, String NIDN) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok, "Dosen Tetap", fakultas);
        this.NIDN = NIDN;
    }

    //Setter
    //Mengeset NIDN dosen tetap
    public void setNIDN(String NIDN) {
        this.NIDN = NIDN;
    }

    //getter
    //mengembalikan NIDN dosen 
    public String getNIDN() {
        return NIDN;
    }

    //Mengembalikan BUP 
    public String getBUP() {
        LocalDate lahirDate = LocalDate.parse(this.getTanggalLahir(), formatter);
        LocalDate BUP = lahirDate.plusYears(65).plusMonths(1);
        return BUP.format(formatter);
    }

    //Mengembalikan tunjangan Dosen
    public double getTunjangan() {
        int tahunKerja = this.getMasaKerja().getYears();
        double tunjangan = 0.02 * this.getGajiPokok() * tahunKerja;
        return tunjangan;
    }

    //Menampilkan info dosen tetap
    @Override
    public void printInfo() {
        System.out.println("======== Dosen Tetap ========");
        super.printInfo();
        System.out.println("NIDN\t\t\t : " + this.NIDN);
        System.out.println("BUP\t\t\t : " + this.getBUP());
        System.out.println("Tunjangan\t\t : 2% x " + this.getMasaKerja().getYears() + " x " + formatRupiah.format(getGajiPokok()) + " = " + formatRupiah.format(this.getTunjangan()));
    }
    /*ENDCLASS DOSENTETAP */
}
