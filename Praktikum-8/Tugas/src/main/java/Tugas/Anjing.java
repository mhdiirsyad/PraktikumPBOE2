/*Nama file	: Anjing.java
* Deskripsi	: subclass dari Anabul yang merepresentasikan objek Anjing
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 02-05-2025
*/
package Tugas;

public class Anjing extends Anabul{

    public Anjing(String nama) {
        super(nama);
    }
    
    @Override
    public void Gerak(){
        System.out.println("Anjing bergerak dengan melata");
    }
    
    @Override
    public void Bersuara(){
        System.out.println("Anjing berbunyi Guk Guk");
    }
    
}
