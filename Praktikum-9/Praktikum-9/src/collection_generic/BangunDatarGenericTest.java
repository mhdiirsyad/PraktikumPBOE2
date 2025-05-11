/*Nama file	: BangunDatarGenericTest.java
* Deskripsi	: Main program untuk menguji kelas BangunDatargeneric
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 10-05-2025
*/

package collection_generic;

public class BangunDatarGenericTest {
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<>();
        bdg.set(l);
        System.out.println("Keliling Lingakran: "+bdg.hitungKeliling());
        System.out.println("Tipe genric: "+bdg.getClass().getName());
    }
}
