/* Nama file    : MGaris.java
 * Deskripsi    : Main dari class Garis
 * Pembuat      : Muhammad Irfan Irsyad / 24060123130085
 * Tanggal      : 23-02-2025
*/
public class MGaris {
    public static void main(String[] args) {
        Garis G1 = new Garis();
        System.out.println("Koordinat Garis G1\t");
        G1.printGaris();
        
        Titik X = new Titik();
        Titik Y = new Titik(2, -7);
        G1.setAkhir(X);
        G1.setAwal(Y);
        System.out.println("Update Garis G1\t ");
        G1.printGaris();
        
        Titik A = new Titik(-2, -5);
        Titik B = new Titik(6, 1);
        Garis G2 = new Garis(A, B);
        System.out.println("Koordinat Garis G2\t");
        G2.printGaris();

        System.out.print("Titik Awal G2\t: ");
        G2.getAwalTitik().printTitik();
        System.out.print("Titik Akhir G2\t: ");
        G2.getAkhirTitik().printTitik();
        System.out.println("Jumlah Garis\t: "+Garis.getCountGaris());

        System.out.println("Panjang garis G2 : "+G2.panjangGaris());
        System.out.println("Gradien garis G2 : "+G2.getGradien());
        System.out.print("Midpoint G2 : ");
        G2.getMidPoint().printTitik();

        if (G1.isSejajar(G2)) {
            System.out.println("Garis Sejajar");
        }else if (G1.isTegakLurus(G2)) {
            System.out.println("Garis Tegak Lurus");
        }else{
            System.out.println("Garis tidak sejajar maupun tegak lurus");
        }
        System.out.println("Persamaan garis G2 : ");
        G2.printPersamaan();
    }
}
