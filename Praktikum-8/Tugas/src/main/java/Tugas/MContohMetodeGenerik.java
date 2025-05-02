/*Nama file	: MContohMetodeGenerik.java
* Deskripsi	: main class untuk menguji metode generik
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 02-05-2025
*/

package Tugas;

public class MContohMetodeGenerik {
    public static void main(String[] args) {
        ContohMetodeGenerik cmg = new ContohMetodeGenerik();
        Datum<Anabul> Anu = new Datum<>();

        Anjing A = new Anjing("Bob");
        cmg.setData(Anu, A);
        cmg.procGerak(Anu);
        cmg.procBersuara(Anu);
        System.out.println();

        Kucing K = new Kucing("Alpine");
        cmg.setData(Anu, K);
        cmg.getData(Anu).Gerak();
        cmg.procBersuara(Anu);
        System.out.println();

        Burung B = new Burung("Bubun");
        cmg.setData(Anu, B);
        cmg.procGerak(Anu);
        cmg.getData(Anu).Bersuara();
        System.out.println();

    }
}
