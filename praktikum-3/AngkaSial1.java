/*Nama file	: AngkaSial1.java
* Deskripsi	: program penggunaan exception buatan sendiri && pengenalan kalusa throw dan throws
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 06-03-2025
*/

public class AngkaSial1 {
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka +" Bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial1 as =  new AngkaSial1();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            System.out.println(ase.getMessage());
            System.out.println("Hati-hati kalau memasukkan angka!!");
        }
    }
}

/*Baris ke 12 tidak akan di eksekusi ketika terjadi eksepsi karena eksepsi dilempar ke AngkaSialException dan program terminate.
/*Baris ke catch(AngkaSialExecption ase) dijalankan karena terjadi eksepsi pada statement as.cobaAngka(13) dan kesalahan tersebut dilempar ke AngkaSialExeception */