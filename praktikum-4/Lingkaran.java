/*Nama file	: Lingkaran.java
* Deskripsi	: Subkclass lingkaran
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 13-03-2025
*/

public class Lingkaran extends BangunDatar {
    /*ATRIBUT */
    public double jari;

    /*METODE */
    //Konstruktor
    public Lingkaran() {
        setJmlSisi(1);
    }

    public Lingkaran(double diameter, String warna, String border) {
        // super(1, warna, border);
        this.jari = diameter/2;
        this.jmlSisi = 1;
        this.warna = warna;
        this.border = border;
        // setWarna(warna);
        // setBorder(border);
        // setJmlSisi(1);
    }

    //Setter
    //Mengeset jari-jari lingkaran
    public void setJari(double jari) {
        this.jari = jari;
    }

    //Getter
    //Mengembalikan jari-jari lingkaran
    public double getJari() {
        return jari;
    }

    //Mengembalikan luas lingkaran
    public double getLuas() {
        return Math.PI*jari*jari;
    }

    //Mengembalikan keliling lingkaran
    public double getKeliling() {
        return 2*Math.PI*jari;
    } 

    //Mengembalikan diameter
    public double getDiameter() {
        return 2*jari;
    }

    //Override fungsi printinfo
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari\t: "+this.jari);
    }

    // @Override
    // public static void printCountBangunDatar() {
    //     super.printCountBangunDatar();
    // }

    /*End class Lingkaran */
}
