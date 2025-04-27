/*Nama file	: Vehicle.java
* Deskripsi	: superclass Vehicle
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 24-04-2025
*/

public class Vehicle {
    public void calRent(int distance, int price){
        float fare = distance*price;
        System.out.println("vehicle fare = "+ fare);
    }

    public static void hargaSewa(Vehicle v){
        v.calRent(50, 1000);
    }
}
