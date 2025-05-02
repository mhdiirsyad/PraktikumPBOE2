/*Nama file	: Kucing.java
* Deskripsi	: subkelas dari Anabul yang merepresentasikan objek Kucing
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 02-05-2025
*/
package Tugas;

public class Kucing extends Anabul{

    public Kucing(String nama) {
        super(nama);
    }
    
    @Override
    public void Gerak(){
        System.out.println("Kucing bergerak dengan melata");
    }
    
    @Override
    public void Bersuara(){
        System.out.println("Kucing berbunyi meong");
    }
    
}
