/*Nama file	: PNS.java
* Deskripsi	: Atribut dan metode class PNS
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 23-03-2025
*/

import java.time.LocalDate;
import java.time.Period;

public class PNS extends Manusia implements Pajak {
    //ATRIBUT
    protected String nip;
    protected static int countPNS;

    //METODE
    //Konstruktor
    public PNS(){
        countPNS++;
    }

    public PNS(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String nip){
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        countPNS++;
    }

    //Mutator
    //Mengeset nip PNS
    public void setNip(String nip){
        this.nip = nip;
    }

    //Selektor
    //Mengembalikan nip PNS
    public String getNip(){
        return nip;
    }

    //Mengembalikan banyaknya PNS
    static int getCountPNS(){
        return countPNS;
    }
    //Implementasi metode abstrak hitungMasaKerja
    @Override
    public int hitungMasaKerja(){
        Period masaKerja = Period.between(tgl_mulai_kerja, LocalDate.now());
        return (masaKerja.getYears()*12+masaKerja.getMonths()+5);
    }
    
    @Override
    public double hitungPajak(){
        return 0.1*getPendapatan();
    }

    @Override
    public void cetakInfo(){
        System.out.println("NIP\t\t: "+nip);
        super.cetakInfo();
        System.out.println("Masa Kerja\t: "+hitungMasaKerja()+" Bulan");
        System.out.println("Pajak\t\t: 10% x "+rupiah.format(getPendapatan())+" = "+rupiah.format(hitungPajak()));
    }

    //END CLASS PNS
}
