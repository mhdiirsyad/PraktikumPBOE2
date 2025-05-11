/*Nama file	: BangunDatarGeneric.java
* Deskripsi	: Kelas generik BangunDatar
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 10-05-2025
*/

package collection_generic;

public class BangunDatarGeneric <T extends BangunDatar>{
    private T bangunDatar;

    public T get() {
        return bangunDatar;
    }

    public void set(T bangunDatar) {
        this.bangunDatar = bangunDatar;
    }

    public double hitungKeliling() {
        return bangunDatar.hitungKeliling();
    }
}
