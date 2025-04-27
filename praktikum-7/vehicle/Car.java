/*Nama file	: Car.java
* Deskripsi	: subclass Car dari Vehicle
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 24-04-2025
*/

public class Car extends Vehicle{
    @Override
    public void calRent(int jarak, int harga){
        float fare = jarak*harga;
        fare = fare - 100.00f;
        System.out.println("Harga sewa mobil = "+ fare);
    }
}
