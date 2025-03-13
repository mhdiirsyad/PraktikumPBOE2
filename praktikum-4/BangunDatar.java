/*Nama file	: BangunDatar.java
* Deskripsi	: Superclass bangun datar (atribut dan methode)
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 13-03-2025
*/

public class BangunDatar {
    protected int jmlSisi;
    protected String warna;
    protected String border;
    protected static int countBangunDatar=0;

    /*METODE */
    //konstruktor
    public BangunDatar() {
        countBangunDatar++;
    }

    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        countBangunDatar++;
    }

    //Setter atau Mutator
    //Mengeset jmlSisi
    public void setJmlSisi(int jmlSisi){
        this.jmlSisi = jmlSisi;
    }

    //Mengeset Warna
    public void setWarna(String warna) {
        this.warna = warna;
    }

    //Mengeset Border
    public void setBorder(String border) {
        this.border = border;
    }

    //Getter
    //Mengembalikan jumlah sisi
    public int getJmlSisi() {
        return jmlSisi;
    }

    //Mengembalikan warna bangun datar
    public String getWarna() {
        return warna;
    }

    //Mengembalikan border bangun datar
    public String getBorder() {
        return border;
    }

    //Menampilkan info bangun datar
    public void printInfo() {
        System.out.println("Jumlah sisi\t: " + jmlSisi);
        System.out.println("Warna\t: " + warna);
        System.out.println("Border\t: " + border);
    }

    public static void printCountBangunDatar() {
        System.out.println("Jumlah objek bangun datar : "+countBangunDatar);
    }
    /*End class bangun datar */
}
