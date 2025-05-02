/*Nama file	: Persegi.java
* Deskripsi	: Subclass persegi
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 13-03-2025
*/

public class Persegi extends BangunDatar2 {
    /*ATRIBUT */
    private double sisi;

    /*METODE */
    //Konstruktor
    public Persegi(){
        setJmlSisi(4);
    }

    public Persegi(double sisi, String warna, String border) {
        // super(4, warna, border);
        this.sisi = sisi;
        this.jmlSisi = 4;
        this.warna = warna;
        this.border = border;
        // setWarna(warna);
        // setBorder(border);
        // setJmlSisi(4);
    }

    //Setter
    //Mengeset sisi persegi
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    //Getter
    //Mengembalikan sisi persegi
    public double getSisi() {
        return sisi;
    }

    //Menghitung dan mengembalikan luas persegi
    public double getLuas() {
        return sisi*sisi;
    }

    //Menghitung dan mengembalikan keliling persegi
    public double getKeliling() {
        return 4*sisi;
    }

    //Menghitung dan mengembalikan diagonal persegi
    public double getDiagonal() {
        return Math.sqrt(2*sisi*sisi);
    }

    //Override fungsi printinfo
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi\t: "+this.sisi);
    }

    // @Override
    // public static void printCountBangunDatar() {
    //     super.printCountBangunDatar();
    // }

    //End class persegi
}
