/*Nama file	: Pegawai.java
* Deskripsi	: superclass Pegawai
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 24-04-2025
*/

public class Pegawai {
    private String nama;
    private int gajiPokok = 5000000;
    
    public Pegawai(){

    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tampilData(){
        System.out.println("Nama : "+nama+", Gaji Pokok : "+gajiPokok);
    }
}
