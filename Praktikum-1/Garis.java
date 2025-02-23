/* Nama file    : Garis.java
 * Deskripsi    : Atribut dan Methode Garis
 * Pembuat      : Muhammad Irfan Irsyad / 24060123130085
 * Tanggal      : 23-02-2025
*/
public class Garis {
    /*Atribut */
    Titik awal;
    Titik akhir;
    static int countGaris = 0;

    /*Method */
    /*Konstruktor garis */
    public Garis() {
        awal = new Titik();
        akhir = new Titik(1, 1);
        countGaris ++;
    }

    public Garis(Titik awal, Titik akhir) {
        this.awal = awal;
        this.akhir = akhir;
        countGaris++;
    }

    /*Setter atau mutator */
    /*Mengeset titik awal */
    void setAwal(Titik awal) {
        this.awal = awal;
    }

    /*Mengeset titik AKhir */
    void setAkhir(Titik akhir) {
        this.akhir = akhir;
    }

    /*Getter */
    /*Mengembalikan titik awal */
    Titik getAwalTitik() {
        return this.awal;
    }

    /*Mengembalikan titik akhir */
    Titik getAkhirTitik() {
        return this.akhir;
    }

    /*Megembalikan Banyaknya garis */
    static int getCountGaris() {
        return countGaris;
    }

    /*Mengembalikan Panjang garis */
    double panjangGaris() {
        return awal.getJarak(akhir);
    }

    /*Mengembalikan gradien garis */
    double getGradien() {
        return (akhir.getOrdinat()-awal.getOrdinat())/(akhir.getAbsis()-awal.getAbsis());
    }

    /*Mengembalikan titik tengah garis */
    Titik getMidPoint() {
        return new Titik((awal.getAbsis()+akhir.getAbsis())/2, (awal.getAbsis()+akhir.getAbsis())/2);
    }

    /*Mengembalikan true jika kedua garis sejajar */
    boolean isSejajar(Garis G2) {
        return this.getGradien() == G2.getGradien();
    }

    /*Mengembalikan true jika garis saling Tegak Lurus */
    boolean isTegakLurus(Garis G2) {
        return this.getGradien() == G2.getGradien()*-1;
    }

    /*Menampilkan koordinat garis */
    void printGaris() {
        System.out.print("Titik awal\t: ");
        this.awal.printTitik();
        System.out.print("Titik akhir\t: ");
        this.akhir.printTitik();
    }

    /*Menampilkan persamaan garis */
    void printPersamaan() {
        double c = awal.getOrdinat() - getGradien()*awal.getAbsis();
        if (c<0){
            System.out.println("y = " + getGradien() + "x - " + Math.abs(c));
        }else{
            System.out.println("y = " + getGradien() + "x + " + c);
        }
    }
    /*End class Garis */
}
