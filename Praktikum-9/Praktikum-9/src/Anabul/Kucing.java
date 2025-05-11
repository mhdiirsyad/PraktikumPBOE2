/*Nama file	: Kucing.java
* Deskripsi	: Subclass Kucing dari Anabul
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 10-05-2025
*/

package Anabul;

public class Kucing extends Anabul{

    public Kucing(String nama) {
        super(nama);
    }
    
    @Override
    public void bersuara() {
        System.out.println("Kucing berbunyi Meong");
    }

    @Override
    public void bergerak() {
        System.out.println("Kucing melata");
    }
}
