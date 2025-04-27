/*Nama file	: TestPolimorfisme.java
* Deskripsi	: main class dari kelas Pegawai, Manager, dan programmer
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 24-04-2025
*/
import java.util.ArrayList;

public class TestPolimorfisme {
    public static void main(String[] args) {
        Pegawai pegawai = new Programmer("Mira");
        Pegawai pegawai2 = new Manager("Joko");
        Manager pegawai3 = new Manager("Argo");

        ArrayList<Pegawai> emps = new ArrayList<>();
        emps.add(pegawai);
        emps.add(pegawai2);
        emps.add(pegawai3);

        for (Pegawai emp : emps){
            emp.tampilData();
        }
    }
}

// 2. manfaat polimorfisme dari kasus ini adalah untuk memudahkan kita dalam mengelola objek dari kelas yang berbeda namun memiliki hubungan pewarisan. Dengan menggunakan polimorfisme, kita dapat menyimpan objek dari kelas yang berbeda dalam satu array list dan memanggil metode yang sama pada setiap objek tersebut tanpa perlu mengetahui tipe spesifik dari objek tersebut. Hal ini membuat kode lebih fleksibel dan mudah untuk diperluas di masa depan(reusability).
//3. jika kita tidak menggunakan polimorfisme, kita harus membuat array list terpisah untuk setiap kelas (Pegawai, Manager, Programmer) dan memanggil metode tampilData() secara terpisah untuk setiap objek. Hal ini akan membuat kode lebih rumit dan sulit untuk dikelola, terutama jika ada banyak kelas yang berbeda.