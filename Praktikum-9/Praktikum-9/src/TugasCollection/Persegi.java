/*Nama file	: Persegi.java
* Deskripsi	: Subclass persegi dari kelas BangunDatar
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 10-05-2025
*/

package TugasCollection;

public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungKeliling() {
        return 4*sisi;
    }

    @Override
    public double hitungLuas() {
        return sisi*sisi;
    }
}
