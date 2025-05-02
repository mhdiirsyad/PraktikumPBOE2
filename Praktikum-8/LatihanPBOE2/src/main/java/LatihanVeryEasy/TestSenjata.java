/*Nama file	: TestSenjata.java
* Deskripsi	: main kelas untuk menguji Senjata dan KontrolSenjata
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 02-05-2025
*/
package LatihanVeryEasy;

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
        
        System.out.println("Jumlah peluru AK47: "+ ak47.getPeluru());
        System.out.println("AK47 mengisi peluru");
        ak47.setPeluru(5);
        System.out.println("Jumlah peluru AK47: "+ ak47.getPeluru());
        
        System.out.println("AK47 menembak");
        ak47.menembak();
    }
    
}
