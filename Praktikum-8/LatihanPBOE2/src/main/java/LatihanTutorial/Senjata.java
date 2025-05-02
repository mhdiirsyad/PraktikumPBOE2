/*Nama file	: Senjata.java
* Deskripsi	: class Senjata yang berisi atribut dan metode senjata
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 02-05-2025
*/
package LatihanTutorial;

/**
 *
 * @author Irsyad
 */
public class Senjata {
    private String bunyi;
    private boolean menusuk;

    public Senjata(String bunyi) {
        this.bunyi = bunyi;
    }

    public String getBunyi() {
        return bunyi;
    }

    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }

    public boolean isMenusuk() {
        return menusuk;
    }

    public void setMenusuk(boolean menusuk) {
        this.menusuk = menusuk;
    }

    public void menembak(int jumlah) {
        for( int i=0; i<jumlah; i++ ){
            System.out.print(getBunyi() + " ");
        }
        System.out.println();
    }
    
    public void pasangBayonet() {
        setMenusuk(true);
        System.out.println("Bayonet Terpasang");
    }
    
    public String menusuk() {
        if(isMenusuk()){
            return "Jleb!";
        }else{
            return "Gagal, belum pasang Bayonet";
        }
    }   
}
