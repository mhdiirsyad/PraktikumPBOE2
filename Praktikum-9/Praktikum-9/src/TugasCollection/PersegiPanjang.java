/*Nama file	: PersegiPanjang.java
* Deskripsi	: SUbclass persegi panjang dari kelas BangunDatar
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 10-05-2025
*/

package TugasCollection;

public class PersegiPanjang extends BangunDatar{
    private double panjang;
    private double lebar;

    public PersegiPanjang(double lebar, double panjang) {
        this.lebar = lebar;
        this.panjang = panjang;
    }

    @Override
    public double hitungKeliling() {
        return 2*(panjang + lebar);
    }

    @Override
    public double hitungLuas() {
        return panjang*lebar;
    }
}
