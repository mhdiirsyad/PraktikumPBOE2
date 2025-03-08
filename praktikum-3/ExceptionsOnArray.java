/*Nama file	: ExceptionsOnArray.java
* Deskripsi	: Program penggunaan eksepsi menggunakan class library java
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 06-03-2025
*/

public class ExceptionsOnArray {
    public static void main(String[] args) {
        Integer[] arrayInteger = new Integer[4];
        try{
            arrayInteger[2] = 11;
            System.out.println(arrayInteger[1]);
            arrayInteger[5] = 12;
            arrayInteger[3] = 10;
        }catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        }finally{
            System.out.println("Clean up code...");
        }
    }
}
