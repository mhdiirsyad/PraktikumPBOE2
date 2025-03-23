/*Nama file	: MManusia.java
* Deskripsi	: Main Program manusia
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 23-03-2025
*/

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class MManusia {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.forLanguageTag("id"));
        NumberFormat rupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));

        //Object PNS
        LocalDate tglMulaiPNS = LocalDate.parse("01-04-2006", formatter); 
        PNS p1 = new PNS("Satriyo", tglMulaiPNS, "JL. Seroja", 15000000, "198302032006041002");

        //Object Pengusaha
        LocalDate tglMulaiPe = LocalDate.parse("01-01-2000", formatter);
        Pengusaha pe1 = new Pengusaha("Adhy", tglMulaiPe, "Jl.Air", 55000000, "000-556-773-212-000-5");
        
        //Object Petani
        LocalDate tglMulaiPt = LocalDate.parse("09-01-1977", formatter);
        Petani pt1 = new Petani("Nugraha", tglMulaiPt, "Jl. Bunga 9 Tembalang", 5000000, "Wonogiri");
        
        //Object PNS 2
        LocalDate tglMulaiP2 = LocalDate.parse("09-01-1977", formatter);
        PNS p2 = new PNS("Panji", tglMulaiP2, null, 10000000, "198004212010041002");

        //set alamat p2
        p2.setAlamat("Jl. Panorama 111 Tembalang");

        //detail Jumlah object
        System.out.println("Jumlah Manusia = "+Manusia.getCountMns());
        System.out.println("Jumlah PNS = "+ PNS.getCountPNS());
        System.out.println("Jumlah Pengusaha = "+Pengusaha.getCounterPengusaha());
        System.out.println("Jumlah Petani = "+Petani.getCounterPetani());
        System.out.println();

        //Pajak tiap object
        System.out.println("Pajak PNS p1 = "+rupiah.format(p1.hitungPajak()));
        System.out.println("Pajak Pengusaha pe1 = "+rupiah.format(pe1.hitungPajak()));
        System.out.println("Pajak Petani pt1 = "+rupiah.format(pt1.hitungPajak()));
        System.out.println();

        //Masa Kerja tiap object
        System.out.println("Masa Kerja p1 = "+p1.hitungMasaKerja()+" Bulan");
        System.out.println("Masa Kerja pe1 = "+pe1.hitungMasaKerja()+" Bulan");
        System.out.println("Masa Kerja pt1 = "+pt1.hitungMasaKerja()+" Bulan");
        System.out.println();

        //Detail info tiap object
        System.out.println("Info PNS p1: ");
        p1.cetakInfo();
        System.out.println();
        System.out.println("Info Pengusaha pe1: ");
        pe1.cetakInfo();
        System.out.println();
        System.out.println("Info Petani pt1: ");
        pt1.cetakInfo();
    }
}
