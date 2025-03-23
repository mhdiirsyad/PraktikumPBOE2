/*Nama file	: Pengusaha.java
* Deskripsi	: Atribut dan metode class pengusaha
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 23-03-2025
*/

import java.time.LocalDate;
import java.time.Period;

public class Pengusaha extends Manusia implements Pajak {
    //ATRIBUT
    protected String npwp;
    protected static int counterPengusaha;

    //METODE
    //konstruktor
    public Pengusaha(){
        counterPengusaha++;
    }

    public Pengusaha(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String npwp){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    //Mutator
    //Mengeset npwp pengusaha
    public void setNpwp(String npwp){
        this.npwp = npwp;
    }

    //Selektor
    //Mengembalikan npwp pengusaha
    public String getNpwp(){
        return npwp;
    }

    //Mengembalikan banyaknya pengusaha
    static int getCounterPengusaha(){
        return counterPengusaha;
    }

    //Implementasi metode abstrak hitung masa kerja pengusaha
    @Override
    public int hitungMasaKerja(){
        Period masaKerja = Period.between(tgl_mulai_kerja, LocalDate.now());
        return (masaKerja.getYears()*12+masaKerja.getMonths()+8);
    }

    //Implementasi interface pajak
    @Override
    public double hitungPajak(){
        return 0.15 * getPendapatan();
    }

    //Mencetak info pengusaha
    @Override
    public void cetakInfo(){
        System.out.println("NPWP\t\t: "+npwp);
        super.cetakInfo();
        System.out.println("Masa Kerja\t: "+hitungMasaKerja()+" Bulan");
        System.out.println("Pajak\t\t: 15% x "+rupiah.format(getPendapatan())+" = "+rupiah.format(hitungPajak()));
    }

    //end class pengusaha
}

