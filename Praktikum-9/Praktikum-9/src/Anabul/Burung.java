/*Nama file	: Burung.java
* Deskripsi	: Subclass Burung dari Anabul
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 10-05-2025
*/

package Anabul;

public class Burung extends Anabul{
    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void bersuara() {
        System.out.println("Burung berbunyi cuit");
    }

    @Override
    public void bergerak() {
        System.out.println("Burung terbang");
    }
}
