/*Nama file	: ArrayListTest.java
* Deskripsi	: Kelas untuk menguji ArrayList
* Pembuat	: Muhammad Irfan Irsyad / 24060123130085
* Tanggal	: 10-05-2025
*/

package collection_generic;
import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Praktikum");
        strings.add("collection");
        strings.add("and generics");

        strings.remove("Praktikum");

        for (String s : strings) {
            System.out.print(s+ " ");
        }
    }
}
