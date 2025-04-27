/*Nama file	: Anabul.java
* Deskripsi	: Kelas Anabul : superclass dari Kucing, Anjing, dan Burung
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 26-04-2025
*/
public class Anabul {
    // Atribut
    private String Nama;

    // Constructor
    public Anabul(String Nama){
        this.Nama = Nama;
    }

    // Metode Untuk mendapatkan nama
    public String getNama(){
        return Nama;
    }

    // Metode Gerak
    public void Gerak(){
    }

    // Metode Bersuara
    public void Bersuara(){}
}
