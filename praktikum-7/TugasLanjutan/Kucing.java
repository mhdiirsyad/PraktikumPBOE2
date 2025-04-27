/*Nama file	: Kucing.java
* Deskripsi	: Kelas Kucing yang merupakan subclass dari Anabul
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 26-04-2025
*/

public class Kucing extends Anabul{
    // Constructor
    public Kucing(String Nama){
        super(Nama);
    }

    // Metode Gerak
    @Override
    public void Gerak(){
        System.out.println("Melata");
    }

    // Metode Bersuara
    @Override
    public void Bersuara(){
        System.out.println("Meong");
    }
}
