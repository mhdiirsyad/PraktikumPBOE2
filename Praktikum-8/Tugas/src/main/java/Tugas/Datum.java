/*Nama file	: Datum.java
* Deskripsi	: class generik Datum
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 02-05-2025
*/
package Tugas;

public class Datum <T1 extends Anabul>{
    private T1 isi;

    public T1 getIsi() {
        return isi;
    }

    public void setIsi(T1 isi) {
        this.isi = isi;
    }
    
    
}
