/*Nama file	: Manusia.java
* Deskripsi	: atribut dan metode kelas abstrak manusia
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 23-03-2025
*/

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;

public abstract class Manusia {
    //ATRIBUT
    protected String nama;
    protected LocalDate tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns;

    //METODE
    //konstruktor
    protected Manusia(){
        counterMns++;
    }

    protected Manusia(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan){
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    //Mutator
    //Mengeset nama 
    public void setNama(String nama){
        this.nama = nama;
    }

    //Mengeset tgl_mulai_kerja
    public void setTgl_Mulai_kerja(LocalDate tgl_mulai_kerja){
        this.tgl_mulai_kerja = tgl_mulai_kerja;
    }

    //Mengeset alamat
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    //Mengeset pendapatan
    public void setPendapatan(double pendapatan){
        this.pendapatan = pendapatan;
    }

    //Selektor
    //Mengembalikan nama 
    public String getNama() {
        return nama;
    }

    //Mengembalikan tgl_mulai_kerja 
    public LocalDate getTgl_Mulai_Kerja(){
        return tgl_mulai_kerja;
    }

    //mengembalikan alamat
    public String getAlamat(){
        return alamat;
    }

    //Mengembalikan pendapatan
    public double getPendapatan(){
        return pendapatan;
    }

    //Mengembalikan jumlah manusia
    static int getCountMns(){
        return counterMns;
    }

    NumberFormat rupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
    //Menampilkan info manusia
    public void cetakInfo(){
        System.out.println("Nama\t\t: "+nama);
        System.out.println("Mulai Kerja\t: "+tgl_mulai_kerja);
        System.out.println("Alamat\t\t: "+alamat);
        System.out.println("Pendapatan\t: "+rupiah.format(pendapatan));
    }

    //Metode abstrak mengembalikan masakerja
    public abstract int hitungMasaKerja();

    //endclass manusia
}