/*Nama file	: Anjing.java
* Deskripsi	: SUbclass anjing dari anabul
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 10-05-2025
*/

package Anabul;

public class Anjing extends Anabul{

    public Anjing(String nama) {
        super(nama);
    }
    
    @Override
    public void bersuara() {
        System.out.println("Anjing bersuara Guk- Guk");
    }

    @Override
    public void bergerak() {
        System.out.println("Anjing melata");
    }
}
