/*Nama file	: DosenTamu.java
* Deskripsi	: atribut dan metode untuk mengelola data dosen tamu (subclass dari Dosen)
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 16-03-2025
*/

//Mengimport library
import java.time.LocalDate;
import java.time.Period;

public class DosenTamu extends Dosen {
    /*ATRIBUT */
    private String NIDK;
    private String tglAkhirKontrak;

    /*METODE */
    //Konstruktor
    public DosenTamu() {
    }

    public DosenTamu(String NIP, String nama, String tanggalLahir, String TMT, double gajiPokok, String fakultas, String NIDK, String tglAkhirKontrak) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok, "Dosen Tamu", fakultas);
        this.NIDK = NIDK;
        this.tglAkhirKontrak = tglAkhirKontrak;
    }

    //Mengeset NIDK dosen tamu
    public void setNIDK(String NIDK) {
        this.NIDK = NIDK;
    }

    //Mengembalikan NIDK dosen tamu
    public String getNIDK() {
        return NIDK;
    }

    //Mengeset tanggal akhir kontrak
    public void setTglAkhirKontrak(String tglAkhirKontrak) {
        this.tglAkhirKontrak = tglAkhirKontrak;
    }

    //Mengembalikan tanggal akhir kontrak
    public String getTglAkhirKontrak() {
        return tglAkhirKontrak;
    }

    //Mengembalikan masa kontrak
    public int getMasaKontrak() {
        LocalDate dateAkhir = LocalDate.parse(this.tglAkhirKontrak, formatter);
        Period masaKontrak = Period.between(LocalDate.now(), dateAkhir);
        return masaKontrak.getMonths();
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
        System.out.println("Masa Kontrak \t\t : " + this.getMasaKontrak() + " bulan");
        System.out.println("Tanggal Berakhir Kontrak : " + this.tglAkhirKontrak);
        System.out.println("Tunjangan \t\t : 2,5% x " + formatRupiah.format(getGajiPokok()) + " = " + formatRupiah.format(this.getTunjangan()));
    }


    /*ENDCLASS DOSENTAMU */
}
