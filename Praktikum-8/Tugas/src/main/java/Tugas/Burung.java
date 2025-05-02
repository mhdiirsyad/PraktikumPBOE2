/*Nama file	: Burung.java
* Deskripsi	: subclass dari Anabul yang merepresentasikan objek Burung
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 02-05-2025
*/
package Tugas;

public class Burung extends Anabul{

    public Burung(String nama) {
        super(nama);
    }
    
    @Override
    public void Gerak(){
        System.out.println("Burung bergerak dengan terbang");
    }
    
    @Override
    public void Bersuara(){
        System.out.println("Burung berbunyi cuit cuit");
    }
}
