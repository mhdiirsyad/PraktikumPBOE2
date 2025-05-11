/*Nama file	: Manabul.java
* Deskripsi	: Main program anabul dengan menerapkan koleksi
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 10-05-2025
*/

package Anabul;
import Koleksi.Koleksi;
public class Manabul {
    public static void main(String[] args) {
        Koleksi<Anabul> koleksiAnabul = new Koleksi<>();
        String[] nama = {"Doggo", "Bob", "Bit", "Cassie", "Twibi", "Booba", "Mimi", "Elysia", "Agy", "Phai"};

        for (int i = 0; i < 10; i++) {
            int randomIndex = (int) (Math.random() * 3);
            switch (randomIndex) {
                case 0:
                    koleksiAnabul.add(new Anjing(nama[i]));
                    break;
                case 1:
                    koleksiAnabul.add(new Kucing(nama[i]));
                    break;
                case 2:
                    koleksiAnabul.add(new Burung(nama[i]));
                    break;
            }
        }

        System.out.println("Jumlah Anabul: " + koleksiAnabul.getSize());
        System.out.println("Daftar Anabul:");
        koleksiAnabul.showAll();
        System.out.println();
        for(int i = 0; i< koleksiAnabul.getSize(); i++) {
            System.out.println();
            Anabul ab = koleksiAnabul.getIsi(i);
            System.out.println("Nama: " + ab.getNama());
            ab.bergerak();
            ab.bersuara();
        }
    }
}
