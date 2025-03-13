/*Nama file	: MBangundatar.java
* Deskripsi	: Main driver Bangun datar
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 13-03-2025
*/

public class MBangundatar {
    public static void main(String[] args) {
        /*Objek Bangun datar */
        BangunDatar A = new BangunDatar();
        A.setJmlSisi(5);
        A.setWarna("Rainbow");
        A.setBorder("Putih");

        /*Objek Persegi */
        Persegi P2 = new Persegi(2, "Merah", "Hitam");

        System.out.println("Info bangundatar");
        A.printInfo();

        System.out.println("Info Persegi P1");
        P2.printInfo();
        System.out.println("Luas persegi\t: "+P2.getLuas());
        System.out.println("Keliling persegi\t: "+P2.getKeliling());
        System.out.println("Diagonal Persegi\t: "+P2.getDiagonal());
        System.out.println("");
        System.out.println("Jumlah objek bangundatar : "+Persegi.countBangunDatar);

        /*Objek Lingkaran */
        Lingkaran C1 = new Lingkaran(14, "Peach", "Ungu");
        System.out.println("Info Lingkaran C1");
        C1.printInfo();
        System.out.println("Luas Lingkaran\t: "+C1.getLuas());
        System.out.println("Keliling Lingkaran\t: "+C1.getKeliling());
        System.out.println("Diameter Lingkaran\t: "+C1.getDiameter());
        Persegi.printCountBangunDatar();
    }
}
