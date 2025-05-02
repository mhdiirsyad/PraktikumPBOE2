/*Nama file	: Senjata.java
* Deskripsi	: class Senjata yang berisi atribut dan metode senjata
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 02-05-2025
*/
package LatihanVeryEasy;

/**
 *
 * @author Irsyad
 */
public class Senjata {
    private String bunyi;
    private int peluru;

    public Senjata(String bunyi) {
        this.bunyi = bunyi;
        this.peluru = 0;
    }

    public String getBunyi() {
        return bunyi;
    }

    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }

    public int getPeluru() {
        return peluru;
    }

    public void setPeluru(int peluru) {
        this.peluru = peluru;
    }
    
    public void menembak(){
        if (getPeluru() > 0){
            int sisa = getPeluru() - 1;
            System.out.println(getBunyi());
            System.out.println("Sisa Peluru: " + sisa);
        }else{
            System.out.println("Peluru Habis");
        }
    }
}
