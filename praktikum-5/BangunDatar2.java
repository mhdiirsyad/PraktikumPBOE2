/*Nama file	: BangunDatar2.java
* Deskripsi	: atribut dan metode kelas abstrak BangunDatar
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 20-03-2025
*/

public abstract class BangunDatar2 {
    protected int jmlSisi;
    protected String warna;
    protected String border;
    protected static int countBangunDatar=0;

    /*METODE */
    //konstruktor
    protected BangunDatar2() {
        countBangunDatar++;
    }

    protected BangunDatar2(int jmlSisi, String warna, String border) {
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

    //mengembalikan luas bangun datar
    public abstract double getLuas();

    //mengembalikan keliling bangun datar
    public abstract double getKeliling();

    //Menampilkan info bangun datar
    public void printInfo() {
        System.out.println("Jumlah sisi\t: " + jmlSisi);
        System.out.println("Warna\t\t: " + warna);
        System.out.println("Border\t\t: " + border);
    }

    public static void printCountBangunDatar() {
        System.out.println("Jumlah objek bangun datar : "+countBangunDatar);
    }

    //Fungsi untuk membandingkan luas dua bangun datar
    public boolean isLuasEqual(BangunDatar2 X) {
        return this.getLuas() == X.getLuas();
    }

    //Fungsi untuk membandingkan keliling dua bangun datar
    public boolean isKelilingEqual(BangunDatar2 X) {
        return this.getKeliling() == X.getKeliling();
    }
    /*End class bangun datar */
}
