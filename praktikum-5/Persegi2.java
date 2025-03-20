/*Nama file	: Persegi2.java
* Deskripsi	: Atribut dan metode kelas persegi dan mengimplementasikan Interface IResize
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 20-03-2025
*/

public class Persegi2 extends BangunDatar2 implements IResize {
    /*ATRIBUT */
    private double sisi;

    /*METODE */
    //Konstruktor
    public Persegi2(){
        setJmlSisi(4);
    }

    public Persegi2(double sisi, String warna, String border) {
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

    @Override
    //Menghitung dan mengembalikan luas persegi
    public double getLuas() {
        return sisi*sisi;
    }

    @Override
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
        System.out.println("Sisi\t\t: "+this.sisi);
        System.out.println("Luas\t\t: "+this.getLuas());
        System.out.println("Keliling\t: "+this.getKeliling());
        System.out.println("Diagonal\t: "+this.getDiagonal());
    }

    //Procedure implementasi interface IResize
    //Menambah ukuran 10% lebih besar
    @Override
    public void zoomIn() {
        sisi = sisi * 1.1;
    }

    //Mengurangi ukuran 10% lebih kecil
    @Override
    public void zoomOut() {
        sisi = sisi * 0.9;
    }

    //Menskalakan objek sesuai dengan input percent
    @Override
    public void zoom(int percent) {
        sisi = sisi * (percent / 100.0);
    }
    // @Override
    // public static void printCountBangunDatar() {
    //     super.printCountBangunDatar();
    // }

    //End class persegi
}
