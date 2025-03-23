/*Nama file	: Petani.java
* Deskripsi	: Atribut dan metode class petani
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 23-03-2025
*/

import java.time.LocalDate;
import java.time.Period;

public class Petani extends Manusia implements Pajak{
    //ATRIBUT
    protected String asal_kota;
    protected static int counterPetani;

    //METODE
    //Konstruktor
    public Petani(){
        counterPetani++;
    }

    public Petani(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    //Mutator
    //mengeset asal_kota petani
    public void setAsal_kota(String asal_kota){
        this.asal_kota = asal_kota;
    }

    //Selektor
    //mengembalikan asal_kota petani
    public String getAsal_kota(){
        return asal_kota;
    }

    //Mengembalikan counterPetani
    static int getCounterPetani(){
        return counterPetani;
    }

    //Implementasi metode abstrak hitungMasaKerja
    @Override
    public int hitungMasaKerja(){
        Period masaKerja = Period.between(tgl_mulai_kerja, LocalDate.now());
        return (masaKerja.getYears()*12+masaKerja.getMonths());
    }

    //Implementasi interface pajak
    @Override
    public double hitungPajak(){
        return 0;
    }

    //Mencetak Info petani
    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Asal Kota\t: "+asal_kota);
        System.out.println("Masa Kerja\t: "+hitungMasaKerja()+" Bulan");
        System.out.println("Pajak\t\t: "+rupiah.format(hitungPajak()));
    }
}
