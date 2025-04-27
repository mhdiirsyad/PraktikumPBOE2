/*Nama file	: Sewa.java
* Deskripsi	: Main sewa kendaraan
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 24-04-2025
*/

public class Sewa {
    public static void main(String[] args) {
        Vehicle kendaraan = new Vehicle();
        Vehicle mobil = new Car();
        Vehicle bis  = new Bus();

        kendaraan.calRent(50, 1000);
        mobil.calRent(50, 1000);
        bis.calRent(50, 1000);
        
        Vehicle.hargaSewa(kendaraan);
        Vehicle.hargaSewa(mobil);
        Vehicle.hargaSewa(bis);
    }
}
