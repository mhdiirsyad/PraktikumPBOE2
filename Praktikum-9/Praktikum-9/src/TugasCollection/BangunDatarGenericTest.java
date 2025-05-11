/*Nama file	: BangunDatarGenericTest.java
* Deskripsi	: Main program kelas generik BangunDatar
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 10-05-2025
*/

package TugasCollection;

import java.util.ArrayList;

public class BangunDatarGenericTest {
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran(2);
        Persegi p = new Persegi(5);
        PersegiPanjang pp = new PersegiPanjang(2, 5);
        Segitiga s = new Segitiga(3, 5, 4, 4);

        BangunDatarGeneric<BangunDatar> bdg = new BangunDatarGeneric<>();
        ArrayList<BangunDatar> Lbdg = new ArrayList<>();
        Lbdg.add(l);
        Lbdg.add(p);
        Lbdg.add(pp);
        Lbdg.add(s);

        for (BangunDatar bd : Lbdg) {
            bdg.set(bd);
            System.out.println("Tipe genric: " + bd.getClass().getName());
            System.out.println("Keliling: " + bd.hitungKeliling());
            System.out.println("Luas: " + bd.hitungLuas());
            System.out.println();
        }
    }
}
