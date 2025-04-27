/*Nama file	: Programmer.java
* Deskripsi	: Kelas Programmer yang merupakan subclass dari kelas pegawai
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 24-04-2025
*/

public class Programmer extends Pegawai{
    private int bonus = 450000;

    public Programmer(String nama){
        setNama(nama);
    }
    @Override
    public void tampilData(){
        super.tampilData();
        System.out.println("Bonus : "+bonus);
    }
}
