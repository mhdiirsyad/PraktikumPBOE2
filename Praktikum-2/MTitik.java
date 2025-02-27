/* Nama File : MTitik.java
 * Deskripsi : Main untuk class titik
 * Pembuat   : Muhammad Irfan Irsyad
 * Tanggal   : 20-02-2025
 */

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik(); 
        T1.setAbsis(-1);
        T1.setOrdinat(1);
        System.out.print("Koordinat Titik 1 : ");
        T1.printTitik();
        T1.Geser(4, 3);
        System.out.print("Titik 1 setelah digeser : ");
        T1.printTitik();
        
        Titik T2 = T1;
        System.out.print("Koordinat Titik 2 : ");
        T2.printTitik();
        T2.setAbsis(10);
        T2.setOrdinat(10);
        System.out.print("Titik 2 setelah digeser : ");
        T2.printTitik();
        System.out.print("Titik 1 sekarang : ");
        T1.printTitik();

        Titik T3 = new Titik(6, 8);
        System.out.print("Koordinat titik 3 : ");
        T3.printTitik();

        System.out.println("Jumlah Objek Titik : " + Titik.getTitikCounter());

        System.out.println("Jumlah Objek Titik : " + T3.getTitikCounter());

        System.out.println("Kuadran Titik 1 : " + T1.getKuadran());
        System.out.println("Jarak Titik 3 ke pusat : " + T3.getJarakPusat());
        System.out.println("Jarak Titik 3 ke Titik 1 : " + T3.getJarak(T1));

        T3.refleksiX();
        System.out.print("Titik 3 setelah refleksi thp sbX : ");
        T3.printTitik();
        T3.refleksiY();
        System.out.print("Titik 3 setelah refleksi thp sbY : ");
        T3.printTitik();
        
        Titik T2x = T3.getRefleksiX();
        System.out.print("Titik baru setelah refleksi thp sbX : ");
        T2x.printTitik();
        Titik T2y = (T3.getRefleksiY());
        System.out.print("Titik baru setelah refleksi thp sbY : ");
        T2y.printTitik();
    }
}
