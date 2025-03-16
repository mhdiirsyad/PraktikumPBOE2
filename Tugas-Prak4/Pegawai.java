/*Nama file	: Pegawai.java
* Deskripsi	: atribut dan metode untuk mengelola data pegawai
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 16-03-2025
*/

//Mengimport library
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Pegawai {
    /*ATRIBUT */
    private String NIP;
    private String nama;
    private String tanggalLahir;
    private String TMT;
    private double gajiPokok;
    private String jabatan;

    /*METODE */
    //Konstruktor
    public Pegawai() {
    }

    public Pegawai(String NIP, String nama, String tanggalLahir, String TMT, double gajiPokok, String jabatan) {
        this.NIP = NIP;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.TMT = TMT;
        this.gajiPokok = gajiPokok;
        this.jabatan = jabatan;
    }

    //Setter
    //Mengeset NIP 
    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    //Mengeset nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    //Mengeset tanggal Lahir
    public void setTglLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    //Mengeset TMT
    public void setTMT(String TMT) {
        this.TMT = TMT;
    }

    //Mengeset gaji pokok
    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    //Mengeset jabatan
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    //Getter
    //Mengembalikan NIP pegawai
    public String getNIP() {
        return NIP;
    }

    //Mengembalikan nama pegawai
    public String getNama() {
        return nama;
    }

    //Mengembalikan Tanggal lahir pegawai
    public String getTanggalLahir() {
        return tanggalLahir;
    }

    //Mengembalikan TMT pegawai
    public String getTMT() {
        return TMT;
    }

    //Mengembalikan gaji pokok pegawai
    public double getGajiPokok() {
        return gajiPokok;
    }

    //Mengembalikan jabatan pegawai
    public String getJabatan() {
        return jabatan;
    }

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM uuuu", Locale.forLanguageTag("id")); //Membuat format tanggal
    //Mengembalikan masa kerja pegawai
    public Period getMasaKerja(){
        LocalDate TMTdate = LocalDate.parse(TMT, formatter);
        Period masaKerja = Period.between(TMTdate, LocalDate.now());
        return masaKerja;
    }

    NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID")); //Membuat format rupiah

    //Mencetak info pegawai
    public void printInfo() {
        System.out.println("NIP\t\t\t : " + this.NIP);
        System.out.println("Nama \t\t\t : " + this.nama);
        System.out.println("Tanggal Lahir\t\t : " + this.tanggalLahir);
        System.out.println("TMT\t\t\t : " + this.TMT);
        System.out.println("Jabatan\t\t\t : " + this.jabatan);
        System.out.println("Masa Kerja\t\t : "+getMasaKerja().getYears()+" Tahun "+getMasaKerja().getMonths()+" Bulan");
        System.out.println("Gaji Pokok\t\t : " + formatRupiah.format(gajiPokok));
    }
}
