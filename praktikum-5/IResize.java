/*Nama file	: IResize.java
* Deskripsi	: Interface IResize untuk mengubah ukurna bangun datar
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 20-03-2025
*/

public interface IResize {
    //Menambah ukuran 10% lebih besar
    public void zoomIn();

    //Mengurangi ukuran 10% lebih kecil
    public void zoomOut();

    //Menskalakan objek sesuai dengan input percent
    public void zoom(int percent);
}
