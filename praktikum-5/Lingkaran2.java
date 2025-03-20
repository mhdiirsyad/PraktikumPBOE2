/*Nama file	: Lingkaran2.java
* Deskripsi	: Atribut dan Metode lingkaran dan implementasi IResize
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 20-03-2025
*/

public class Lingkaran2 extends BangunDatar2 implements IResize {
    private double jariJari;

    //Konstruktor
    public Lingkaran2() {
        setJmlSisi(1);
    }

    public Lingkaran2(double jariJari, String warna, String border) {
        this.jariJari = jariJari;
        this.warna = warna;
        this.border = border;
        setJmlSisi(1);
    }

    //Setter
    //Mengeset jari-jari lingkaran
    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    //Getter
    //Mengembalikan jari-jari lingkaran
    public double getJariJari() {
        return jariJari;
    }

    @Override
    //Menghitung dan mengembalikan luas lingkaran
    public double getLuas() {
        return Math.PI*jariJari*jariJari;
    }

    @Override
    //Menghitung dan mengembalikan keliling lingkaran
    public double getKeliling() {
        return 2*Math.PI*jariJari;
    }

    //Menghitung dan mengembalikan diameter lingkaran
    public double getDiameter() {
        return 2*jariJari;
    }

    //Override fungsi printinfo
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari-jari\t: "+this.jariJari);
        System.out.println("Luas\t\t: "+this.getLuas());
        System.out.println("Keliling\t: "+this.getKeliling());
        System.out.println("Diameter\t: "+this.getDiameter());
    }

    //Procedure implementasi interface IResize
    //Menambah ukuran 10% lebih besar
    @Override
    public void zoomIn() {
        jariJari = jariJari*1.1;
    }

    //Mengurangi ukuran 10% lebih kecil
    @Override
    public void zoomOut() {
        jariJari = jariJari*0.9;
    }

    //Menskalakan objek sesuai dengan input percent
    @Override
    public void zoom(int percent) {
        jariJari = jariJari * (percent/100.0);
    }
    //End class Lingkaran
    
}
