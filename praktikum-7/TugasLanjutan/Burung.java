/*Nama file	: Burung.java
* Deskripsi	: Kelas Burung yang merupakan subclass dari Anabul
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 26-04-2025
*/

public class Burung extends Anabul {
    // Constructor
    public Burung(String Nama){
        super(Nama);
    }

    // Metode Gerak
    @Override
    public void Gerak(){
        System.out.println("Terbang");
    }

    // Metode Bersuara
    @Override
    public void Bersuara(){
        System.out.println("Cuit");
    }
}
