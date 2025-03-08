/*Nama file	: AngkaSialException.java
* Deskripsi	: Exception buatan sendiri, menolak angka 13!!
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 06-03-2025
*/

public class AngkaSialException extends Exception{
    public AngkaSialException() {
        super("Jangan masukkan angka 13 karena angka sial!!");
    }
}
