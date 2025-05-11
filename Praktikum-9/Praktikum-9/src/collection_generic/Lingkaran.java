/*Nama file	: Lingkaran.java
* Deskripsi	: subclass Lingkaran dari kelas BangunDatar
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 10-05-2025
*/

package collection_generic;

public class Lingkaran extends BangunDatar {
    private double jejari;

    public Lingkaran(double jejari) {
        this.jejari = jejari;
    }

    
    @Override
    public double hitungKeliling() {
        return 2 * 3.14 * jejari;
    }
}
