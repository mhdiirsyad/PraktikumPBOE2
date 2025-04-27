/*Nama file	: Polimorfisme.java
* Deskripsi	: Mencoba polimorfisme
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 24-04-2025
*/

public class Polimorfisme {
    public static void main(String[] args) {
        int output1 = 'a';
        System.out.println("output1 = " + output1);
        /*
         * Berhasil, output = 97 (angka biner dari 'a') termasuk coercion karena casting oleh compiler
         */

        // double x = 15.5;
        // int output2 = x;
        // System.out.println("output2 = " + output2);
        /*
         * Error, compiler tidak bisa langsung casting dari double ke int tanpa argumen (int)
         */

        int y = 25;
        double output3 = y;
        System.out.println("output3 = " + output3);
        /*
         * Berhasil output = 25.0, termasuk dalam coercion karena casting oleh compiler
         */

        int z = 78;
        char output4 = (char)z;
        System.out.println("output4 = " + output4);
        /*
         * Berhasil output huruf N, casting secara paksa dengan (char)
         */

        char a = 'a';
        int output5 = a;
        System.out.println("output5 = " + output5);
        /*
         * Berhasil output 97, termasuk casting oleh compiler
         */
    }
}
