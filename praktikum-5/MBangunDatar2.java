/*Nama file	: MBangundatar2.java
* Deskripsi	: Main program bangun datar
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 20-03-2025
*/

public class MBangunDatar2 {
    public static void main(String[] args) {
        //BangunDatar2 B1 = new BangunDatar2(); //eror karena BangunDatar2 merupakan kelas abstrak
        BangunDatar2 P1 = new Persegi2(10.0, "Merah", "Hitam");
        Persegi2 P2 = new Persegi2(5.0, "Biru", "Putih");
        BangunDatar2 L1 = new Lingkaran2(7.0, "Hijau", "Kuning");
        Lingkaran2 L2 = new Lingkaran2(14.0, "Kuning", "Hijau");

        //Informasi objek Persegi
        System.out.println("Persegi 1");
        P1.printInfo();
        System.out.println();
        System.out.println("Persegi 2");
        P2.printInfo();
        System.out.println();

        //Informasi objek Lingkaran
        System.out.println("Lingkaran 1");
        L1.printInfo();
        System.out.println();
        System.out.println("Lingkaran 2");
        L2.printInfo();
        System.out.println();

        //Membandingkan luas dan keliling persegi
        System.out.println("Perbandingan Luas dan Keliling Persegi");
        System.out.println("Luas Persegi 1 = Luas Persegi 2? : " + P1.isLuasEqual(P2));
        System.out.println("Keliling Persegi 1 = Keliling Persegi 2? : " + P1.isKelilingEqual(P2));
        System.out.println();

        //Membandingkan luas dan keliling lingkaran
        System.out.println("Perbandingan Luas dan Keliling Lingkaran");
        System.out.println("Luas Lingkaran 1 = Luas Lingkaran 2? : " + L1.isLuasEqual(L2));
        System.out.println("Keliling Lingkaran 1 = Keliling Lingkaran 2? : " + L1.isKelilingEqual(L2));
        System.out.println();

        //Zoom in dan zoom out persegi
        System.out.println("Sebelum zoom");
        System.out.println("Sisi persegi\t: "+P2.getSisi());
        System.out.println("Jari Lingkaran\t: "+L2.getJariJari());
        System.out.println();
        
        //Implementasi methode IResize
        P2.zoomIn(); //Menambah ukuran persegi 10%
        L2.zoomOut(); //Mengurangi ukuran lingkaran 10%;
        
        System.out.println("Setelah zoom");
        System.out.println("Sisi persegi\t: "+P2.getSisi());
        System.out.println("Jari Lingkaran\t: "+L2.getJariJari());
        System.out.println();
        
        //Menggunakan zoom untuk mengubah ukuran sesuai input
        P2.zoom(50); //Mengubah ukuran persegi menjadi 50%
        L2.zoom(200); //Mengubah ukuran lingkaran menjadi 200%
        
        System.out.println("Setelah zoom");
        System.out.println("Sisi persegi\t: "+P2.getSisi());
        System.out.println("Jari Lingkaran\t: "+L2.getJariJari());
        System.out.println();
    }
}
