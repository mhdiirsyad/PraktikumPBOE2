/*Nama file	: ContohMetodeGenerik.java
* Deskripsi	: class contoh penggunaan metode generik
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 02-05-2025
*/

package Tugas;

public class ContohMetodeGenerik {
    public <T1 extends Anabul> T1 getData(Datum<T1> data) {
        return data.getIsi();
    }

    public <T1 extends Anabul> void setData(Datum<T1> data, T1 isi) {
        data.setIsi(isi);
    }

    public <T1 extends Anabul> void procGerak(Datum<T1> data) {
        data.getIsi().Gerak();
    }

    public <T1 extends Anabul> void procBersuara(Datum<T1> data) {
        data.getIsi().Bersuara();
    }
}
