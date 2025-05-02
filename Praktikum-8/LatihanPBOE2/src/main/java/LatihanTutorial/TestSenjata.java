/*Nama file	: TestSenjata.java
* Deskripsi	: main kelas untuk menguji Senjata dan KontrolSenjata
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 02-05-2025
*/
package LatihanTutorial;


public class TestSenjata {
    public static void main(String[] args) {
        Senjata ak47 = new Senjata("TAR");
        Senjata m16 = new Senjata("DOR");
        
        System.out.print("AK47 menembak 3x: "); ak47.menembak(3);
        System.out.print("M16 menembak 1x: "); m16.menembak(1);
        
        System.out.println("AK47 menusuk: " + ak47.menusuk());
        ak47.pasangBayonet();
        System.out.println("AK47 menusuk: " + ak47.menusuk());
    }
}
