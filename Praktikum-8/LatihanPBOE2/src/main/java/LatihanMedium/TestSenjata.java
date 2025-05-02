/*Nama file	: TestSenjata.java
* Deskripsi	: main kelas untuk menguji Senjata dan KontrolSenjata
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 02-05-2025
*/
package LatihanMedium;

/**
 *
 * @author Irsyad
 */
public class TestSenjata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Senjata ak47 = new Senjata("TAR");
        Senjata m16 = new Senjata("DOR");
        KontrolSenjata kontrolAK47 = new KontrolSenjata(ak47);
        KontrolSenjata kontrolM16 = new KontrolSenjata(m16);
        
        kontrolAK47.menembak(2);
        kontrolAK47.isiPeluru(3);
        kontrolAK47.menembak(5);
        
        System.out.println("==============================");
        
        kontrolM16.menembak(1);
        kontrolM16.isiPeluru(5);
        kontrolM16.menembak(2);
    }
    
}
