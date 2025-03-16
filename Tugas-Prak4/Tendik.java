import java.time.LocalDate;

public class Tendik extends Pegawai {
    /*ATRIBUT */
    private String jabatan;
    private String bidang;

    /*METODE */
    //Konstruktor
    public Tendik() {
    }

    public Tendik(String NIP, String nama, String tanggalLahir, String TMT, double gajiPokok, String jabatan, String bidang) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok);
        this.jabatan = jabatan;
        this.bidang = bidang;
    }

    //Setter
    //Mengeset jabatan tendik
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    //Mengeset bidang tendik
    public void setBidang(String bidang) {
        this.bidang = bidang;
    }

    //Getter
    //Mengembalikan jabatan tendik
    public String getJabatan() {
        return jabatan;
    }

    //Mengembalikan bidang tendik
    public String getBidang() {
        return bidang;
    }

    //mengembalikan BUP tendik
    public String getBUP() {
        LocalDate lahirDate = LocalDate.parse(this.getTanggalLahir(), formatter);
        LocalDate BUP = lahirDate.plusYears(50).plusMonths(1);
        return BUP.format(formatter);
    }

    //Mengembalikan tunjangan tendik
    public double getTunjangan() {
        double tunjangan = 0.01 * this.getGajiPokok() * this.getMasaKerja().getYears();
        return tunjangan;
    }

    //Menampilkan info tendik
    @Override
    public void printInfo(){
        System.out.println("======== Tendik ========");
        super.printInfo();
        System.out.println("Jabatan \t\t : " + this.jabatan);
        System.out.println("Bidang \t\t\t : " + this.bidang);
        System.out.println("BUP \t\t\t : " + this.getBUP());
        System.out.println("Tunjangan \t\t : 1% x " + this.getMasaKerja().getYears() + " x " + formatRupiah.format(getGajiPokok()) + " = " + formatRupiah.format(this.getTunjangan()));
    }
    /*ENDCLASS TENDIK */
}
