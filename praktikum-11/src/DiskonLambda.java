/*Nama file	: DiskonLambda.java
* Deskripsi	: Ekspresi lambda dasar, digunakan untuk menghitung diskon
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 05-06-2025
*/

interface IDiskon {
    public double hitungDiskon(double harga);
}

public class DiskonLambda {
    public static void main(String[] args) {
        IDiskon diskonMerdeka = new IDiskon() {
            @Override
            public double hitungDiskon(double harga) {
                return harga - (harga*0.3);
            }
        };

        IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);

        IDiskon diskonBiasa = (harga) -> {
            return harga - (harga * 0.1);
        };

        System.out.println("Diskon Merdeka: " + diskonMerdeka.hitungDiskon(45000));
        System.out.println("Diskon Lebaran: " + diskonLebaran.hitungDiskon(45000));
        System.out.println("Diskon Biasa: " + diskonBiasa.hitungDiskon(45000));
    }
}

