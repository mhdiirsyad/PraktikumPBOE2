/*Nama file	: KontrolSenjata.java
* Deskripsi	: class KontrolSenjata untuk mengendalikan senjata
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 02-05-2025
*/
package LatihanMedium;

/**
 *
 * @author Irsyad
 */
public class KontrolSenjata{
    Senjata senjata;

    public KontrolSenjata(Senjata s) {
        this.senjata = s;
    }
    
    public boolean isAdaPeluru() {
        return senjata.getPeluru() > 0;
    }
    
    public void isiPeluru(int jumPeluru) {
        senjata.setPeluru(senjata.getPeluru() + jumPeluru);
        System.out.println(">> Peluru berhasil ditambah: "+ jumPeluru);
    }
    
    public void menembak(int jumlah) {
        System.out.println(">> Siap menembak "+jumlah+" kali");
        if ( isAdaPeluru() ){
            for (int i = 0; i<jumlah; i++){
                if(isAdaPeluru()){
                    System.out.println(senjata.getBunyi());
                    senjata.setPeluru(senjata.getPeluru()-1);
                }else{
                    System.out.println("Gagal tembak, peluru habis");
                }
            }
            System.out.println(">> Peluru sisa: "+senjata.getPeluru());
        }else{
            System.out.println("Peluru Habis");
        }
    }
    
    public String menusuk(){
        if( senjata.isMenusuk() ){
            return "Jleb!";
        }else{
            return "Gagal, belum pasang Bayonet";
        }
    }
    
    public void pasangBayonet() {
        senjata.setMenusuk(true);
        System.out.println("Bayonet Terpasang");
    }
}
