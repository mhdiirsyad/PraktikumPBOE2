/*Nama file	: Segitiga.java
* Deskripsi	: SUbclass segitiga dari kelas BangunDatar
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 10-05-2025
*/

package TugasCollection;

public class Segitiga extends BangunDatar{
    private double alas;
    private double tinggi;
    private double sisi1;
    private double sisi2;

    public Segitiga(double alas, double sisi1, double sisi2, double tinggi) {
        this.alas = alas;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungKeliling() {
        return sisi1 + sisi2 + alas;
    }

    @Override
    public double hitungLuas() {
        return (alas*tinggi)/2;
    }
}
