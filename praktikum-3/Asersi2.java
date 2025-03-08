/*Nama file	: Asersi2.java
* Deskripsi	: Program untuk demo asersi, menolak input jari-jari lingkaran bernilai 0
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 06-03-2025
*/

class Lingkaran {
    private double r;
    public Lingkaran(double r){
        this.r = r;
    }

    public double hitungKeliling(){
        double Keliling = 2*Math.PI*r;
        return Keliling;
    }
}

public class Asersi2 {
    public static void main(String[] args) {
        double r = 0;
        assert (r>0): "Jari-jari tidak boleh 0!!";
        Lingkaran C1 = new Lingkaran(r);
        double Keliling = C1.hitungKeliling();
        System.out.println("Keliling Lingkaran = "+Keliling);
    }
}

/*
 * Secara konsep penggunaan asersi adalah untuk debugging bukan untuk validasi. Pada class asersi2 diatas asersi digunakan untuk validasi jari-jari harus lebih dari 0. Jika hanya untuk validasi seharusnya bisa menggunakan kondisional (if..else).
 */
