/*Nama file	: MKoleksi.java
* Deskripsi	: Main program kelas koleksi
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 10-05-2025
*/

package Koleksi;

public class MKoleksi {
    public static void main(String[] args) {
        Koleksi<Character> koleksi = new Koleksi<>();
        for(char i = 'A'; i<='J'; i++) {
            koleksi.add(i);
        }

        System.out.println("Banyaknya elemen: "+ koleksi.getSize());
        System.out.print("Isi Koleksi: ");
        koleksi.showAll();
        System.out.println();
        
        /*Delete salah satu element */
        char de = koleksi.delete(8);
        System.out.println("Banyaknya elemen: "+ koleksi.getSize());
        System.out.print("Isi Koleksi: ");
        koleksi.showAll();
        System.out.println();
        System.out.println("Elemen terhapus: "+de);
        
        /*Edit elemen */
        koleksi.setIsi(3, 'X');
        System.out.println("Banyaknya elemen: "+ koleksi.getSize());
        System.out.print("Isi Koleksi: ");
        koleksi.showAll();
        System.out.println();

        /*Tampilkan elemen ke-3 */
        System.out.println("Elemen ke-3: "+ koleksi.getIsi(2));
    }
}
