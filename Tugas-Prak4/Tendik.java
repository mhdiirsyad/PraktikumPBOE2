/*Nama file	: Tendik.java
* Deskripsi	: atribut dan metode untuk mengelola data tenaga kependidikan (subclass dari Pegawai)
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 16-03-2025
*/

import java.time.LocalDate; //Mengimport library LocalDate
public class Tendik extends Pegawai {
    /*ATRIBUT */
    private String bidang;

    /*METODE */
    //Konstruktor
    public Tendik() {
    }

    public Tendik(String NIP, String nama, String tanggalLahir, String TMT, double gajiPokok, String bidang) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok, "Tenaga Kependidikan (Tendik)");
        this.bidang = bidang;
    }

    //Setter
    //Mengeset bidang tendik
    public void setBidang(String bidang) {
        this.bidang = bidang;
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
        System.out.println("Bidang \t\t\t : " + this.bidang);
        System.out.println("BUP \t\t\t : " + this.getBUP());
        System.out.println("Tunjangan \t\t : 1% x " + this.getMasaKerja().getYears() + " x " + formatRupiah.format(getGajiPokok()) + " = " + formatRupiah.format(this.getTunjangan()));
    }
    /*ENDCLASS TENDIK */
}
