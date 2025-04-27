/*Nama file	: Manager.java
* Deskripsi	: Kelas manager yang merupakan subclass dari kelas pegawai
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 24-04-2025
*/

public class Manager extends Pegawai {
    private int tunjangan = 700000;

    public Manager(String nama){
        setNama(nama);
    }

    @Override
    public void tampilData(){
        super.tampilData();
        System.out.println("Tunjangan : "+tunjangan);
    }
}
