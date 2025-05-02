/*Nama file	: DatumGenericTest.java
* Deskripsi	: Main class untuk menguji class DatumGeneric
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 02-05-2025
*/
package Tugas;

public class DatumGenericTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Anjing A;
        Datum <Anabul> anu = new Datum<>();
        A = new Anjing("Bob");
        anu.setIsi(A);
        System.out.println(">> "+anu.getIsi().getNama());
        anu.getIsi().Gerak();
        anu.getIsi().Bersuara();
        System.out.println();
        
        anu.setIsi(new Kucing("Alpine"));
        System.out.println(">> "+anu.getIsi().getNama());
        anu.getIsi().Gerak();
        anu.getIsi().Bersuara();
        System.out.println();
        
        anu.setIsi(new Burung("Bubun"));
        System.out.println(">> "+anu.getIsi().getNama());
        anu.getIsi().Gerak();
        anu.getIsi().Bersuara();
    }
    
}
